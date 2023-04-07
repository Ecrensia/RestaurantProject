package com.restaurant.service;

import org.springframework.stereotype.Service;

import com.restaurant.mapper.StoreMapper;

@Service
public class StoreService {
	private StoreMapper storeMapper;

	public StoreService(StoreMapper storeMapper) {
		super();
		this.storeMapper = storeMapper;
	}

}
