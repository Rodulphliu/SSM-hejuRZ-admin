package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Admin_info;
import com.hjrz.admin.entity.Admin_infoExample;

public interface Admin_infoMapper {
    int countByExample(Admin_infoExample example);

    int deleteByPrimaryKey(Integer adminfocode);

    int insert(Admin_info record);

    int insertSelective(Admin_info record);

    Admin_info selectByPrimaryKey(Integer adminfocode);
    
    Admin_info selectByAdmCode(Integer admcode);

    int updateByPrimaryKeySelective(Admin_info record);

    int updateByPrimaryKey(Admin_info record);
}