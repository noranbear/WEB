package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/") // 어떠한 요청이 왔는지 기입
	public String main(Model m) {
		
		return "main";
	}
	
	@RequestMapping("/project") 
	public String project(Model m) {
		m.addAttribute("center", "project");
		return "main";
	}
	
	@RequestMapping("/contact") 
	public String contact(Model m) {
		m.addAttribute("center", "contact");
		return "main";
	}
	
	@RequestMapping("/login") 
	public String login(Model m) {
		m.addAttribute("center", "login");
		return "main";
	}
}
