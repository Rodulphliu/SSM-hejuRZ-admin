package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Server_info;
import com.hjrz.admin.entity.Server_infoExample;

public interface Server_infoMapper {
    int countByExample(Server_infoExample example);

    int deleteByPrimaryKey(Long siCode);

    int insert(Server_info record);

    int insertSelective(Server_info record);

    Server_info selectByPrimaryKey(Long siCode);

    int updateByPrimaryKeySelective(Server_info record);

    int updateByPrimaryKeyWithBLOBs(Server_info record);

    int updateByPrimaryKey(Server_info record);
}