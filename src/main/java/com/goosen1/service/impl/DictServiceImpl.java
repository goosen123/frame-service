package com.goosen1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.goosen1.commons.dao.DictDao;
import com.goosen1.commons.dao.UserDao;
import com.goosen1.commons.model.po.dict.Dict;
import com.goosen1.commons.model.po.dict.DictList;
import com.goosen1.commons.model.po.user.User;
import com.goosen1.commons.model.request.BasePageReqData;
import com.goosen1.commons.model.response.BasePageRespData;
import com.goosen1.commons.model.response.user.UserList1;
import com.goosen1.service.DictService;
import com.goosen1.service.UserService;

@Service
public class DictServiceImpl implements DictService{

	@Autowired
	private DictDao dictDao;
	
	@Override
	public Dict get(String id) {
		return dictDao.get(id);
	}

	@Override
	public int insert(Dict entity) {
		return dictDao.insert(entity);
	}

	@Override
	public int update(Dict entity) {
		return dictDao.update(entity);
	}

	@Override
	public int delete(String id) {
		return dictDao.delete(id);
	}
	
	@Override
	public List<DictList> findAllDictList() {
		return dictDao.findAllDictList();
	}

	@Override
	public BasePageRespData<DictList> findAllDictListByPage(BasePageReqData pageQO) {
		Page<DictList> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize(), pageQO.getOrderBy());
		this.findAllDictList();
        return BasePageRespData.build(page);
	}

	
}
