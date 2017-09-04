package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.HardwaretypeMapper;
import com.hjrz.admin.entity.Hardwaretype;

@Service("HardwareTypeService")
public class HardwareTypeService {
	
	@Autowired
	private HardwaretypeMapper hardwaretypeMapper;
	
	/** 
	 * @Title addhardwareType 
	 * @Description TODO(添加硬件类型) 
	 * @author RodulphLiu
	 * @Date 2017年9月4日
	 */
	public void addhardwareType(Hardwaretype hardwaretype)throws Exception{
		hardwaretypeMapper.insert(hardwaretype);
	}
	
}
