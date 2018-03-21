package com.thinkgem.jeesite.modules.business.entity;

import java.util.Date;

import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.modules.business.utils.DateUtils;

public class Comsume extends DataEntity<Comsume> {

	private static final long serialVersionUID = 1L;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 人民币
	 */
	private String rmb;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 费用类别
	 */
	private String category;

	/**
	 * 费用类别代码
	 */
	private String code;

	/**
	 * 时间
	 */
	private String time;
	
	public Comsume() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRmb() {
		return rmb;
	}

	public void setRmb(String rmb) {
		this.rmb = rmb;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTime() {
	   return time;
	}
	

	public void setTime(String time) {
		this.time = time;
	}
}
