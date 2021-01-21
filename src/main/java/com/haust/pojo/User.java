package com.haust.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;

public class User {

	private Integer id;
	private String name;
	
	@TableLogic //逻辑删除字段
	private Integer logicFlag;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, Integer logicFlag) {
		super();
		this.id = id;
		this.name = name;
		this.logicFlag = logicFlag;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLogicFlag() {
		return logicFlag;
	}

	public void setLogicFlag(Integer logicFlag) {
		this.logicFlag = logicFlag;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", logicFlag=" + logicFlag + "]";
	}
	
	
}
