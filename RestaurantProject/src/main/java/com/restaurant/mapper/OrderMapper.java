package com.restaurant.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

	List<HashMap<String, Object>> searchCanReservOffice(HashMap<String, Object> map);

}
