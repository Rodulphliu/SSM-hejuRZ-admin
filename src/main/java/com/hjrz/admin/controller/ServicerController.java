package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.constants.CallStatusEnum;
import com.hjrz.admin.data.ExchangeData;
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
      @RequestMapping(value="/toaddservicer")
      public ModelAndView addInit(){
          ModelAndView modelAndView = new ModelAndView();
          try {
            modelAndView.setViewName("servicer/addServicer");
          } catch (Exception e) {
            modelAndView.addObject("callStatus", CallStatusEnum.FAIL);
            modelAndView.addObject("message", "系统错误，请联系管理员！");
            modelAndView.setViewName("500");
          }
          return modelAndView; 
      }
      
      public @ResponseBody ExchangeData addServicer(@RequestBody ServicerModel servicerModel,
    		  HttpServletRequest request)
      {
    	  ExchangeData<Object> exchangeData = new ExchangeData<Object>();
    	  try {
			servicerService.addServicer(servicer, server_info);
		} catch (Exception e) {
			// TODO: handle exception
		}
      }
}

