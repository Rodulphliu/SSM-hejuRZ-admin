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
import org.springframework.web.servlet.ModelAndViewDefiningException;

import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.Brand;
import com.hjrz.admin.entity.Hardware;
import com.hjrz.admin.entity.Hardwaretype;
import com.hjrz.admin.form.HardWareForm;
import com.hjrz.admin.service.BrandService;
import com.hjrz.admin.service.HardwareService;
import com.hjrz.admin.service.HardwareTypeService;

@Controller
@RequestMapping(value="/Hardwares")
public class HardWareController {
	
		@Autowired
		private HardwareService hardwareService;
		
		@Autowired
		private BrandService brandService;
		
		@Autowired
		private HardwareTypeService hardwareTypeservice;
		
		@RequestMapping(value="/addHardware.hjrz")
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
		@RequestMapping(value="/addHardwareInit.hjrz",method=RequestMethod.POST,
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
		
		@RequestMapping(value="/Hardwares.hjrz")
		public ModelAndView selectallhardware()
		{
			ModelAndView modelAndView = new ModelAndView();
			try {
				List<Hardware> hardwares = hardwareService.getallhardwareinfo();
				modelAndView.addObject("hardwares",hardwares);
				modelAndView.setViewName("hardware/hardware_list");
			} catch (Exception e) {
				modelAndView.addObject("message","查询失败，请联系管理员");
				modelAndView.setViewName("500");
			}
			return modelAndView;
		}
}
