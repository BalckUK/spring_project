package kh.spring.controller;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@RequestMapping("test")
	private String test() {
		Scanner sc = null;
		sc.nextLine();
		return "home";
	}
}
