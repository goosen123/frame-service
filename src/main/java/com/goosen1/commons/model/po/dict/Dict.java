package com.goosen1.commons.model.po.dict;

import com.goosen1.commons.model.BasePO;

/**
 * 字典
 * @author Goosen
 * 2018年6月21日-下午5:09:53
 */
public class Dict extends BasePO<String>{
	
	private static final long serialVersionUID = -7491215402569546437L;
	
	private String id;

	private Integer num;

	private String pid;

	private String name;

	private String tips;

	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
