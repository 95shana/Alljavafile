package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String dsks(Model model) {
		model.addAttribute("title", "loginForm");
		return "loginForm";
		
	}
	
	@PostMapping("/send")
	public String dlksslkd(User user, Model model) {
		model.addAttribute("title", "Success page");
		model.addAttribute("data", user);
		return "success";
		
	}

}
