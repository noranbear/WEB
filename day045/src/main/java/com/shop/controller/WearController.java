package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WearController {

	@RequestMapping("/wear")
	public String wear(Model m) {
		m.addAttribute("center", "wear");
		return "main";
	}
	
	@RequestMapping("/wear1")
	public String wear1(Model m) {
		m.addAttribute("center", "wear");
		m.addAttribute("scenter", "wear/wear1");
		return "main";
	}
	
	@RequestMapping("/wear2")
	public String wear2(Model m) {
		m.addAttribute("center", "wear");
		m.addAttribute("scenter", "wear/wear2");
		return "main";
	}
	
	@RequestMapping("/wear3")
	public String wear3(Model m) {
		m.addAttribute("center", "wear");
		m.addAttribute("scenter", "wear/wear3");
		return "main";
	}
}
