package com.thinkgem.jeesite.modules.business.entity;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.thinkgem.jeesite.common.persistence.DataEntity;

public class ComsumeCategory extends DataEntity<ComsumeCategory> {

	private static final long serialVersionUID = 1L;
	
	private String categoryName;

	private String categoryCode;

	private String sort;

	private ComsumeCategory parent;

	private String parentids;

	public ComsumeCategory() {
	}
	
	public ComsumeCategory(String id){
		super(id);
	}
	
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@JsonBackReference
	@NotNull
	public ComsumeCategory getParent() {
		return parent;
	}

	public void setParent(ComsumeCategory parent) {
		this.parent = parent;
	}

	public String getParentids() {
		return parentids;
	}

	public void setParentids(String parentids) {
		this.parentids = parentids;
	}

	public String getParentId() {
		return parent != null && parent.getId() != null ? parent.getId() : "0";
	}
}
