package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Brand;

public interface BrandMapper {
    int deleteByPrimaryKey(Long brandCode);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Long brandCode);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}