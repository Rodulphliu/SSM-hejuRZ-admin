package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Bgresource;
import com.hjrz.admin.entity.BgresourceExample;

public interface BgresourceMapper {
    int countByExample(BgresourceExample example);

    int deleteByPrimaryKey(Integer resourceCode);

    int insert(Bgresource record);

    int insertSelective(Bgresource record);

    Bgresource selectByPrimaryKey(Integer resourceCode);

    int updateByPrimaryKeySelective(Bgresource record);

    int updateByPrimaryKey(Bgresource record);
}