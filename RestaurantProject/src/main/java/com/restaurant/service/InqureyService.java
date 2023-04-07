package com.restaurant.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.dto.InqureyDTO;
import com.restaurant.dto.InqureyWriteDTO;
import com.restaurant.mapper.InqureyMapper;

@Service
public class InqureyService {
	private InqureyMapper mapper;
	
	public InqureyService(InqureyMapper mapper) {
		this.mapper = mapper;
	}

	public List<HashMap<String, Object>> viewInqureyList(int pageNo, String search) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("pageNo", pageNo);
		map.put("search", search);
		
		return mapper.viewInqureyList(map);
	}

	public int selectInqureyList() {
		return mapper.selectInqureyList();
	}

	public void updateInqureyCount(int inqureyNo) {
		mapper.updateInqureyCount(inqureyNo);
		
	}

	public InqureyDTO selectInqurey(int inqureyNo) {
		return mapper.selectInqurey(inqureyNo);
	}

//	public int insertBoard(InqureyDTO dto) {
//		int inqureyNo = mapper.selectInqureyBoard();
//		dto.setInqureyNo(inqureyNo);
//		mapper.insertBoard(dto);
//		return inqureyNo;
//	}

	public int selectInqureyBoard() {
		return mapper.selectInqureyBoard();
	}

	public int inqureyWriteAdd(InqureyWriteDTO dto) {
		return mapper.inqureyWriteAdd(dto);
	}




	
	
}
