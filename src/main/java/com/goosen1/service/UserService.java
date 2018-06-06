package com.goosen1.service;

import java.util.List;

import com.goosen1.commons.dao.UserDao;
import com.goosen1.commons.model.po.user.User;
import com.goosen1.commons.model.request.BasePageReqData;
import com.goosen1.commons.model.response.BasePageRespData;
import com.goosen1.commons.model.response.user.UserList1;

/**
 * 用户接口
 * @author Goosen
 */
public interface UserService extends BaseService,UserDao{

	@Override
	public int updateLoginInfo(User user);
	
	@Override
	public List<UserList1> findAllUserList();
	
	String sayHello(String words);
	
	public BasePageRespData<UserList1> findAllUserListByPage(BasePageReqData pageQO);
	
}
