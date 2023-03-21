package com.restaurant.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.service.FAQService;
import com.restaurant.vo.PaggingVO;
@Controller
public class FAQController {
	private FAQService faqService;
	 
	public FAQController(FAQService faqService) {
		this.faqService = faqService;
	}
	   
	@RequestMapping("/faq")
	public ModelAndView faqView(@RequestParam(name = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(name = "search", defaultValue = "") String search) {		
		List<HashMap<String, Object>> list = faqService.viewFAQList(pageNo, search);
		
		int count = faqService.selectFaqCount();
		PaggingVO pagging = new PaggingVO(count, pageNo, 5);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("faq/faq");
		view.addObject("list", list);
		view.addObject("pagging", pagging);
		view.addObject("search", search);
		
		return view;
	} 
	     
}
