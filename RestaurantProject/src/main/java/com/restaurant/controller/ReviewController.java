package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restaurant.service.MenuService;
import com.restaurant.service.ReviewService;

@Controller
public class ReviewController {
	private ReviewService reviewService;
	
	public ReviewController(ReviewService reviewService) {
		super();
		this.reviewService = reviewService;
	}
	
	@RequestMapping("/review/reviewmain")     //리뷰메인
	public String reviewMain() {
		return "review/review_main";
	}
	@RequestMapping("/review/reviewwrite")	  //리뷰 작성
	public String reviewWrite() {
		return "review/review_write";
	}
		


	

}
