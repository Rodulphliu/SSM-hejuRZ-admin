package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.service.HardwareService;

@Controller
@RequestMapping(value="/HardWare")
public class HardWareController {
	
		@Autowired
		private HardwareService hardwareService;
		
		@RequestMapping(value="")
		public String toaddHardware(HttpServletRequest request)
		{
			return "";
		}
}
