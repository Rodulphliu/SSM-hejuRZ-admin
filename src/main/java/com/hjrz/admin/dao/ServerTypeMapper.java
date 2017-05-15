package com.hjrz.admin.dao;

import java.util.List;

import com.hjrz.admin.entity.ServerType;
import com.hjrz.admin.entity.ServerTypeExample;
import com.hjrz.admin.form.ServerTypeQuery;

public interface ServerTypeMapper {
    int countByExample(ServerTypeExample example);

    int deleteByPrimaryKey(Integer typeCode);

    int insert(ServerType record);

    int insertSelective(ServerType record);

    ServerType selectByPrimaryKey(Integer typeCode);

    int updateByPrimaryKeySelective(ServerType record);

    int updateByPrimaryKeyWithBLOBs(ServerType record);

    int updateByPrimaryKey(ServerType record);
    
    int countByQuery(ServerTypeQuery serverTypeQuery);
    
    List<ServerType> selectByCondition(ServerTypeQuery serverTypeQuery);
}