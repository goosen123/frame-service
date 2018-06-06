package com.goosen1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.goosen1.commons.dao.UserDao;
import com.goosen1.commons.model.po.user.User;
import com.goosen1.commons.model.request.BasePageReqData;
import com.goosen1.commons.model.response.BasePageRespData;
import com.goosen1.commons.model.response.user.UserList1;
import com.goosen1.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public String sayHello(String words) {
//		int i = 1/0;
		String str = null;
//		CheckUtil.notNull(str, "str", "str不能空");
		Assert.notNull(str, "str is not null.");
		return words;
	}
	
	@Override
	public User get(String id) {
		return userDao.get(id);
	}

	@Override
	public int insert(User entity) {
		return userDao.insert(entity);
	}

	@Override
	public int update(User entity) {
		return userDao.update(entity);
	}

	@Override
	public int delete(String id) {
		return userDao.delete(id);
	}
	
	
	@Override
	public int updateLoginInfo(User user) {
		return userDao.updateLoginInfo(user);
	}

	@Override
	public List<UserList1> findAllUserList() {
		return userDao.findAllUserList();
	}

	@Override
	public BasePageRespData<UserList1> findAllUserListByPage(BasePageReqData pageQO) {
		Page<UserList1> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize(), pageQO.getOrderBy());
		this.findAllUserList();
        return BasePageRespData.build(page);
	}

	
}
