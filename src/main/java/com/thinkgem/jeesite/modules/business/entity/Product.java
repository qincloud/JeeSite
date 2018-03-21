package com.thinkgem.jeesite.modules.business.entity;

import java.math.BigDecimal;

import com.thinkgem.jeesite.common.persistence.DataEntity;

public class Product extends DataEntity<Product> {
	private static final long serialVersionUID = 1L;

	private String product_name;
	private String product_category;
	private String product_category_code;
	private String photo;
	private BigDecimal price;

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public String getProduct_category_code() {
		return product_category_code;
	}

	public void setProduct_category_code(String product_category_code) {
		this.product_category_code = product_category_code;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
