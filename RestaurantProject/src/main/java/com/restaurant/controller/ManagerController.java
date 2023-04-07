package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {
	@RequestMapping("/managerLog")
	public String managerIndex() {
		
		return"/managerService/manager_login";
	}
}
