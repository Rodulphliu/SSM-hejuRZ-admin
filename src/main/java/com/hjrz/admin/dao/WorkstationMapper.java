package com.hjrz.admin.dao;

import java.util.List;

import com.hjrz.admin.entity.Workstation;
import com.hjrz.admin.form.WorkStationQuery;
import com.hjrz.admin.model.WorkStationModel;

public interface WorkstationMapper {
    int deleteByPrimaryKey(Long worksCode);

    int insert(Workstation record);

    int insertSelective(Workstation record);

    Workstation selectByPrimaryKey(Long worksCode);

    int updateByPrimaryKeySelective(Workstation record);

    int updateByPrimaryKey(Workstation record);
    
    List<WorkStationModel> queryforworkstationInfo(WorkStationQuery workStationQuery);
    
    WorkStationModel queryforworkstationInfobyworksCode(Long worksCode);
}