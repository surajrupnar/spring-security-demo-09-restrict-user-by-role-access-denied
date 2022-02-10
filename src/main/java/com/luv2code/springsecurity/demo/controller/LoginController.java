package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		//return "plain-login";
	
		return "fancy-login";
	}
	
	//add mapping for authenticateTheUser for test by Krushna and me not working
	@PostMapping("/authenticateTheUser")
	public String showMyLoginPage1(@RequestBody Object object) {
		System.out.println("ssssssssssssssssssssssssssssssssss");
		return "hin";
	}
	
	//add Mapping for access-denied
	@GetMapping("/access-denied")
	public String showAccessDeniedPage() {
		return "access-denied";
	}
}
