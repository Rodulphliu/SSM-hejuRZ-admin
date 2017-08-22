package com.hjrz.admin.dao;

import com.hjrz.admin.entity.WorkstationInfo;
import com.hjrz.admin.entity.WorkstationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkstationInfoMapper {
    int countByExample(WorkstationInfoExample example);

    int deleteByExample(WorkstationInfoExample example);

    int deleteByPrimaryKey(Long wscode);

    int insert(WorkstationInfo record);

    int insertSelective(WorkstationInfo record);

    List<WorkstationInfo> selectByExampleWithBLOBs(WorkstationInfoExample example);

    List<WorkstationInfo> selectByExample(WorkstationInfoExample example);

    WorkstationInfo selectByPrimaryKey(Long wscode);

    int updateByExampleSelective(@Param("record") WorkstationInfo record, @Param("example") WorkstationInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkstationInfo record, @Param("example") WorkstationInfoExample example);

    int updateByExample(@Param("record") WorkstationInfo record, @Param("example") WorkstationInfoExample example);

    int updateByPrimaryKeySelective(WorkstationInfo record);

    int updateByPrimaryKeyWithBLOBs(WorkstationInfo record);

    int updateByPrimaryKey(WorkstationInfo record);
}