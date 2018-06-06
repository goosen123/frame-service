package com.goosen1.commons.model.request;

import javax.validation.constraints.NotNull;

/**
 * 接收删除实体基类
 * @author Goosen
 * 2018年6月6日-上午10:45:56
 */
public class BaseDeleteReqData<T> extends BaseReqData{

	private static final long serialVersionUID = 3536431311056183802L;
	
	@NotNull
	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	
}
