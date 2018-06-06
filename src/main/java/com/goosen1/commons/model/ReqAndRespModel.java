package com.goosen1.commons.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 接收和响应的实体的父类
 * @author Goosen
 * 2018年6月6日-上午10:23:34
 */
@SuppressWarnings("serial")
public abstract class ReqAndRespModel implements Serializable {

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
