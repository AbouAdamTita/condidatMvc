package com.simo.condidat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showLogin() {
		
		return"login";		
	}
	
	@RequestMapping("/login")
	public String showLogintest() {
		
		return"test";
		
		
	}
	@RequestMapping("/index")
	public String showPage() {
		
		return"index";
		
		
	}

}
