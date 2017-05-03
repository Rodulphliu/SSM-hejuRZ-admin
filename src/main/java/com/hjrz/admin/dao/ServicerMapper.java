package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Servicer;
import com.hjrz.admin.entity.ServicerExample;

public interface ServicerMapper {
    int countByExample(ServicerExample example);

    int deleteByPrimaryKey(Integer serverCode);

    int insert(Servicer record);

    int insertSelective(Servicer record);

    Servicer selectByPrimaryKey(Integer serverCode);

    int updateByPrimaryKeySelective(Servicer record);

    int updateByPrimaryKey(Servicer record);
}