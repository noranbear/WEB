package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller	// 자동으로 브라우저에서 요청했을 때 이 클래스가 동작되게 표시
public class MainController {
	// 페이지가 하나니까 이렇게 가능.
	@RequestMapping("/")		// root로 동작시켰을 때 이 메소드가 동작하게 해주세요
	public ModelAndView main(ModelAndView mv) {
		mv.addObject("w", "Welcome!!");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/p105")
	public ModelAndView p105(ModelAndView mv) {
		mv.setViewName("p105");
		return mv;
	}
	
	@RequestMapping("/p135")
	public ModelAndView p135(ModelAndView mv) {
		mv.setViewName("p135");
		return mv;
	}
	
	@RequestMapping("/p139")
	public ModelAndView p139(ModelAndView mv) {
		mv.setViewName("p139");
		return mv;
	}
	
	@RequestMapping("/p159")
	public ModelAndView p159(ModelAndView mv) {
		mv.setViewName("p159");
		return mv;
	}
	
	@RequestMapping("/p189")
	public ModelAndView p189(ModelAndView mv) {
		mv.setViewName("p189");
		return mv;
	}
	
	@RequestMapping("/p192")
	public ModelAndView p192(ModelAndView mv) {
		mv.setViewName("p192");
		return mv;
	}
}
