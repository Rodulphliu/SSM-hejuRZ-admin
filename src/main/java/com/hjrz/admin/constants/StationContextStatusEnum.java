package com.hjrz.admin.constants;

public enum StationContextStatusEnum {
	ALIVE(1,"存在"),DELETED(2,"已删除");
	
	 private int code;
     
     private String desc;

	private StationContextStatusEnum(int code, String desc) {
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
