package com.multi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/register") // 얘가 register
	public void register(String id, String pwd, int age) {
		System.out.println(id+" "+pwd+" "+age);
	}
	
	@RequestMapping("/register2") // register2
	public void register2(String id, String pwd, int age, String birth, String gender, 
			String hobby, String car, String resume, String loginid, int range) {
		System.out.println(id+" "+pwd+" "+age);
		System.out.println(birth+" "+gender+" "+hobby);
		System.out.println(car+" "+resume+" "+loginid+" "+range);
	}
}
