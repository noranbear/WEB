package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/html5")
	public String html5(Model m) {
		m.addAttribute("center","html5");
		return "main";
	}
	
	@RequestMapping("/css3")
	public String css3(Model m) {
		m.addAttribute("center","css3");
		return "main";
	}
	
	@RequestMapping("/js")
	public String js(Model m) {
		m.addAttribute("center","js");
		return "main";
	}
	

}
