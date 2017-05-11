package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.constants.CallStatusEnum;
import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.model.ServerTypeModel;
import com.hjrz.admin.service.ServerTypeService;

/**
 * @ClassName ServerTypeController
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年5月3日 下午4:55:21
 * @version 1.0.0
 */
@Controller
@RequestMapping(value="/ServerType")
public class ServerTypeController {
      
      @Autowired
      private ServerTypeService serverTypeService;

      /**
       * @Description (跳转至添加服务器类)
       * @author RudolphLiu
       * @Date 2017年5月10日 下午5:15:31
       */
      @RequestMapping(value = "/toaddServerType.do",method=RequestMethod.GET)
      public ModelAndView addInit(){
          ModelAndView modelAndView = new ModelAndView();
          try {
            modelAndView.setViewName("servicer/add_servertype");
          } catch (Exception ex) {
            modelAndView.addObject("callStatus", CallStatusEnum.FAIL);
            modelAndView.addObject("message", "系统错误，请联系管理员！");
            modelAndView.setViewName("500");
        }
          return modelAndView;
      }
      
      
      /**
       * @Description (添加服务器类型方法)
       * @author RudolphLiu
       * @Date 2017年5月11日 上午10:51:16
       */
      @RequestMapping(value="/addServerType.do",method= RequestMethod.POST)
      public ModelAndView addServerType(ServerTypeModel serverTypeModel,HttpServletRequest request,
          HttpServletResponse response)
      {
        ModelAndView modelAndView = new ModelAndView();
        ExchangeData<Object> exchangeData = new ExchangeData<Object>();
        try {
          serverTypeService.addServerType(serverTypeModel);
          modelAndView.setViewName("sys/sys_index");
        } catch (Exception e){ 
          exchangeData.markException(e);
          modelAndView.addObject("exchangeData",exchangeData);
          modelAndView.addObject("message", "系统错误，请联系管理员！");
          modelAndView.setViewName("500");
        }
          return modelAndView;
      }
}
