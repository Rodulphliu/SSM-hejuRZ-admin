package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Dynamic;
import com.hjrz.admin.entity.DynamicExample;

public interface DynamicMapper {
    int countByExample(DynamicExample example);

    int deleteByPrimaryKey(Integer dyCode);

    int insert(Dynamic record);

    int insertSelective(Dynamic record);

    Dynamic selectByPrimaryKey(Integer dyCode);

    int updateByPrimaryKeySelective(Dynamic record);

    int updateByPrimaryKeyWithBLOBs(Dynamic record);

    int updateByPrimaryKey(Dynamic record);
}