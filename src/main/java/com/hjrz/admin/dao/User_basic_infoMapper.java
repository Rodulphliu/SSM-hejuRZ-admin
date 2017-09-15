package com.hjrz.admin.dao;

import java.util.List;

import com.hjrz.admin.entity.User_basic_info;
import com.hjrz.admin.model.UserModel;

public interface User_basic_infoMapper {
    int deleteByPrimaryKey(Integer user_basic_Code);

    int insert(User_basic_info record);

    int insertSelective(User_basic_info record);

    User_basic_info selectByPrimaryKey(Integer user_basic_Code);

    int updateByPrimaryKeySelective(User_basic_info record);

    int updateByPrimaryKey(User_basic_info record);
    
    List<UserModel> queryforUserinfo(UserModel userModel);
}