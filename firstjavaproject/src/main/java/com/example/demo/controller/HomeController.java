package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String dksk() {
		return "form";
		
	}
	
	@PostMapping("/send")
	public String sendby() {
		return "form2";
	}

}