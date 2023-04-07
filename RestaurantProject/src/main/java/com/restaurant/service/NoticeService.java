package com.restaurant.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.restaurant.dto.NoticeDTO;
import com.restaurant.mapper.NoticeMapper;

@Service
public class NoticeService {
	private NoticeMapper mapper;
	
	public NoticeService(NoticeMapper mapper) {
		this.mapper = mapper;
	}

	public List<HashMap<String, Object>> viewNoticeList(int pageNo, String search) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("pageNo", pageNo);
		map.put("search", search);
		
		return mapper.viewNoticeList(map);
	}

	public int selectNoticeList() {
		return mapper.selectNoticeList();
	}

	public void updateNoticeCount(int noticeNo) {
		mapper.updateNoticeCount(noticeNo);
	}

	public NoticeDTO selectNotice(int noticeNo) {
		return mapper.selectNotice(noticeNo);
	}


}
