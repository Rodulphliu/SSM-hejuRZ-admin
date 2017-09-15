package com.hjrz.admin.dao;

import com.hjrz.admin.entity.User_detail_info;

public interface User_detail_infoMapper {
    int deleteByPrimaryKey(Integer user_detail_Code);

    int insert(User_detail_info record);

    int insertSelective(User_detail_info record);

    User_detail_info selectByPrimaryKey(Integer user_detail_Code);

    int updateByPrimaryKeySelective(User_detail_info record);

    int updateByPrimaryKey(User_detail_info record);
}