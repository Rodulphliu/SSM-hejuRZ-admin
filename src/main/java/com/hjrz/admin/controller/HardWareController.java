package com.hjrz.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.Brand;
import com.hjrz.admin.entity.Hardwaretype;
import com.hjrz.admin.form.HardWareForm;
import com.hjrz.admin.service.BrandService;
import com.hjrz.admin.service.HardwareService;
import com.hjrz.admin.service.HardwareTypeService;

@Controller
@RequestMapping(value="/HardWare")
public class HardWareController {
	
		@Autowired
		private HardwareService hardwareService;
		
		@Autowired
		private BrandService brandService;
		
		@Autowired
		private HardwareTypeService hardwareTypeservice;
		
		@RequestMapping(value="/addHardware.do")
		public ModelAndView toaddHardware(HttpServletRequest request,Brand brand)
		{
			ModelAndView modelAndView = new ModelAndView();
			try {
				List<Brand> brands = brandService.findbyContion(brand);
				List<Hardwaretype> hardwaretypes= hardwareTypeservice.findallHardwareTypes();
				modelAndView.addObject("brands",brands);
				modelAndView.addObject("hardwaretypes",hardwaretypes);
				modelAndView.setViewName("hardware/hardware_add");
			} catch (Exception e) {
				modelAndView.addObject("message","初始化页面失败");
				modelAndView.setViewName("500");
			}
			return modelAndView;
		}
		
		@SuppressWarnings("rawtypes")
		@RequestMapping(value="/addHardwareInit.do",method=RequestMethod.POST,
		produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
		public @ResponseBody ExchangeData addHardware(
				@RequestBody HardWareForm hardwareForm,HttpServletRequest request)
		{
			ExchangeData<Object> exchangeData = new ExchangeData<Object>();
			try {
				hardwareService.addHardwareService(hardwareForm);
			} catch (Exception e) {
				exchangeData.markException("添加失败，系统异常", e);
			}
			return exchangeData;
		}
		
		@RequestMapping(value="/Hardware.do")
		public ModelAndView selectallhardware()
		{
			ModelAndView modelAndView = new ModelAndView();
			try {
				
			} catch (Exception e) {
				
			}
			return modelAndView;
		}
}
