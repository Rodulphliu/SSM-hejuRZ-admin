package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Workstation_info;
import com.hjrz.admin.entity.Workstation_infoExample;

public interface Workstation_infoMapper {
    int countByExample(Workstation_infoExample example);

    int deleteByPrimaryKey(Long wsCode);

    int insert(Workstation_info record);

    int insertSelective(Workstation_info record);

    Workstation_info selectByPrimaryKey(Long wsCode);

    int updateByPrimaryKeySelective(Workstation_info record);

    int updateByPrimaryKeyWithBLOBs(Workstation_info record);

    int updateByPrimaryKey(Workstation_info record);
}