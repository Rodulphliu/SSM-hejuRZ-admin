package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.WorkStationEnum;
import com.hjrz.admin.dao.WorkstationInfoMapper;
import com.hjrz.admin.dao.WorkstationMapper;
import com.hjrz.admin.entity.Workstation;
import com.hjrz.admin.entity.WorkstationInfo;
import com.hjrz.admin.exception.SYSException;
import com.hjrz.admin.model.WorkStationModel;

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
		/*public void addWorkStation(WorkStationModel workStationModel)throws SYSException{
			Workstation workstation = new Workstation();
			workstation.setWorksname(workStationModel.getWorksName());
			workstation.setWorkstype(workStationModel.getWorksType());
			workstation.setWorksState(WorkStationEnum.EXIST);
			workstationMapper.insert(workstation);
			
			WorkstationInfo workstationInfo = new WorkstationInfo();
			workstationInfo.setWorkcode(workstation.getWorkscode());
			workstationInfo.setWsprocessor(workStationModel.getWsProcessor());
			workstationInfo.setCpumixnumber(workStationModel.getCpuMixNumber());
			workstationInfo.setSibrandname(workStationModel.getSibrandName());
			workstationInfo.setSisize(workStationModel.getSiSize());
			workstationInfo.setSihardamout(workStationModel.getSihardamout());
			workstationInfo.setSiopersystem(workStationModel.getSioperSystem());
			workstationInfo.setSicpuram(workStationModel.getSiCPURAM());
			workstationInfo.setProductdesc(workStationModel.getProductdesc());
			workstationInfo.setSidetails(workStationModel.getSiDetails());
			workstationInfoMapper.insert(workstationInfo);
		}*/
}
