package com.restaurant.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.dto.FAQDTO;
import com.restaurant.mapper.FAQMapper;

@Service
public class FAQService {
	private FAQMapper mapper;
	
	public FAQService(FAQMapper mapper) {
		this.mapper = mapper;
	}

	public List<HashMap<String, Object>> viewFAQList(int pageNo, String search) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("pageNo", pageNo);
		map.put("search", search);
		
		return mapper.viewFAQList(map);
	}

	public int selectFaqCount() {
		return mapper.selectFaqCount();
	}








}
