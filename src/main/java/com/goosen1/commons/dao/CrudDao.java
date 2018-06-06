/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.goosen1.commons.dao;

import com.goosen1.commons.annotations.MyBatisDao;

/**
 * DAO支持类实现
 * @author Goosen
 * 2018年6月6日-下午6:09:08
 */
@MyBatisDao
public interface CrudDao<T> extends BaseDao {

	public T get(String id);
	public int insert(T entity);
	public int update(T entity);
	public int delete(String id);
	
}