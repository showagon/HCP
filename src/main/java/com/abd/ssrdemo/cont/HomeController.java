package com.abd.ssrdemo.cont;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/user")
public class HomeController {

	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
}
