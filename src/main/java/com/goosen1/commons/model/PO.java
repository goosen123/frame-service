package com.goosen1.commons.model;


import java.util.Date;

/**
 * po抽象实体的共同字段
 * @author Goosen
 * 2018-05-31 pm
 */
public interface PO<PK> extends Model {

	PK getId();

	void setId(PK id);

	Date getCreateTime();

	void setCreateTime(Date createTime);

	Date getUpdateTime();

	void setUpdateTime(Date updateTime);
}
