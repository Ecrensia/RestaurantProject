package com.restaurant.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.restaurant.dto.OrderMenuTabDTO;

@Mapper
public interface OrderMapper {

	List<HashMap<String, Object>> searchCanReservOffice(HashMap<String, Object> map);

	List<HashMap<String, Object>> searchSeatMap(HashMap<String, Object> map);

	List<OrderMenuTabDTO> searchMenuHotTab();

	List<OrderMenuTabDTO> searchMenuOtherTab(String mainCategoryCode);

	String searchImgPath(int code);

}
