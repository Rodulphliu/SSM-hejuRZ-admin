package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Workstation;
import com.hjrz.admin.entity.WorkstationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkstationMapper {
    int countByExample(WorkstationExample example);

    int deleteByExample(WorkstationExample example);

    int deleteByPrimaryKey(Long workscode);

    int insert(Workstation record);

    int insertSelective(Workstation record);

    List<Workstation> selectByExample(WorkstationExample example);

    Workstation selectByPrimaryKey(Long workscode);

    int updateByExampleSelective(@Param("record") Workstation record, @Param("example") WorkstationExample example);

    int updateByExample(@Param("record") Workstation record, @Param("example") WorkstationExample example);

    int updateByPrimaryKeySelective(Workstation record);

    int updateByPrimaryKey(Workstation record);
}