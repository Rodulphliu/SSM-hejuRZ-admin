package com.hjrz.admin.dao;

import com.hjrz.admin.entity.WorkstaType;
import com.hjrz.admin.entity.WorkstaTypeExample;

public interface WorkstaTypeMapper {
    int countByExample(WorkstaTypeExample example);

    int deleteByPrimaryKey(Integer wks_typeCode);

    int insert(WorkstaType record);

    int insertSelective(WorkstaType record);

    WorkstaType selectByPrimaryKey(Integer wks_typeCode);

    int updateByPrimaryKeySelective(WorkstaType record);

    int updateByPrimaryKeyWithBLOBs(WorkstaType record);

    int updateByPrimaryKey(WorkstaType record);
}