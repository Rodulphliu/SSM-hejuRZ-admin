package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Server_info;
import com.hjrz.admin.entity.Server_infoExample;
import com.hjrz.admin.entity.Server_infoWithBLOBs;

public interface Server_infoMapper {
    int countByExample(Server_infoExample example);

    int deleteByPrimaryKey(Integer siCode);

    int insert(Server_infoWithBLOBs record);

    int insertSelective(Server_infoWithBLOBs record);

    Server_infoWithBLOBs selectByPrimaryKey(Integer siCode);

    int updateByPrimaryKeySelective(Server_infoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(Server_infoWithBLOBs record);

    int updateByPrimaryKey(Server_info record);
}