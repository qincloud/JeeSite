package com.thinkgem.jeesite.modules.business.entity;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.thinkgem.jeesite.common.persistence.DataEntity;

public class ProductCategory extends DataEntity<ProductCategory> {
	private static final long serialVersionUID = 1L;

	private String categoryName;

	private String categoryCode;

	private String sort;

	private ProductCategory parent;

	private String parentids;

	public ProductCategory() {
		
	}
	
	public ProductCategory(String id) {
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
	public ProductCategory getParent() {
		return parent;
	}

	public void setParent(ProductCategory parent) {
		this.parent = parent;
	}

	public String getParentids() {
		return parentids;
	}

	public void setParentids(String parentids) {
		this.parentids = parentids;
	}

	public String getParentId() {
		System.out.println("=========================="+parent);
		return parent != null && parent.getId() != null ? parent.getId() : "0";
	}
}
