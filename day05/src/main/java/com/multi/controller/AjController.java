package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjController {
	/* ajax + 화면 처리
	@RequestMapping("/gettime")
	@ResponseBody	// tamplate에서 안 찾고 바로 ajax로 감 - ajController에 있었을 때 필요
	public void gettime(HttpServletResponse rep/* 이 객체를 이용하여 AJAX는 서버에서 데이터를 받음) {
		
		PrintWriter out = null;
		try {
			rep.setCharacterEncoding("UTF-8");	// 한글도 가능하게 변환해줌
			out = rep.getWriter();
			Date d = new Date();
			out.print("서버 Time: " + d.toString());	// 한글 깨짐 - 웹통신 너무 옛날 프로토콜 - 변환해야함
			// out.print(LocalDateTime.now());
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/search")
	public void search(HttpServletResponse rep, String s) {
		PrintWriter out = null;
		String data = "";
		if(s.equals("a")) {
			data = "주식에 관심";
		}else if(s.equals("b")) {
			data = "햄버거에 관심";
		}else {
			data = "밥에 관심";
		}
		try {
			rep.setCharacterEncoding("UTF-8");
			out = rep.getWriter();
			out.print(data);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	@RequestMapping("/ajax")
	public String ajax(Model m) {
		m.addAttribute("center","ajax/center");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj01")
	public String aj01(Model m) {
		m.addAttribute("center","ajax/aj01");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj02")
	public String aj02(Model m) {
		m.addAttribute("center","ajax/aj02");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj03")
	public String aj03(Model m) {
		m.addAttribute("center","ajax/aj03");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/reg")
	public String reg(Model m, String id, String pwd) {
		System.out.println("ID: "+ id);
		System.out.println("PW: "+ pwd);
		m.addAttribute("loginid", id);
		m.addAttribute("center","ajax/loginok");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj04")
	public String aj04(Model m) {
		m.addAttribute("center","ajax/aj04");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/reg04")
	public String reg04(Model m, String name, String pwd, String optr, String sel) {
		System.out.println("Username: "+ name);
		System.out.println("PW: "+ pwd);
		System.out.println("Option: "+ optr);
		System.out.println("Select: "+ pwd);
		m.addAttribute("loginid", name);
		m.addAttribute("center","ajax/loginok");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj05")
	public String aj05(Model m) {
		m.addAttribute("center","ajax/aj05");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj06")
	public String aj06(Model m) {
		m.addAttribute("center","ajax/aj06");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj07")
	public String aj07(Model m) {
		m.addAttribute("center","ajax/aj07");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj08")
	public String aj08(Model m) {
		m.addAttribute("center","ajax/aj08");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj09")
	public String aj09(Model m) {
		m.addAttribute("center","ajax/aj09");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj10")
	public String aj10(Model m) {
		m.addAttribute("center","ajax/aj10");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj11")
	public String aj11(Model m) {
		m.addAttribute("center","ajax/aj11");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj12")
	public String aj12(Model m) {
		m.addAttribute("center","ajax/aj12");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj13")
	public String aj13(Model m) {
		m.addAttribute("center","ajax/aj13");
		m.addAttribute("left", "ajax/left");
		return "main";
	}
}
