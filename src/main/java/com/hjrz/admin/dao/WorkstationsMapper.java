package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Workstations;
import com.hjrz.admin.entity.WorkstationsExample;

public interface WorkstationsMapper {
    int countByExample(WorkstationsExample example);

    int deleteByPrimaryKey(Integer wksCode);

    int insert(Workstations record);

    int insertSelective(Workstations record);

    Workstations selectByPrimaryKey(Integer wksCode);

    int updateByPrimaryKeySelective(Workstations record);

    int updateByPrimaryKey(Workstations record);
}