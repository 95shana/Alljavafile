package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class HomeCotroller {

	@GetMapping("/gg")
	public String nnn(Model model) {
		model.addAttribute("title", "Login Form");
		return "firstpage";
		
	}
	
	@PostMapping("/send")
	public String mmm(Model model){
		model.addAttribute("title", "SuccessPage");
		return "Success";
		
	}
		
}
