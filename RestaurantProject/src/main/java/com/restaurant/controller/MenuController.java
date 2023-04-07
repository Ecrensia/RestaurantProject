package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restaurant.service.MenuService;

@Controller
public class MenuController {	
	private MenuService menuService;
	
	
	
	public MenuController(MenuService menuService) {
		this.menuService = menuService;
	}

	
	@RequestMapping("/menu/all")   		 //전체메뉴
	public String allMenu() {
		
		
		return "menu/full_menu";
	}
	@RequestMapping("/menu/side")  		//사이드
	public String sideMenu() {
		return "menu/side";
	}
	@RequestMapping("/menu/beverage")   //음료
	public String berverage() {
		return "menu/beverage";
	}
	@RequestMapping("/menu/setmenu")   	//셋트메뉴
		public String setMenu() {
		
		return "menu/set_menu";
	}
	@RequestMapping("/menu/popularmenu")   //인기메뉴
		public String popularMenu() {
		
		return "menu/popular_menu";
		
	}
	@RequestMapping("/menu/detailedmenu")
		public String detailedMenu() {
		
		return "menu/detailed_menu";
	}
	
	

}
