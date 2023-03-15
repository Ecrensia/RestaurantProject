package com.restaurant.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restaurant.service.OrderService;

@Controller
public class OrderController {
	private OrderService orderService;
	
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@RequestMapping("/order")
	public String orderPage() {
		return "order/order";
	}
	
	@RequestMapping("/order/search/office")
	public ResponseEntity<String> searchCanReservOffice(Date date, int time, String persons) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String reservDate = sdf.format(date);
		int searchStartTime = time - 99;
		int searchEndTime = 0;
		
		if(time%100 == 0) {
			searchEndTime = time + 59;
		} else {
			searchEndTime = time + 99;
		}
				 
		List<HashMap<String, Object>> list = orderService.searchCanReservOffice(reservDate, searchStartTime, searchEndTime, persons);
		
		for(HashMap<String, Object> t : list) {
			System.out.println(t.toString());
		}
		
		return new ResponseEntity(list, HttpStatus.OK);
	}
}
