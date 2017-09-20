package com.hjrz.admin.constants;

public enum StationContextSourceEnum {
	SERVICE_BRIEF(1,"服务简介"),HANDWARE(2,"硬件专栏"),SOFTWARE(3,"软件专栏"),
	SOLUTION(4,"解决方案");
	
	private int code;
	
	private String desc;

	private StationContextSourceEnum(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
