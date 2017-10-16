package com.hjrz.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.constants.CallStatusEnum;
import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.ServerType;
import com.hjrz.admin.form.ServerTypeQuery;
import com.hjrz.admin.form.ServicerQuery;
import com.hjrz.admin.model.ServicerModel;
import com.hjrz.admin.service.ServerTypeService;
import com.hjrz.admin.service.ServicerService;

/**
 * @ClassName ServicerController
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月18日 下午5:46:23
 * @version 1.0.0
 */
@Controller
@RequestMapping(value="/servicer")
public class ServicerController {
      
      @Autowired
      private ServicerService servicerService;

      @Autowired
      private ServerTypeService serverTypeService;
      
      /**
       * @Description (跳转至添加服务器页面)
       * @author RudolphLiu
       * @Date 2017年5月18日 下午5:59:38
       */
      @RequestMapping(value="/toaddservicer.hjrz")
      public String addInit(ServerTypeQuery serverTypeQuery,HttpServletRequest request,HttpServletResponse response){
		try {
			List<ServerType> serverTypes;
			serverTypes = serverTypeService.findbyContion(serverTypeQuery);
			request.setAttribute("serverTypes",serverTypes);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  return "servicer/add_servicer";
      }
      
      	/** 
	     * @Title addServicer 
	     * @Description TODO(添加服务器属性)
	     * @author RodulphLiu
	     * @Date 2017年8月11日
	     */
      @SuppressWarnings("rawtypes")
      @RequestMapping(value="/addservicer.hjrz",method= RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
      @ResponseBody
      public ExchangeData addServicer(@RequestBody ServicerModel servicerModel,HttpServletRequest request)
      {
    	  ExchangeData<Object> exchangeData = new ExchangeData<Object>();
    	  try {
			servicerService.addServicer(servicerModel);
		} catch (Exception e) {
			exchangeData.markException(e);
		}
    	  return exchangeData;
      }
      
      /** 
	    * @Title queryServerType 
	    * @Description TODO(获取全部/条件查询) 
	    * @author RodulphLiu
	    * @Date 2017年8月15日
	   */
    @RequestMapping(value="/queryServerInit.hjrz")
      public ModelAndView queryServerType(ServicerQuery servicerQuery,
    		  HttpServletRequest request,HttpServletResponse response){
    	  ModelAndView modelAndView = new ModelAndView();
    	  try {
			List<ServicerModel> servicerModels = servicerService.findbyContion(servicerQuery);
			modelAndView.addObject("servicerList",servicerModels);
			modelAndView.setViewName("servicer/list_servicer");
		} catch (Exception e) {
			modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
	          modelAndView.addObject("message","服务器列表查询异常，请联系管理员");
		}
    	  return modelAndView;
      }
    
    /** 
     * @Title getInit 
     * @Description TODO(获取服务器详细信息) 
     * @author RodulphLiu
     * @Date 2017年8月15日
     */
    @RequestMapping(value="/serverDetail.hjrz")
    public ModelAndView getInit(Integer serverCode
    		,HttpServletRequest request,HttpServletResponse response){
    	ModelAndView modelAndView = new ModelAndView();
    	try {
			ServicerModel servicerModel = servicerService.get(serverCode);
			modelAndView.addObject("servicerModel",servicerModel);
			modelAndView.setViewName("servicer/detail_servicer");
		} catch (Exception e) {
			 modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
	         modelAndView.addObject("message", "获取信息失败！");
	         modelAndView.setViewName("500");
		}
    	return modelAndView;
    }
}
