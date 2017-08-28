package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Hardwaretype;
import com.hjrz.admin.entity.HardwaretypeExample;

public interface HardwaretypeMapper {
    int countByExample(HardwaretypeExample example);

    int deleteByPrimaryKey(Long hardtypeCode);

    int insert(Hardwaretype record);

    int insertSelective(Hardwaretype record);

    Hardwaretype selectByPrimaryKey(Long hardtypeCode);

    int updateByPrimaryKeySelective(Hardwaretype record);

    int updateByPrimaryKey(Hardwaretype record);
}