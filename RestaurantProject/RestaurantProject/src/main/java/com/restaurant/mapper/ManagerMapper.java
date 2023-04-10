package com.restaurant.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.restaurant.dto.ManagerInfoDTO;

@Mapper
public interface ManagerMapper {

	ManagerInfoDTO managerLogin(HashMap<String, Object> map);

}
