package kh.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.MessagesDAO;
import kh.spring.dto.MessagesDTO;

@Controller
public class HomeController {

	@Autowired
	private MessagesDAO mdao;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("input")
	public String toInput() {
		return "message/input";
	}

	/*
	 * @RequestMapping("inputProc") public String inputProc(HttpServletRequest
	 * request) { String writer = request.getParameter("writer"); String message =
	 * request.getParameter("message"); System.out.println(writer + " : "+ message);
	 * return "home"; }
	 */

	@RequestMapping("inputProc")
	public String inputProc(MessagesDTO dto) {
		try {
			int result = mdao.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "redirect:/";
	}

}
