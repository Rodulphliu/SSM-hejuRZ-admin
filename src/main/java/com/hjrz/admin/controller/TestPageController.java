package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/totestupload")
public class TestPageController {
	
	/**
	 * 跳转至测试上传文件JSP
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/gettest1.do",method=RequestMethod.GET)
	public String toUploadJSP(HttpServletRequest request,HttpServletResponse response){
		return "test/testupload";
	}
}
