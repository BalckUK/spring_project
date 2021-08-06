package kh.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Component의 자식들
//@Controller
//@Service
//@Repository

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/page1", method =  RequestMethod.POST)
	public String toPage1() {
		return "page1";
	}

}
