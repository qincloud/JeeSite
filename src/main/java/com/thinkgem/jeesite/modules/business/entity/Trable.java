package com.thinkgem.jeesite.modules.business.entity;

public class Trable implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String code;
	
	private String num;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
}
