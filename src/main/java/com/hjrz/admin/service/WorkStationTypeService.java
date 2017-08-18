package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.WorkstaTypeMapper;
import com.hjrz.admin.entity.WorkstaType;

@Service("WorkStationTypeService")
public class WorkStationTypeService {
		
	@Autowired
	private WorkstaTypeMapper workstaTypeMapper;
	
	/** 
	 * @Title addWorkStataionType 
	 * @Description TODO(添加工作站类型方法) 
	 * @author RodulphLiu
	 * @Date 2017年8月18日
	 */
	public void addWorkStataionType(WorkstaType workstaType)throws Exception{
		workstaTypeMapper.insertSelective(workstaType);
	} 
	
	
}
