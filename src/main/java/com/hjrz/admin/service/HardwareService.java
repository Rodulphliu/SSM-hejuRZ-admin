package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.HardwareMapper;
import com.hjrz.admin.dao.Hardware_infoMapper;

@Service("HardwareService")
public class HardwareService {
	
	@Autowired
	private HardwareMapper hardwareMapper;
	
	@Autowired
	private Hardware_infoMapper hardware_infoMapper;
	
}
