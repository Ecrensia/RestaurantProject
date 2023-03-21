package com.restaurant.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.dto.OrderMenuTabDTO;
import com.restaurant.mapper.OrderMapper;

@Service
public class OrderService {
	private OrderMapper orderMapper;
	
	public OrderService(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}

	public List<HashMap<String, Object>> searchCanReservOffice(String reservDate, int searchStartTime, int searchEndTime, String persons) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("date", reservDate);
		map.put("startTime", searchStartTime);
		map.put("endTime", searchEndTime);
		map.put("persons", persons);
		
		return orderMapper.searchCanReservOffice(map);
	}

	public List<HashMap<String, Object>> searchSeatmap(String code, String reservDate, int searchStartTime, int searchEndTime) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("code", code);
		map.put("date", reservDate);
		map.put("startTime", searchStartTime);
		map.put("endTime", searchEndTime);
		
		return orderMapper.searchSeatMap(map);
	}

	public List<OrderMenuTabDTO> searchMenuHotTab() {
		return orderMapper.searchMenuHotTab();
	}

	public List<OrderMenuTabDTO> searchMenuOtherTab(String mainCategoryCode) {
		return orderMapper.searchMenuOtherTab(mainCategoryCode);
	}

	public String searchImgPath(int code) {
		return orderMapper.searchImgPath(code);
	}

}
