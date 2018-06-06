package com.goosen1.commons.model.response;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.goosen1.commons.model.Model;
import com.goosen1.commons.model.request.BasePageReqData;
import com.goosen1.commons.utils.BeanUtil;



//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 响应分页实体基类
 * @author Goosen
 * 2018年6月6日-上午10:58:53
 */
//@ApiModel("分页对象")
//@Builder
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class BasePageRespData<T> implements Model {

	private static final long serialVersionUID = -4426958360243585882L;

//	@ApiModelProperty(value = "当前页号")
	private Integer pageNum;

//	@ApiModelProperty(value = "每页的数量")
	private Integer pageSize;

//	@ApiModelProperty(value = "总记录数")
	private Long total;

//	@ApiModelProperty(value = "总页数")
	private Integer pages;

//	@ApiModelProperty(value = "结果集")
	private List<T> list;
	
	
	
	public BasePageRespData() {
		// TODO Auto-generated constructor stub
	}
	
	

	public BasePageRespData(BasePageReqData pageQO) {
		this.setPageNum(pageQO.getPageNum());
		this.setPageSize(pageQO.getPageSize());
	}

	public BasePageRespData(List<T> poList) {
		BeanUtils.copyProperties(new PageInfo<>(poList), this);
	}

	public static <T> BasePageRespData<T> build(List<T> poList) {
		return new BasePageRespData<>(poList);
	}

	/**
	 * @desc 构建一个分页VO对象
	 *
	 * @param page 数据库查出来的分页数据列表
	 */
	public static <T> BasePageRespData<T> build(Page<T> page) {
		BasePageRespData<T> pageVO = new BasePageRespData<>();
		BeanUtils.copyProperties(page.toPageInfo(), pageVO);
		return pageVO;
	}

	/**
	 * @desc 构建一个分页VO对象
	 * 试用场景为：从数据库取出的PO列表不做任何处理，转化为VO列表返回
	 *
	 * @param page 数据库查出来的分页数据列表
	 * @param voClazz 要转为的VO类
	 */
	public static <T, E> BasePageRespData<T> build(Page<E> page, Class<T> voClazz) {

		BasePageRespData<T> pageVO = new BasePageRespData<>();
		BeanUtils.copyProperties(page, pageVO, "list");

		try {
			List<T> voList = Lists.newArrayList();
			List<E> poList = page.getResult();
			if (!CollectionUtils.isEmpty(poList)) {
				for (E e : poList) {
					T t = voClazz.newInstance();
					BeanUtils.copyProperties(e, t);
					voList.add(t);
				}
			}
			pageVO.setList(voList);
		} catch (IllegalAccessException | InstantiationException e) {
			throw new RuntimeException(e);
		}

		return pageVO;
	}

	/**
	 * @desc 构建一个分页VO对象
	 * 试用场景为：将处理好的VO列表封装返回
	 *
	 * @param poPage 数据库查出来的分页数据
	 * @param voList vo数据列表
	 */
	public static <T, E> BasePageRespData<T> build(Page<E> poPage, List<T> voList) {
		BasePageRespData<T> page = new BasePageRespData<>();
		BeanUtil.copyProperties(poPage, page, "list");
		//page.setList(voList == null ? Lists.newArrayList() : voList);
		if(voList == null){
			page.setList(new ArrayList<T>());//Lists.newArrayList()
		}else{
			page.setList(voList);
		}
		return page;
	}

	public static int getPages(long total, int pageSize) {
		if (total == 0 || pageSize == 0) {
			return 0;
		}
		return (int) (total % pageSize == 0 ? (total / pageSize) : (total / pageSize + 1));
	}

	public int getPages(){
		return getPages(this.total, this.pageSize);
	}
	
	
	
	
	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}
	
}
