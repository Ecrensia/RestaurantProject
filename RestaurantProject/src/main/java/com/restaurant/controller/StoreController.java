package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restaurant.service.StoreService;

@Controller
public class StoreController {
	private StoreService storeService;

	public StoreController(StoreService storeService) {
		super();
		this.storeService = storeService;
	}
	@RequestMapping("/store")    //매장찾기
	public String store() {
		return "/store";
	}
	
 
}
