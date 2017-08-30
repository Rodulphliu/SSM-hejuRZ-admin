package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.WorkstationInfoMapper;
import com.hjrz.admin.dao.WorkstationMapper;

@Service("WorkStationService")
public class WorkStationService {
	
		@Autowired
		private WorkstationMapper workstationMapper;
		
		@Autowired
		private WorkstationInfoMapper workstationInfoMapper;
		
		/** 
		 * @Title addWorkStation 
		 * @Description TODO(添加工作站) 
		 * @author RodulphLiu
		 * @Date 2017年8月30日
		 */
		public void addWorkStation(){
			
		}
}
