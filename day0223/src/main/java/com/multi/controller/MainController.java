package com.multi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	
	@RequestMapping("/") // root로 들어옴 - 127.0.0.1 뒤에 암것도 안 썼을 때
	public ModelAndView main(ModelAndView mv) {
		mv.addObject("w", "Welcome!"); // 서버에서 w라는 이름으로 welcome!이라는 텍스트를 가져와 여기에 넣어줌
		mv.setViewName("main");	// views에서 jsp 찾음 - application에서 suffix .jsp로 지정해둠
		return mv;
		
	}
	
	@RequestMapping("/register_view")
	public ModelAndView register_view(ModelAndView mv) {
		mv.setViewName("register"); // setview를 요청하면 register라는 jsp로 연결해라
		return mv;
	}
	
	@RequestMapping("/login_view")
	public ModelAndView login_view(ModelAndView mv) {
		mv.setViewName("login");
		return mv;
		
	}
	
	@RequestMapping("/register")
	public void register(String LN, String FN, String email, String pwd, String pwd2) {
		System.out.println("Name: "+ LN + FN);
		System.out.println("Email: "+ email);
		System.out.println("PW: "+ pwd);
		if(!(pwd.equals(pwd2))) {
//			mv.addObject("pm", "Thi");
			System.out.println("Passwords aren't matched.");
		}
	}
	
	@RequestMapping("/login")
	public ModelAndView register(ModelAndView mv, String id, String pwd) {
		System.out.println("Id: "+ id);
		System.out.println("PW: "+ pwd);
		mv.addObject("id", id);
		
		if(id.equals("qqq") && pwd.equals("111")) {
			mv.setViewName("loginok");
		}else {
			mv.setViewName("loginfail");
		}
		return mv;
	}
}










