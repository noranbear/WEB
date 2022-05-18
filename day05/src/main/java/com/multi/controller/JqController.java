package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JqController {
	
	@RequestMapping("/registerimpl") 
	// argument name을 html name과 통일 시켜야 하는 구나
	// check box argument 하나만 써도 다수의 값이 들어옴
	public String registerimpl(Model m, String name, String pwd, String ch,
			String optr, String sel) {
		
		System.out.println(name);
		System.out.println(pwd);
		
		if(ch != "") {
			System.out.println(ch);
		}
		if(optr != "") {
			System.out.println(optr);
		}
		if(sel != "") {
			System.out.println(sel);
		}
		
		m.addAttribute("center", "jq/regsuccess");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/register1") 
	public String register1(Model m, String lname, String fname, String email,
			String pwd) {
		System.out.println(lname+" "+fname);
		System.out.println(email);
		System.out.println(pwd);
		
		m.addAttribute("regname", lname+' '+fname);
		
		m.addAttribute("center", "jq/jq042");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/register2") 
	public String register2(Model m, String cnumber, String phone, String email,
			String year, String month, String day, String sex) {
		if(phone != "") {
			System.out.println("("+ cnumber +") "+ phone);
		}
		if(email != "") {
			System.out.println(email);
		}
		
		System.out.println(year +"/"+month +"/"+day);
		System.out.println(sex);

		m.addAttribute("center", "jq/regsuccess");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/loginimpl") 
	public String loginimpl(Model m, String id, String pwd) {
		System.out.println(id+" "+pwd);
		if(id.equals("qq") && pwd.equals("11")) {	// 가상의 아이디 비번
			m.addAttribute("loginid", id);
			m.addAttribute("center", "jq/loginok");
		}else {
			m.addAttribute("center", "jq/loginfail");
		}
		
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq") 
	public String jq(Model m) {
		m.addAttribute("center", "jq/center");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq01") 
	public String jq01(Model m) {
		m.addAttribute("center", "jq/jq01");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq02") 
	public String jq02(Model m) {
		m.addAttribute("center", "jq/jq02");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq03") 
	public String jq03(Model m) {
		m.addAttribute("center", "jq/jq03");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq04") 
	public String jq04(Model m) {
		m.addAttribute("center", "jq/jq04");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq05") 
	public String jq05(Model m) {
		m.addAttribute("center", "jq/jq05");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq06") 
	public String jq06(Model m) {
		m.addAttribute("center", "jq/jq06");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq07") 
	public String jq07(Model m) {
		m.addAttribute("center", "jq/jq07");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq08") 
	public String jq08(Model m) {
		m.addAttribute("center", "jq/jq08");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq09") 
	public String jq09(Model m) {
		m.addAttribute("center", "jq/jq09");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq10") 
	public String jq10(Model m) {
		m.addAttribute("center", "jq/jq10");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq11") 
	public String jq11(Model m) {
		m.addAttribute("center", "jq/jq11");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq12") 
	public String jq12(Model m) {
		m.addAttribute("center", "jq/jq12");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq13") 
	public String jq13(Model m) {
		m.addAttribute("center", "jq/jq13");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq14") 
	public String jq14(Model m) {
		m.addAttribute("center", "jq/jq14");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/jq15") 
	public String jq15(Model m) {
		m.addAttribute("center", "jq/jq15");
		m.addAttribute("left", "jq/left");
		return "main";
	}
}
