package com.multi.controller;
// AJAX 데이터 전송만

import java.util.Date;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// ajax의 요청만 처리
@RestController	// 서버에 앱을 요청하면 데이터만 전송
public class AJAXController {
	
	/*
	 * AJAX Controller for aj04
	 */
	@RequestMapping("/checkId")
	public Object checkId(String id) {
		String result = "";
		// if the username is aleady exists in DB (for now, it's fake.),
		// return 0, else return 1.
		if(id.equals("aaa") || id.equals("bbb") || id.equals("ccc")) {
			result = "0";
		}else {
			result = "1";
		}
		return result;
	}
	
	/*
	 * AJAX Controller for aj03
	 */
	@RequestMapping("/checkid")
	public Object checkid(String id) {
		// 가상 id 검사
		String result = "";
		// id가 db에 존재할 때
		if(id.equals("aaaa") || id.equals("bbbb") || id.equals("cccc")) {
			result = "0";
		}else {
			result = "1";
		}
		return result;
	}
	
	@RequestMapping("/gettime")
	public Object gettime() {
		Date d = new Date();
		return "서버시간: "+ d.toString();
	}
	
	@RequestMapping("/search")
	public Object search(String s) {
		String data = "";
		if(s.equals("a")) {
			data = "주식에 관심";
		}else if(s.equals("b")) {
			data = "햄버거에 관심";
		}else {
			data = "밥에 관심";
		}
		return data;
	}
	
	@RequestMapping("/getdata")
	public Object getdata() {
		JSONArray a = new JSONArray();
		Random ran = new Random();
		int an = ran.nextInt(50)+1;
		// [{},{},...] JSON
		for(int i=0; i<6; i++) {
			JSONObject jo = new JSONObject();
			jo.put("id", "id0"+i);
			jo.put("name", "james"+i);
			jo.put("age", an);
			a.add(jo);
		}
		return a;
	}
	
	@RequestMapping("/getChart")
	public Object getChart() {
		JSONArray j = new JSONArray();
		// [ 10, 20, 30,..]
		for(int i=0; i < 15; i++) {
			Random ran = new Random();
			int data = ran.nextInt(50)+1;
			j.add(data);
		}
		return j;
	}
	
	@RequestMapping("/getmarkers")
	public Object getmakers(String loc) {
		JSONArray ja = new JSONArray();
		if(loc.equals('s')) {
			JSONObject jo1 = new JSONObject();
			jo1.put("content", "<div>서울1</div>");
			jo1.put("lat", 37.55151692365908);
			jo1.put("lng", 126.91147178013711);
			jo1.put("target", "js01");
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("content", "<div>서울2</div>");
			jo2.put("lat", 37.56261692365908);
			jo2.put("lng", 126.92257178013711);
			jo2.put("target", "js02");
			ja.add(jo2);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("content", "<div>서울3</div>");
			jo3.put("lat", 37.57371692365908);
			jo3.put("lng", 126.93367178013711);
			jo3.put("target", "js03");
			ja.add(jo3);
		}else if(loc.equals('k')) {
			JSONObject jo1 = new JSONObject();
			jo1.put("content", "<div>광주1</div>");
			jo1.put("lat", 35.16173425533525);
			jo1.put("lng", 126.88758871719189);
			jo1.put("target", "js01");
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("content", "<div>광주2</div>");
			jo2.put("lat", 35.17173425533525);
			jo2.put("lng", 126.89758871719189);
			jo2.put("target", "js02");
			ja.add(jo2);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("content", "<div>광주3</div>");
			jo3.put("lat", 35.18173425533525);
			jo3.put("lng", 126.90758871719189);
			jo3.put("target", "js03");
			ja.add(jo3);
			
		}else if(loc.equals('b')) {
			JSONObject jo1 = new JSONObject();
			jo1.put("content", "<div>부산1</div>");
			jo1.put("lat", 35.17642453774257);
			jo1.put("lng", 126.91147178013711);
			jo1.put("target", "js01");
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("content", "<div>부산2</div>");
			jo2.put("lat", 35.18642453774257);
			jo2.put("lng", 126.92257178013711);
			jo2.put("target", "js02");
			ja.add(jo2);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("content", "<div>부산3</div>");
			jo3.put("lat", 35.19642453774257);
			jo3.put("lng", 126.93367178013711);
			jo3.put("target", "js03");
			ja.add(jo3);
		}
		return ja;
	}
}
