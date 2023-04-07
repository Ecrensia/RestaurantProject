package com.restaurant.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.restaurant.dto.ManagerInfoDTO;
import com.restaurant.mapper.ManagerMapper;

@Service
public class ManagerService {
	private ManagerMapper mapper;
	

	public ManagerService(ManagerMapper mapper) {
		this.mapper = mapper;
	}


	public ManagerInfoDTO managerLogin(String managerId, String managerPW) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("managerId", managerId); 
		map.put("managerPW", managerPW);
		return mapper.managerLogin(map);
	}

}
