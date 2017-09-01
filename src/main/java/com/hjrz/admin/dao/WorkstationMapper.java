package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Workstation;

public interface WorkstationMapper {
    int deleteByPrimaryKey(Long worksCode);

    int insert(Workstation record);

    int insertSelective(Workstation record);

    Workstation selectByPrimaryKey(Long worksCode);

    int updateByPrimaryKeySelective(Workstation record);

    int updateByPrimaryKey(Workstation record);
}