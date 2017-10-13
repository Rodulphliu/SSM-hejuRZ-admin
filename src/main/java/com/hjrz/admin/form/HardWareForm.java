package com.hjrz.admin.form;

public class HardWareForm {
	//硬件
	private String hardwareName;
	private Long brandCode;
	private Long hardwareType;
	//详细信息
	private String hardwareImgpath;
	private String hardwareinfoDetail;
	
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
