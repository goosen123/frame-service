package com.goosen1.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Service基类
 * @author Goosen
 * @version 2018-06-06
 */
@Transactional(readOnly = true)
public interface BaseService {
	
}
