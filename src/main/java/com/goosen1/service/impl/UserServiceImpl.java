package com.goosen1.service.impl;

import org.springframework.stereotype.Service;

import com.goosen1.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String sayHello(String words) {
		return words;
	}

	
}
