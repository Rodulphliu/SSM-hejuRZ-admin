package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Workstatype;
import com.hjrz.admin.entity.WorkstatypeExample;

public interface WorkstatypeMapper {
    int countByExample(WorkstatypeExample example);

    int deleteByPrimaryKey(Integer wks_typeCode);

    int insert(Workstatype record);

    int insertSelective(Workstatype record);

    Workstatype selectByPrimaryKey(Integer wks_typeCode);

    int updateByPrimaryKeySelective(Workstatype record);

    int updateByPrimaryKeyWithBLOBs(Workstatype record);

    int updateByPrimaryKey(Workstatype record);
}