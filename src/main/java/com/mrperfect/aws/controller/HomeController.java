package com.mrperfect.aws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	
	@GetMapping("/")
	public String home(Model m) {

		m.addAttribute("title", "Home - Smart Contact Manager");

		return "home";
	}
}
