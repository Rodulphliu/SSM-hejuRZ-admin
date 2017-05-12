package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.constants.CallStatusEnum;
import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.ServerType;
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
      @SuppressWarnings("rawtypes")
      @RequestMapping(value="/addservertype.do",method= RequestMethod.POST)
      public ExchangeData addServerType(ServerType serverType)
      {
        ExchangeData<Object> exchangeData = new ExchangeData<Object>();
        try {
          serverTypeService.addServerType(serverType);
        } catch (Exception e){ 
          exchangeData.markException(e);
        }
        return exchangeData;
      }
}
