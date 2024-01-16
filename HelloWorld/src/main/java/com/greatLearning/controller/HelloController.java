package com.greatLearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // stereotype annotation of @Component
public class HelloController {
	// adding the request mapping --> url
	@RequestMapping("/hello")
	public String giveHelloMsg() {
		return "Hello";
	}
	@RequestMapping("/bye")
	public String giveByeMsg() {
		return "BYE-BYE";
	}
}
