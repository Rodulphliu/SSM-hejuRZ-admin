package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Workstation_info;

public interface Workstation_infoMapper {
    int deleteByPrimaryKey(Long wsinfoCode);

    int insert(Workstation_info record);

    int insertSelective(Workstation_info record);

    Workstation_info selectByPrimaryKey(Long wsinfoCode);

    int updateByPrimaryKeySelective(Workstation_info record);

    int updateByPrimaryKeyWithBLOBs(Workstation_info record);

    int updateByPrimaryKey(Workstation_info record);
}