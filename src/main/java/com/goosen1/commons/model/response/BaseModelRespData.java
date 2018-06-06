package com.goosen1.commons.model.response;

/**
 * 响应查询详情实体基类
 * @author Goosen
 * 2018年6月6日-上午10:53:36
 */
public class BaseModelRespData<T> extends BaseRespData {
	
	private static final long serialVersionUID = 3536431311056183802L;
	
	private T model;

	public T getModel() {
		return model;
	}

	public void setModel(T model) {
		this.model = model;
	}
	
}
