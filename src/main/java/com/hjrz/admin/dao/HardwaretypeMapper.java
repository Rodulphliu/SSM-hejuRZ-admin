package com.hjrz.admin.dao;

import java.util.List;

import com.hjrz.admin.entity.Hardwaretype;

public interface HardwaretypeMapper {
    int deleteByPrimaryKey(Long hardtypeCode);

    int insert(Hardwaretype record);

    int insertSelective(Hardwaretype record);

    Hardwaretype selectByPrimaryKey(Long hardtypeCode);

    int updateByPrimaryKeySelective(Hardwaretype record);

    int updateByPrimaryKey(Hardwaretype record);
    
    List<Hardwaretype> selectByCondition(Hardwaretype hardwaretype);
}