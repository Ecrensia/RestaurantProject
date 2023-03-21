package com.restaurant.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.restaurant.dto.UserInfoDTO;
import com.restaurant.mapper.UserInfoMapper;

@Service
public class UserInfoService {
	
	private UserInfoMapper mapper;
	
	public UserInfoService(UserInfoMapper mapper) {
		this.mapper = mapper;
	}

	public UserInfoDTO login(String id, String passwd) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id",id);
		map.put("passwd", passwd);
		return mapper.login(map);
	}

}
