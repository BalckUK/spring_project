package kh.spring.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler
	public String exceptionHandler(Exception e) {
		System.out.println("Exception Handler : 에러가 발생했습니다");
		return "error";
	}
	
	@ExceptionHandler
	public String exceptionHandler(NumberFormatException e) {
		System.out.println("NumberFormatException : 에러가 발생했습니다");
		return "error";
	}
	
	@ExceptionHandler
	public String exceptionHandler(NullPointerException e) {
		System.out.println("NullPointerException : 에러가 발생했습니다");
		return "error";
	}
}
