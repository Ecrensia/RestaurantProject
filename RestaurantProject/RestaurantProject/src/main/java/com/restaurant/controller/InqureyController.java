package com.restaurant.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.dto.InqureyDTO;
import com.restaurant.dto.InqureyWriteDTO;
import com.restaurant.service.InqureyService;
import com.restaurant.vo.PaggingVO;

@Controller
public class InqureyController {
	private InqureyService inqureyService;
	
	public InqureyController(InqureyService inqureyService) {
		this.inqureyService = inqureyService;
	}
	 
	@RequestMapping("/inqurey")
	public ModelAndView inqureyView(@RequestParam(name = "pageNo", defaultValue = "1") int pageNo,
			 HttpServletRequest request, @RequestParam(name = "search", defaultValue = "") String search) {
		ModelAndView view  = new ModelAndView();
		List<HashMap<String, Object>> list = inqureyService.viewInqureyList(pageNo,search);
		
		for(HashMap<String, Object> m :list) {
			System.out.println(m.toString());
		}
		
		int count = inqureyService.selectInqureyList();
		PaggingVO pagging = new PaggingVO(count, pageNo, 5);
		
		view.setViewName("inqurey/inqurey");
		view.addObject("list",list);
		view.addObject("pagging", pagging);
		view.addObject("search", search);
		
		return view;
	}
	@RequestMapping("/inqurey/InqureyContent/{inqureyNo}")
	public ModelAndView inqureyView(@PathVariable("inqureyNo") int inqureyNo, HttpSession session) {
		ModelAndView view = new ModelAndView();
		view.setViewName("inqurey/inqurey_table_content");
		
		HashSet<Integer> set = (HashSet<Integer>) session.getAttribute("history");
		if(set == null) {
			set = new HashSet<Integer>();
			session.setAttribute("history", set);
		}
		if(set.add(inqureyNo)) inqureyService.updateInqureyCount(inqureyNo);
		
		InqureyDTO dto = inqureyService.selectInqurey(inqureyNo);
		
		if(dto.getAnswerContent() == null) {
			
		}else {
			
		}
		
		view.addObject("inqurey", dto);
		
		return view;
	}
	
	@RequestMapping("/inqureywrite")
	public String inqureyWrite() {
		
		return "inqurey/inqurey_write";
	}
	//회원테이블 조인 
	@RequestMapping("/inqureywrite/add")	
	public String inqureyWriteAdd(InqureyWriteDTO dto) {
		int inqureyNo = inqureyService.selectInqureyBoard();
		String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		
		dto.setInqureyNo(inqureyNo);
		dto.setInqureyDate(now);
		
		if(dto.getSetPW() == null) {
			dto.setSetPW("N");
			dto.setInqureyPW(null);
		} else {
			dto.setSetPW("Y");
		}
		
		inqureyService.inqureyWriteAdd(dto);
		
		return "redirect:/inqurey";
	}
}
