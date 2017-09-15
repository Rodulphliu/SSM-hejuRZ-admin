package com.hjrz.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.User_basic_infoMapper;
import com.hjrz.admin.model.UserModel;

@Service
public class UserService {
	
	@Autowired
	private User_basic_infoMapper user_basic_infoMapper;
	
	/** 
	 * @Title queryallUser 
	 * @Description TODO(后台/获取所有用户信息) 
	 * @author RodulphLiu
	 * @Date 2017年9月15日
	 */
	public List<UserModel> queryallUser(UserModel userModel){
		return user_basic_infoMapper.queryforUserinfo(userModel);
	}
}
