package com.agamin.service;

import org.springframework.stereotype.Service;

import com.agamin.cache.MenuCache;

@Service
public class MenuService {

	private MenuCache menuCache;
	
	public String getAllMenu() {
		return "get the value from cache";
	}

}
