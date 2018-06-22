package com.goosen1.commons.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goosen1.commons.annotations.MyBatisDao;
import com.goosen1.commons.model.po.dict.Dict;
import com.goosen1.commons.model.po.dict.DictList;


/**
 * 字典DAO接口
 * @author Goosen
 * 2018年6月21日-下午5:14:35
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict>{
	
	public List<DictList> findAllDictList(@Param("id")String id,@Param("pid")String pid,@Param("name")String name);
	
}
