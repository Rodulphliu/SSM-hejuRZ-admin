package com.hjrz.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.model.UserModel;
import com.hjrz.admin.service.UserService;

@Controller
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@RequestMapping(value="/userlist.hjrz")
	public ModelAndView getallUser(UserModel userModel){
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<UserModel> userModels = userService.queryallUser(userModel);
			modelAndView.addObject("userModel",userModels);
			modelAndView.setViewName("users/users_list");
		} catch (Exception e) {
			modelAndView.addObject("message","获取用户信息失败");
			modelAndView.setViewName("500");
		}
		return modelAndView;
	}
}
