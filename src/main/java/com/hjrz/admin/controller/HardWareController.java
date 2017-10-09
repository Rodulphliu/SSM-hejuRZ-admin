package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.form.HardWareForm;
import com.hjrz.admin.service.HardwareService;

@Controller
@RequestMapping(value="/HardWare")
public class HardWareController {
	
		@Autowired
		private HardwareService hardwareService;
		
		@RequestMapping(value="addHardware.do")
		public String toaddHardware(HttpServletRequest request)
		{
			return "hardware/hardware_add";
		}
		
		@SuppressWarnings("rawtypes")
		@RequestMapping(value="addHardwareInit.do",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
		public @ResponseBody ExchangeData addHardware(@RequestBody HardWareForm form,HttpServletRequest request)
		{
			ExchangeData<Object> exchangeData = new ExchangeData<Object>();
			try {
				hardwareService.addHardwareService(form);
			} catch (Exception e) {
				exchangeData.markException("添加失败，系统异常", e);
			}
			return exchangeData;
		}
}
