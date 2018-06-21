package com.goosen1.service;

import java.util.List;

import com.goosen1.commons.dao.DictDao;
import com.goosen1.commons.model.po.dict.DictList;
import com.goosen1.commons.model.request.BasePageReqData;
import com.goosen1.commons.model.response.BasePageRespData;

/**
 * 字典接口
 * @author Goosen
 * 2018年6月21日-下午5:26:10
 */
public interface DictService extends BaseService,DictDao{

	@Override
	public List<DictList> findAllDictList();
	
	public BasePageRespData<DictList> findAllDictListByPage(BasePageReqData pageQO);
	
}
