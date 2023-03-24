package com.restaurant.service;

import org.springframework.stereotype.Service;

import com.restaurant.mapper.MenuMapper;

@Service
public class MenuService {
	private MenuMapper menuMapper;

	public MenuService(MenuMapper menuMapper) {
		this.menuMapper = menuMapper;
	}
	
	
}
