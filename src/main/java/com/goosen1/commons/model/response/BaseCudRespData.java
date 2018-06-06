package com.goosen1.commons.model.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 响应增删改实体基类
 * @author Goosen
 * 2018年6月6日-上午10:52:34
 */
@ApiModel(value="基础响应实体")
public class BaseCudRespData<T> extends BaseRespData {

	private static final long serialVersionUID = 3536431311056183802L;
	
	@ApiModelProperty(value="实体id",example="252525eieorurkf782")
	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	
}
