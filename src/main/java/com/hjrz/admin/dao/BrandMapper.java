package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Brand;
import com.hjrz.admin.entity.BrandExample;

public interface BrandMapper {
    int countByExample(BrandExample example);

    int deleteByPrimaryKey(Long brandCode);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Long brandCode);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}