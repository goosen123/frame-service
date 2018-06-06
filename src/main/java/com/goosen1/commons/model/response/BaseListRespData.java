package com.goosen1.commons.model.response;

import java.util.List;

/**
 * 响应查询列表实体基类
 * @author Goosen
 * 2018年6月6日-上午10:54:37
 */
public class BaseListRespData<T> extends BaseRespData{

	private static final long serialVersionUID = 3536431311056183802L;

	private List<T> list;
	
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}
 