package com.restaurant.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.dto.ManagerInfoDTO;
import com.restaurant.service.ManagerService;

@Controller
public class ManagerController {
	private ManagerService managerService;
	
		
	public ManagerController(ManagerService managerService) {
		this.managerService = managerService;
	}

	@RequestMapping("/managerLog")
	public String managerIndex() {
		
		return"/managerService/manager_login";
	}
	
	@RequestMapping("/managerLogin")
	public String managerLogin(String managerId, String managerPW, HttpSession session) {
		
		ManagerInfoDTO dto = managerService.managerLogin(managerId, managerPW);
		session.setAttribute("dto", dto);
		
		
		return"/managerService/manager_welcome";
	}
	
	@RequestMapping("/faqSetting")
	public String managerFAQSetting() {
		
		
		return "/customer_manager/FAQ_setting";
	}
	@RequestMapping("/inqureyList")
	public String inqureyList() {
		
		return null;
	}
}
