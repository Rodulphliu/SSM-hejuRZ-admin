package com.hjrz.admin.form;

import java.util.Date;

public class HardWareForm {
	//硬件
	private Long hardwareCode;
	private String hardwareName;
	private Long brandCode;
	private Long hardwareType;
	private String hardwareState;
	private Date create_time;
	//详细信息
	private String hardwareImgpath;
	private String hardwareinfoDetail;
	
	public HardWareForm(Long hardwareCode, String hardwareName, Long brandCode, Long hardwareType, String hardwareState,
			Date create_time) {
		super();
		this.hardwareCode = hardwareCode;
		this.hardwareName = hardwareName;
		this.brandCode = brandCode;
		this.hardwareType = hardwareType;
		this.hardwareState = hardwareState;
		this.create_time = create_time;
	}
	
	public Long getHardwareCode() {
		return hardwareCode;
	}
	public void setHardwareCode(Long hardwareCode) {
		this.hardwareCode = hardwareCode;
	}
	public String getHardwareName() {
		return hardwareName;
	}
	public void setHardwareName(String hardwareName) {
		this.hardwareName = hardwareName;
	}
	public Long getBrandCode() {
		return brandCode;
	}
	public void setBrandCode(Long brandCode) {
		this.brandCode = brandCode;
	}
	public Long getHardwareType() {
		return hardwareType;
	}
	public void setHardwareType(Long hardwareType) {
		this.hardwareType = hardwareType;
	}
	public String getHardwareState() {
		return hardwareState;
	}
	public void setHardwareState(String hardwareState) {
		this.hardwareState = hardwareState;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getHardwareImgpath() {
		return hardwareImgpath;
	}
	public void setHardwareImgpath(String hardwareImgpath) {
		this.hardwareImgpath = hardwareImgpath;
	}
	public String getHardwareinfoDetail() {
		return hardwareinfoDetail;
	}
	public void setHardwareinfoDetail(String hardwareinfoDetail) {
		this.hardwareinfoDetail = hardwareinfoDetail;
	}
	
	
}
