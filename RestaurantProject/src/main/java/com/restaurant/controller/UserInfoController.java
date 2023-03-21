package com.restaurant.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restaurant.dto.UserInfoDTO;
import com.restaurant.service.UserInfoService;

@Controller
public class UserInfoController {
	
	private UserInfoService service;
	
	public UserInfoController(UserInfoService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String loginPage() {
		return "main/login_page";
	}
	
	@RequestMapping("/myPage_1")
	public String myPage() {
		return "my_page/myPage_1";
	}
	
	
	@RequestMapping("/login")
	public String login(String id, String passwd,HttpSession session) {
		
		UserInfoDTO dto = service.login(id,passwd);
		session.setAttribute("dto", dto);
		
		
		if(dto != null)
			return "redirect:/main";
		else
			return "redirect:/";
	}
	
	@RequestMapping("/main")
	public String main() {
		return "main/main";
	}
	
	@RequestMapping("/signup1")
	public String signup1() {
		return "signup/signup_1";
	}
	@RequestMapping("/signup2")
	public String signup2() {
		return "signup/signup_2";
		
	}
	@RequestMapping("/signup3")
	public String signup3() {
		return "signup/signup_3";
		
	}
	

}
