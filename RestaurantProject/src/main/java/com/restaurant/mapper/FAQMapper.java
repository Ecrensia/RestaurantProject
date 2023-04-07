package com.restaurant.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FAQMapper {

	List<HashMap<String, Object>> viewFAQList(HashMap<String, Object> map);

	int selectFaqCount();

}
