package com.goosen1.commons.model.request;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

/**
 * 接收分页实体基类
 * @author Goosen
 * 2018年6月6日-上午10:59:54
 */
//@ApiModel("分页查询对象")
//@Builder
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class BasePageReqData<T> {

	/**
	 * 按创建时间倒序排序
	 */
	public static final String ORDER_BY_CREATE_TIME_DESC = "create_time desc";

//	@ApiModelProperty(value = "当前页号")
	@Range(min = 1, max = Integer.MAX_VALUE)
	private int pageNum = 1;

//	@ApiModelProperty(value = "一页数量")
	@Range(min = 1, max = Integer.MAX_VALUE)
	private int pageSize = 10;

//	@ApiModelProperty(value = "排序", notes = "例：create_time desc,update_time desc")
	private String orderBy;

	private T condition;
	
	
	
	public BasePageReqData() {
		// TODO Auto-generated constructor stub
	}
	
	

	public BasePageReqData(int pageNum, int pageSize) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	public int getOffset() {
		return (this.pageNum - 1) * this.pageSize;
	}
	
	
	

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public T getCondition() {
		return condition;
	}

	public void setCondition(T condition) {
		this.condition = condition;
	}
	
}
