package com.multi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/login_view")
	public ModelAndView login_view(ModelAndView mv) {
		mv.setViewName("login_view");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(ModelAndView mv, String id, String pwd) {
		System.out.println("ID: " + id);
		System.out.println("PW: " + pwd);
		mv.addObject("id", id);
		
		if(id.equals("111") && pwd.equals("111")) {
			mv.setViewName("loginOk");
		}else {
			mv.setViewName("loginFail");
		}
		return mv;
	}
	
	@RequestMapping("/register_view")
	public ModelAndView register_view(ModelAndView mv) {
		mv.setViewName("register_view");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv, String id, String pwd, 
			String name, String sex, String PN, String email) {
		System.out.println("ID: " + id);
		System.out.println("PW: " + pwd);
		System.out.println("Name: " + name);
		System.out.println("Sex: " + sex);
		System.out.println("Phone Number: " + PN);
		System.out.println("Email: " + email);
		if(sex.equals("f")) {
			mv.addObject("n", "Ms. "+ name);
		}else {
			mv.addObject("n", "Mr. "+ name);
		}
		mv.setViewName("registerOk");
		return mv;
	}
	
	@RequestMapping("/product_view")
	public ModelAndView product_view(ModelAndView mv) {
		mv.setViewName("product_view");
		return mv;
	}
}
