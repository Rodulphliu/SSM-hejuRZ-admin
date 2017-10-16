package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {

	@RequestMapping(value="500.hjrz")
	public String toerrorfive(HttpServletRequest request)
	{
		request.setAttribute("message","错误");
		return "500";
	}
}
