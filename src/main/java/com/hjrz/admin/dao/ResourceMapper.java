package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Resource;
import com.hjrz.admin.entity.ResourceExample;

public interface ResourceMapper {
    int countByExample(ResourceExample example);

    int deleteByPrimaryKey(Integer resourceCode);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Integer resourceCode);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}