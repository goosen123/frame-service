package com.goosen1.commons.dao;

import java.util.List;

import com.goosen1.commons.annotations.MyBatisDao;
import com.goosen1.commons.model.po.user.User;
import com.goosen1.commons.model.response.user.UserList1;


/**
 * 用户DAO接口
 * @author Goosen
 * 2018年6月6日-下午6:09:36
 */
@MyBatisDao
public interface UserDao extends CrudDao<User>{
	
	public int updateLoginInfo(User user);
	
	public List<UserList1> findAllUserList();
	
}
