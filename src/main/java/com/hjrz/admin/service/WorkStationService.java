package com.hjrz.admin.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.WorkStationEnum;
import com.hjrz.admin.dao.WorkstationMapper;
import com.hjrz.admin.dao.Workstation_infoMapper;
import com.hjrz.admin.entity.Workstation;
import com.hjrz.admin.entity.Workstation_info;
import com.hjrz.admin.exception.SYSException;
import com.hjrz.admin.form.WorkStationQuery;
import com.hjrz.admin.model.WorkStationModel;

@Service("WorkStationService")
public class WorkStationService {
	
		@Autowired
		private WorkstationMapper workstationMapper;
		
		@Autowired
		private Workstation_infoMapper workstation_infoMapper;
		
		/** 
		 * @Title addWorkStation 
		 * @Description TODO(添加工作站) 
		 * @author RodulphLiu
		 * @throws InvocationTargetException 
		 * @throws IllegalAccessException 
		 * @Date 2017年8月30日
		 */
		public void addWorkStation(WorkStationModel workStationModel)throws SYSException, IllegalAccessException, InvocationTargetException{
			Workstation workstation = new Workstation();
			workstation.setWorksName(workStationModel.getWorksName());
			workstation.setWorksType(workStationModel.getWorksType());
			workstation.setWorksState(WorkStationEnum.EXIST);
			workstationMapper.insert(workstation);
			
			Workstation_info workstationInfo = new Workstation_info();
			workstationInfo.setWorksCode(workstation.getWorksCode());
			workstationInfo.setWsProcessor(workStationModel.getWsProcessor());
			workstationInfo.setCpuMixNumber(workStationModel.getCpuMixNumber());
			workstationInfo.setWsbrandName(workStationModel.getWsbrandName());
			workstationInfo.setWsSize(workStationModel.getWsSize());
			workstationInfo.setWshardamout(workStationModel.getWshardamout());
			workstationInfo.setWsoperSystem(workStationModel.getWsoperSystem());
			workstationInfo.setWsCPURAM(workStationModel.getWsCPURAM());
			workstationInfo.setProductdesc(workStationModel.getProductdesc());
			workstationInfo.setWsDetails(workStationModel.getWsDetails());
			workstation_infoMapper.insert(workstationInfo);
		}
		
		/** 
		 * @Title findbyContion 
		 * @Description TODO(获取工作站数据) 
		 * @author RodulphLiu
		 * @Date 2017年9月4日
		 */
		public List<WorkStationModel> findbyContion(WorkStationQuery workStationQuery)throws Exception
		{
			List<WorkStationModel> workStationModels = workstationMapper.queryforworkstationInfo(workStationQuery);
			return workStationModels;
		}
		
		/** 
		 * @Title getbyid 
		 * @Description TODO(根据ID获取工作站数据) 
		 * @author RodulphLiu
		 * @Date 2017年9月4日
		 */
		public WorkStationModel getbyid(Long id)throws Exception
		{
			WorkStationModel workStationModel = workstationMapper.queryforworkstationInfobyworksCode(id);
			return workStationModel;
		}
}
