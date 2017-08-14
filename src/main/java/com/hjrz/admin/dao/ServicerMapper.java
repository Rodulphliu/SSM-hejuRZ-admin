package com.hjrz.admin.dao;

import java.util.List;

import com.hjrz.admin.entity.Servicer;
import com.hjrz.admin.entity.ServicerExample;
import com.hjrz.admin.form.ServicerQuery;
import com.hjrz.admin.model.ServicerModel;

public interface ServicerMapper {
    int countByExample(ServicerExample example);

    int deleteByPrimaryKey(Integer serverCode);

    int insert(Servicer record);

    int insertSelective(Servicer record);

    Servicer selectByPrimaryKey(Integer serverCode);

    int updateByPrimaryKeySelective(Servicer record);

    int updateByPrimaryKey(Servicer record);
    
    List<ServicerModel> selectByCondition(ServicerQuery servicerQuery);
}