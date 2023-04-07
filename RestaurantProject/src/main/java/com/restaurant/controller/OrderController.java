package com.restaurant.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.dto.OrderMenuTabDTO;
import com.restaurant.service.OrderService;

@Controller
public class OrderController {
	private OrderService orderService;
	
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@RequestMapping("/order")
	public ModelAndView orderPage() {
		List<OrderMenuTabDTO> hotList = orderService.searchMenuHotTab();
		List<OrderMenuTabDTO> singleList = orderService.searchMenuOtherTab("A1");
		List<OrderMenuTabDTO> setList = orderService.searchMenuOtherTab("A2");
		List<OrderMenuTabDTO> sideList = orderService.searchMenuOtherTab("A3");
		List<OrderMenuTabDTO> beverageList = orderService.searchMenuOtherTab("A4");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("order/order"); 
		mv.addObject("hList", hotList);
		mv.addObject("singleList", singleList);
		mv.addObject("setList", setList);
		mv.addObject("sideList", sideList);
		mv.addObject("beverageList", beverageList);
		
		return mv;
	}
	 
	@RequestMapping("/order/search/office")
	public ResponseEntity<String> searchCanReservOffice(Date date, int time, String persons) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String reservDate = sdf.format(date);
		int searchStartTime = time - 99;
		int searchEndTime = 0;
		
		if(time%100 == 0) {
			searchEndTime = time + 59;
		} else {
			searchEndTime = time + 99;
		}
		 
		List<HashMap<String, Object>> list = orderService.searchCanReservOffice(reservDate, searchStartTime, searchEndTime, persons);
		
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
	@RequestMapping("/order/search/seatmap")
	public ResponseEntity<String> searchSeatMap(String code, Date date, int time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String reservDate = sdf.format(date);
		int searchStartTime = time - 99;
		int searchEndTime = 0;
			
		if(time%100 == 0) {
			searchEndTime = time + 59;
		} else {
			searchEndTime = time + 99;
		}
		
		List<HashMap<String, Object>> list = orderService.searchSeatmap(code, reservDate, searchStartTime, searchEndTime);
		
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
	@RequestMapping("/order/imgdown/{code}")
	public void searchMenuTab(@PathVariable("code") int code, HttpServletResponse response) {
		String path = orderService.searchImgPath(code);
		File file = new File(path);
		String fileName = "";
		
		try {
			fileName = URLEncoder.encode(path.toLowerCase(),"utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		response.setHeader("Content-Disposition", "attachement;fileName=" + fileName);
		response.setHeader("Content-Transfer-Encoding", "binary");
		response.setContentLength((int)file.length());

		try(FileInputStream fis = new FileInputStream(file);
				BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream())){
			
			byte[] buffer = new byte[1024*1024];
			
			while(true) {
				int size = fis.read(buffer);
				if(size == -1) break;
				bos.write(buffer,0,size);
				bos.flush();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	 
}
