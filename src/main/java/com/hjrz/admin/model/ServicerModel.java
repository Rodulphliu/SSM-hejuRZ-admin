package com.hjrz.admin.model;

import java.sql.Date;

public class ServicerModel {
	
	private Integer serverCode;
	
	private String serverName;
	
	private Integer serverType; 
	
	public Integer getServerType() {
		return serverType;
	}

	public void setServerType(Integer serverType) {
		this.serverType = serverType;
	}

	private String typeName;
	
	private Date create_time;
	
	private String siProcessor;
	
	private String cpuMixNumber;
	
	private String sibrandName;
	
	private String siSize;
	
	private String sihardamount;
	
	private String sioperSystem;
	
	private String siCPURAM;
	
	private String productdesc;
	
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

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
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
