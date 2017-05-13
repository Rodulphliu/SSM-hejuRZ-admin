package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Wkstation_info;
import com.hjrz.admin.entity.Wkstation_infoExample;
import com.hjrz.admin.entity.Wkstation_infoWithBLOBs;

public interface Wkstation_infoMapper {
    int countByExample(Wkstation_infoExample example);

    int deleteByPrimaryKey(Integer wksinfoCode);

    int insert(Wkstation_infoWithBLOBs record);

    int insertSelective(Wkstation_infoWithBLOBs record);

    Wkstation_infoWithBLOBs selectByPrimaryKey(Integer wksinfoCode);

    int updateByPrimaryKeySelective(Wkstation_infoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(Wkstation_infoWithBLOBs record);

    int updateByPrimaryKey(Wkstation_info record);
}