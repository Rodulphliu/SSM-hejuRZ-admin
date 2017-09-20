package com.hjrz.admin.dao;

import java.util.List;

import com.hjrz.admin.entity.Stationcontext;

public interface StationcontextMapper {
    int deleteByPrimaryKey(Long scCode);

    int insert(Stationcontext record);

    int insertSelective(Stationcontext record);

    Stationcontext selectByPrimaryKey(Long scCode);

    int updateByPrimaryKeySelective(Stationcontext record);

    int updateByPrimaryKey(Stationcontext record);
    
    List<Stationcontext> selectByCondition(Stationcontext stationcontext);
}