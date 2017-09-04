package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Hardware;

public interface HardwareMapper {
    int deleteByPrimaryKey(Long hardwareCode);

    int insert(Hardware record);

    int insertSelective(Hardware record);

    Hardware selectByPrimaryKey(Long hardwareCode);

    int updateByPrimaryKeySelective(Hardware record);

    int updateByPrimaryKey(Hardware record);
}