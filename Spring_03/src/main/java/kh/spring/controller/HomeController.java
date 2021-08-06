package kh.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("input")
	public String toInput() {
		return "message/input";
	}
	
	@RequestMapping("inputProc")
	public String inputProc(HttpServletRequest request) {
		String writer = request.getParameter("writer");
		String message = request.getParameter("message");
		System.out.println(writer + " : "+ message);
		return "home";
	}

}
