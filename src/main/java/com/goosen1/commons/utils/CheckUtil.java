package com.goosen1.commons.utils;

import com.goosen1.commons.enums.ResultCode;
import com.goosen1.commons.exception.BusinessException;
import com.goosen1.commons.model.commons.ParameterInvalidItem;


/**
 * 校验工具类
 * @author Goosen
 * 2018年6月6日-下午5:05:47
 */
public class CheckUtil {

	public static void check(boolean condition, String fieldName,String message) {
		if (!condition) {
			fail(fieldName,message);
		}
	}

	public static void notEmpty(String str,String fieldName,String message) {
		if (str == null || str.isEmpty()) {
			fail(fieldName,message);
		}
	}

	public static void notNull(Object obj, String fieldName,String message) {
		if (obj == null) {
			fail(fieldName,message);
		}
	}

	private static void fail(String fieldName, String message) {
		throw new BusinessException(ResultCode.PARAM_IS_INVALID,new ParameterInvalidItem(fieldName,message));
	}
}
