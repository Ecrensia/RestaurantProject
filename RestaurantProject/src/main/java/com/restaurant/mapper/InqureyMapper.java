package com.restaurant.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.restaurant.dto.InqureyDTO;

@Mapper
public interface InqureyMapper {

	List<HashMap<String, Object>> viewInqureyList(HashMap<String, Object> map);

	int selectInqureyList();

	void updateInqureyCount(int inqureyNo);

	InqureyDTO selectInqurey(int inqureyNo);

}
