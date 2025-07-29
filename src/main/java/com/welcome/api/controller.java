package com.welcome.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vi")
public class controller {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Ashok IT";
	}
}
