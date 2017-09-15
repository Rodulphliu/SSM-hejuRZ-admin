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
import com.hjrz.admin.entity.Hardwaretype;
import com.hjrz.admin.service.HardwareTypeService;

@Controller
@RequestMapping(value="/HardwareType")
public class HardWareTypeController {
	
	@Autowired
	private HardwareTypeService hardwareTypeService;
	
	/**
	 * @Title toaddweb 
	 * @Description TODO(跳转至添加硬件类型管理页面) 
	 * @author RodulphLiu
	 * @Date 2017年9月8日
	 */
	@RequestMapping(value= "/addHardwareType.do")
	public String toaddweb(HttpServletRequest request) 
	{
		return "hardware/hardwaretype_add";
	}
	
	/** 
	 * @Title add 
	 * @Description TODO(添加硬件类型) 
	 * @author RodulphLiu
	 * @Date 2017年9月8日
	 */
	@RequestMapping(value="/hardwareaddinit.do",method= RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ExchangeData<Object> add(@RequestBody Hardwaretype hardwaretype,HttpServletRequest request)
	{
		ExchangeData<Object> exchangeData = new ExchangeData<Object>();
		try {
			hardwareTypeService.addhardwareType(hardwaretype);
		} catch (Exception e) {
			exchangeData.markFail();
			exchangeData.setMessage("添加失败,请联系管理员");
		}
		return exchangeData;
	}
	
	/** 
	 * @Title queryHardWareTypes 
	 * @Description TODO(获取服务器类型) 
	 * @author RodulphLiu
	 * @Date 2017年9月14日
	 */
	@RequestMapping(value="/hardwaretype.do")
	public ModelAndView queryHardWareTypes(Hardwaretype hardwaretype){
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<Hardwaretype> hardwaretypes = hardwareTypeService.findbyContion(hardwaretype);
			modelAndView.addObject("hardwaretypes",hardwaretypes);
			modelAndView.setViewName("hardware/hardwaretype_list");
		} catch (Exception e) {
			modelAndView.addObject("message","获取硬件类型失败,请联系管理员");
			modelAndView.setViewName("500");
		}
		return modelAndView;
	}
	
	/** 
	 * @Title queryHardwareId 
	 * @Description TODO(根据ID获取相关属性) 
	 * @author RodulphLiu
	 * @Date 2017年9月14日
	 */
	public ModelAndView queryHardwareId(Long hardwareCode)
	{
		ModelAndView modelAndView = new ModelAndView();
		try {
			Hardwaretype hardwaretype = hardwareTypeService.getByid(hardwareCode);
			modelAndView.addObject("hardwaretype",hardwaretype);
			modelAndView.setViewName("hardware/hardwaretype_detail");
		} catch (Exception e) {
			modelAndView.addObject("message","获取硬件类型相关信息失败，请联系管理员");
			modelAndView.setViewName("500");
		}
		return modelAndView;
	}
	
}
