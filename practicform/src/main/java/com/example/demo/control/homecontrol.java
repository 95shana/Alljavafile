package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class homecontrol {

	@GetMapping("/")
	public String nnnn() {
		return "input1.html";
		
	}
}
