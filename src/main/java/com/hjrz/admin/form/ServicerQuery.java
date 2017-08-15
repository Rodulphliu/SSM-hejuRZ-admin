package com.hjrz.admin.form;

public class ServicerQuery {
	//根据ID搜索
	private Integer serverCode;
	
	//根据名称搜索
	private String serverName;

	//根据类型名称搜索
	private String typeName;
	
	//根据服务器处理器名称或类型来换
	private String siProcessor;
	
	//根据CPU最大数量来确定
	private String cpuMixNumber;
	
	//根据品牌查询
	private String sibrandName;
	
	//根据尺寸大小查询
	private String siSize;

	//根据服务器硬盘容量查询
	private String sihardamount;
	
	//根据服务器操作系统来查询
	private String sioperSystem;
	
	//根据服务器容量查询
	private String siCPURAM;
	
	//根据服务器简介标题查询
	private String productdesc;
	
	//根据服务器详细说明内容中的部分内容查询
	private String siDetails;

	public Integer getServerCode() {
		return serverCode;
	}

	public void setServerCode(Integer serverCode) {
		this.serverCode = serverCode;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getSiProcessor() {
		return siProcessor;
	}

	public void setSiProcessor(String siProcessor) {
		this.siProcessor = siProcessor;
	}

	public String getCpuMixNumber() {
		return cpuMixNumber;
	}

	public void setCpuMixNumber(String cpuMixNumber) {
		this.cpuMixNumber = cpuMixNumber;
	}

	public String getSibrandName() {
		return sibrandName;
	}

	public void setSibrandName(String sibrandName) {
		this.sibrandName = sibrandName;
	}

	public String getSiSize() {
		return siSize;
	}

	public void setSiSize(String siSize) {
		this.siSize = siSize;
	}

	public String getSihardamount() {
		return sihardamount;
	}

	public void setSihardamount(String sihardamount) {
		this.sihardamount = sihardamount;
	}

	public String getSioperSystem() {
		return sioperSystem;
	}

	public void setSioperSystem(String sioperSystem) {
		this.sioperSystem = sioperSystem;
	}

	public String getSiCPURAM() {
		return siCPURAM;
	}

	public void setSiCPURAM(String siCPURAM) {
		this.siCPURAM = siCPURAM;
	}

	public String getProductdesc() {
		return productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	public String getSiDetails() {
		return siDetails;
	}

	public void setSiDetails(String siDetails) {
		this.siDetails = siDetails;
	}
}




