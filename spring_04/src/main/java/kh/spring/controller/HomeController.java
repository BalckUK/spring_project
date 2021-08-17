package kh.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
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

	/*@RequestMapping("output")
	public String toOutput(Model model) throws Exception {
		try {
			List<MessagesDTO> list = mdao.selectAll();
			model.addAttribute("list", list);
		} catch (Exception e) {
			System.out.println("독자적 예외처리 매커니즘 입니다");
		}
		return "message/output";
	}

	@RequestMapping("del")
	public String del(int seq) throws Exception {
		mdao.del(seq);
		return "redirect:/";
	}*/

	@ExceptionHandler
	public String exceptionHandler(Exception e) {
		System.out.println("에러가 발생했습니다");
		return "error";
	}

}
