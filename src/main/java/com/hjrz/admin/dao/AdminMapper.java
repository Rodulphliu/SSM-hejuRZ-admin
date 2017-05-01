package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Admin;
import com.hjrz.admin.entity.AdminExample;
import com.hjrz.admin.model.AdminAccountModel;

public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByPrimaryKey(Integer admcode);

    int insert(Admin record);

    int insertSelective(Admin record);
    
    Admin adminAccountLogin(AdminAccountModel adminAccountModel);
    
    Admin selectByPrimaryKey(Integer admcode);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}