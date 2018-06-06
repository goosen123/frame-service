package com.goosen1.commons.utils;

import java.util.UUID;

/**
 * id生成器
 * @author Goosen
 * 2018年6月6日-上午10:26:38
 */
public class IdGenUtil {

	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public synchronized static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
}
