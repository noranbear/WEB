package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/login")
	public String login(Model m){
		return "llogin";
	}
	
	@RequestMapping("/caccount") 
	public String register(Model m) {
		
		return "caccount";
	}
	
	@RequestMapping("/myaccount") 
	public String myaccount(Model m, String lname, String fname, String email,
			String pwd) {
		System.out.println(lname+" "+fname);
		System.out.println(email);
		System.out.println(pwd);
		
		m.addAttribute("regname", lname+' '+fname);
		
		return "myaccount";
	}
	
	@RequestMapping("/movie")
	public String movie(Model m){
		m.addAttribute("center", "movie/movie");
		return "index";
	}
	
	@RequestMapping("/mission")
	public String mission(Model m){
		m.addAttribute("center", "movie/mission");
		return "index";
	}
}
