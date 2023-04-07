package com.restaurant.service;

import org.springframework.stereotype.Service;

import com.restaurant.mapper.ReviewMapper;

@Service
public class ReviewService {
	private ReviewMapper reviewMapper;

	public ReviewService(ReviewMapper reviewMapper) {
		this.reviewMapper = reviewMapper;
	}

}
