package com.restaurant.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.restaurant.dto.InqureyDTO;
import com.restaurant.dto.InqureyWriteDTO;

@Mapper
public interface InqureyMapper {

	List<HashMap<String, Object>> viewInqureyList(HashMap<String, Object> map);

	int selectInqureyList();

	void updateInqureyCount(int inqureyNo);

	InqureyDTO selectInqurey(int inqureyNo);

	int selectInqureyBoard();

	void insertBoard(InqureyDTO dto);

	int inqureyWriteAdd(InqureyWriteDTO dto);

}
