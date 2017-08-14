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

import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.ServerType;
import com.hjrz.admin.form.ServerTypeQuery;
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
      @RequestMapping(value="/toaddservicer.do")
      public String addInit(ServerTypeQuery serverTypeQuery,HttpServletRequest request,HttpServletResponse response){
    	  List<ServerType> serverTypes = serverTypeService.findbyContion(serverTypeQuery);
    	  request.setAttribute("serverTypes",serverTypes);
    	  return "servicer/add_servicer";
      }
      
      
    /** 
     * @Title addServicer 
     * @Description TODO(添加服务器属性) 
     * @author RodulphLiu
     * @Date 2017年8月11日
     */
      @SuppressWarnings("rawtypes")
      @RequestMapping(value="/addservicer.do",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
      public @ResponseBody ExchangeData addServicer(@RequestBody ServicerModel servicerModel,HttpServletRequest request)
      {
    	  ExchangeData<Object> exchangeData = new ExchangeData<Object>();
    	  try {
			servicerService.addServicer(servicerModel);
		} catch (Exception e) {
			exchangeData.markException(e);
		}
    	  return exchangeData;
      }
}
