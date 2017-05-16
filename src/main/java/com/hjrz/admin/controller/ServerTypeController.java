package com.hjrz.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ListModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.constants.CallStatusEnum;
import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.ServerType;
import com.hjrz.admin.form.ServerTypeQuery;
import com.hjrz.admin.service.ServerTypeService;
import com.mysql.fabric.Server;

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
       * @Description (初始化护服务器类型表)
       * @author RudolphLiu
       * @Date 2017年5月16日 下午2:27:32
       */
      @RequestMapping(value="/queryServerTypeInit.do",method=RequestMethod.GET)
      public ModelAndView findInit()
      {
        ModelAndView modelAndView = new ModelAndView();
        try {
          modelAndView.setViewName("servier/list_servertype");
        } catch (Exception e) {
          modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
          modelAndView.addObject("message","系统凑无，请联系管理与！");
          modelAndView.setViewName("500");
        }
        return modelAndView;
      }
      
      /**
       * @Description (查询服务器类型)
       * @author RudolphLiu
       * @Date 2017年5月16日 下午3:34:05
       */
      public ModelAndView queryServerType(ServerTypeQuery serverTypeQuery,
          HttpServletRequest request,HttpServletResponse response)
      {
         ModelAndView modelAndView = new ModelAndView();
        try {
          List<ServerType> serverTypes = serverTypeService.findbyContion(serverTypeQuery);
          int total = serverTypeService.countByQuery(serverTypeQuery);
          modelAndView.addObject("serverTypeList",serverTypes);
          modelAndView.addObject("serverTypetotal",total);
        } catch (Exception e) {
          modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
          modelAndView.addObject("message","服务器类型查询异常，请联系管理员");
        }
        return modelAndView;
      }
      
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
      @RequestMapping(value="/addservertype.do",method= RequestMethod.POST)
      public ModelAndView addServerType(ServerType serverType,HttpServletRequest request
          ,HttpServletResponse response)
      {
        ModelAndView modelAndView = new ModelAndView();
        ExchangeData<Object> exchangeData = new ExchangeData<Object>();
        try {
          serverTypeService.addServerType(serverType);
          modelAndView.addObject("exchangeData",exchangeData);
          modelAndView.setViewName("servicer/add_servertype");
        } catch (Exception e){
          modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
          modelAndView.addObject("message", "系统错误，请联系管理员！");
          modelAndView.setViewName("500");
        }
        return modelAndView;
      }
      
}
