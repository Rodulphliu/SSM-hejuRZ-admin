package com.hjrz.test;

import java.io.Serializable;

import com.hjrz.admin.constants.CallStatusEnum;

public class UserTable implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5067261928618917781L;

	private Integer id;
	
	private String username;
	
	private String usersex;
	
	private String miaoshu;

	private CallStatusEnum call;
	
	private Bee bee;
	
	public Bee getBee() {
		return bee;
	}

	public void setBee(Bee bee) {
		this.bee = bee;
	}

	public CallStatusEnum getCall() {
		return call;
	}

	public void setCall(CallStatusEnum call) {
		this.call = call;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getMiaoshu() {
		return miaoshu;
	}

	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}
	
	
}
