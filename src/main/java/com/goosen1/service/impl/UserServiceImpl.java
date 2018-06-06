package com.goosen1.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.goosen1.commons.utils.CheckUtil;
import com.goosen1.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String sayHello(String words) {
//		int i = 1/0;
		String str = null;
//		CheckUtil.notNull(str, "str", "str不能空");
		Assert.notNull(str, "str is not null.");
		return words;
	}

	
}
