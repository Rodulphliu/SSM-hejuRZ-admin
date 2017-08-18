package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Workstation;
import com.hjrz.admin.entity.WorkstationExample;

public interface WorkstationMapper {
    int countByExample(WorkstationExample example);

    int deleteByPrimaryKey(Long worksCode);

    int insert(Workstation record);

    int insertSelective(Workstation record);

    Workstation selectByPrimaryKey(Long worksCode);

    int updateByPrimaryKeySelective(Workstation record);

    int updateByPrimaryKey(Workstation record);
}