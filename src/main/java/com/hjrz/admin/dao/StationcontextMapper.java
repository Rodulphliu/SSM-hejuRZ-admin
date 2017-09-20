package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Stationcontext;

public interface StationcontextMapper {
    int deleteByPrimaryKey(Long scCode);

    int insert(Stationcontext record);

    int insertSelective(Stationcontext record);

    Stationcontext selectByPrimaryKey(Long scCode);

    int updateByPrimaryKeySelective(Stationcontext record);

    int updateByPrimaryKey(Stationcontext record);
}