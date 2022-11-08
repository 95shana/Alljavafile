package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Homecontroller {

	@GetMapping("/mm")
	public String aahh() {
		return "first1";
		
	}
	
	
}
