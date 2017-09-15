package com.hjrz.admin.model;

import java.util.Date;

public class UserModel {
	private Integer user_basic_Code;
	
	private String user_login_phone;
	
	private String user_email;
	
	private String user_realname;
	
	private String user_sex;
	
	private String user_address;
	
	private Date create_time;
	
	private Date last_login_time;

	public Integer getUser_basic_Code() {
		return user_basic_Code;
	}

	public void setUser_basic_Code(Integer user_basic_Code) {
		this.user_basic_Code = user_basic_Code;
	}

	public String getUser_login_phone() {
		return user_login_phone;
	}

	public void setUser_login_phone(String user_login_phone) {
		this.user_login_phone = user_login_phone;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_realname() {
		return user_realname;
	}

	public void setUser_realname(String user_realname) {
		this.user_realname = user_realname;
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(Date last_login_time) {
		this.last_login_time = last_login_time;
	}
	
	
}
