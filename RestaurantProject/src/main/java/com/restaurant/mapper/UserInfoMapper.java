package com.restaurant.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.restaurant.dto.UserInfoDTO;

@Mapper
public interface UserInfoMapper {

	UserInfoDTO login(HashMap<String, Object> map);

	String selectIdCheck(String idVal);

	int insertMemberInfo(UserInfoDTO dto);

}
