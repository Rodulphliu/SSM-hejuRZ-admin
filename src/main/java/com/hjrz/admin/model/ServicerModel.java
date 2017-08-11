package com.hjrz.admin.model;

import com.hjrz.admin.constants.ServicerEnum;

public class ServicerModel {
	private String serverName;
	
	private String serverType;
	
	private ServicerEnum serverState;
	
	public ServicerEnum getServerState() {
		return serverState;
	}

	public void setServerState(ServicerEnum serverState) {
		this.serverState = serverState;
	}

	private String siProcessor;
	
	private String cpuMixNumber;
	
	private String sibrandName;
	
	private String siSize;
	
	private String sihardamount;
	
	private String sioperSystem;
	
	private String siCPURAM;
	
	private String productdesc;
	
	private String siDetails;
	
	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerType() {
		return serverType;
	}

	public void setServerType(String serverType) {
		this.serverType = serverType;
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
