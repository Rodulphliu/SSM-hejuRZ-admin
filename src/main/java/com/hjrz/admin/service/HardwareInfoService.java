package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.Hardware_infoMapper;
import com.hjrz.admin.entity.Hardware_info;

@Service
public class HardwareInfoService {

		@Autowired
		private Hardware_infoMapper hardware_infoMapper;

		/**
		 * 添加硬件库详细信息
		 * @param hardwareCode
		 * @throws Exception
		 */
		public void addHardWareInfo(Hardware_info hardware_info)throws Exception
		{
			hardware_infoMapper.insertSelective(hardware_info);
		}
		
		
}
