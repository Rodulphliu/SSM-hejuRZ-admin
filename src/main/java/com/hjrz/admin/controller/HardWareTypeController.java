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
	@RequestMapping(value="/addinit.do",method= RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
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
	
	
}
