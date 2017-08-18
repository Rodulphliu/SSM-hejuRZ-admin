package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.WorkstaType;
import com.hjrz.admin.service.WorkStationTypeService;

/**
 * @Description (工作站类型控制器)
 * @Date 2017年8月18日
 * @author RodulphLiu
 */
@Controller
@RequestMapping(value="/WorkStationType")
public class WorkStationTypeController {
		
	@Autowired
	private WorkStationTypeService workStationTypeService;

	/** 
	 * @Title toadd 
	 * @Description TODO(跳转至添加工作站类型) 
	 * @author RodulphLiu
	 * @Date 2017年8月18日
	 */
	@RequestMapping(value="/addWorkStationType.do")
	public ModelAndView toadd(){
		ModelAndView modelAndView = new ModelAndView();
		try {
			modelAndView.setViewName("workstation/add_workstationtype");
		} catch (Exception e) {
			modelAndView.addObject("message","系统错误，找不到页面");
			modelAndView.setViewName("404");
		}
		return modelAndView;
	}
	
	/** 
	 * @Title addWorkStationType 
	 * @Description TODO(添加工作站类型) 
	 * @author RodulphLiu
	 * @Date 2017年8月18日
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/addWorkStationType.do",method= RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ExchangeData addWorkStationType(WorkstaType workstaType,HttpServletRequest request){
			ExchangeData<Object> exchangeData = new ExchangeData<Object>();
			try {
				workStationTypeService.addWorkStataionType(workstaType);
			} catch (Exception e) {
				exchangeData.markException(e);
			}
			return exchangeData;
	}
}
