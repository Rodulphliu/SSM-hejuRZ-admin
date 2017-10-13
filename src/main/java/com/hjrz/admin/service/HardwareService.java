package com.hjrz.admin.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.HardWareStateEnum;
import com.hjrz.admin.dao.HardwareMapper;
import com.hjrz.admin.entity.Hardware;
import com.hjrz.admin.entity.Hardware_info;
import com.hjrz.admin.form.HardWareForm;

@Service("HardwareService")
public class HardwareService {
	
	@Autowired
	private HardwareMapper hardwareMapper;
	
	@Autowired
	private HardwareInfoService hardwareInfoService;
	
	
	/**
	 * 添加硬件
	 * @param hardware
	 * @param hardware_info
	 * @throws Exception
	 */
	public void addHardwareService(HardWareForm form)throws Exception
	{
		Date now = new Date();
		Hardware hardware = new Hardware();
		hardware.setHardwareName(form.getHardwareName());
		hardware.setBrandCode(form.getBrandCode());
		hardware.setHardwareType(form.getHardwareType());
		hardware.setHardwareState(HardWareStateEnum.EXIST);
		hardware.setCreate_time(now);
		hardwareMapper.insertSelective(hardware);
		
		Hardware_info hardware_info = new Hardware_info();
		hardware_info.setHardwareCode(hardware.getHardwareCode());
		hardware_info.setHardwareImgpath(form.getHardwareImgpath());
		hardware_info.setHardwareinfoDetail(form.getHardwareinfoDetail());
		hardwareInfoService.addHardWareInfo(hardware_info);
	}
	
	public List<Hardware> getallhardwareinfo()throws Exception
	{
		List<Hardware> hardwares = null;
		return hardwares;
	}
	
}
