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
       * @Description (查询服务器类型列表)
       * @author RudolphLiu
       * @Date 2017年5月16日 下午3:34:05
       */
      @RequestMapping(value="/queryServerTypeInit.hjrz")
      public ModelAndView queryServerType(ServerTypeQuery serverTypeQuery,
          HttpServletRequest request,HttpServletResponse response)
      {
         ModelAndView modelAndView = new ModelAndView();
        try {
          List<ServerType> serverTypes = serverTypeService.findbyContion(serverTypeQuery);
          modelAndView.addObject("serverTypeList",serverTypes);
          modelAndView.setViewName("servicer/list_servertype");
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
      @RequestMapping(value = "/toaddServerType.hjrz",method=RequestMethod.GET)
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
       * @Description (获取服务器类型详细信息)
       * @author RudolphLiu
       * @Date 2017年5月18日 上午11:35:15
       */
      @RequestMapping(value="/ServerTypeDetail.hjrz")
      public ModelAndView getInit(Integer TypeCode,HttpServletRequest request){
          ModelAndView modelAndView = new ModelAndView();
          try {
            ServerType serverType = serverTypeService.get(TypeCode);
            modelAndView.addObject("serverType",serverType);
            modelAndView.setViewName("servicer/detail_serverType");
          } catch (Exception e) {
            modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
            modelAndView.addObject("message", "获取信息失败！");
            modelAndView.setViewName("500");
          }
          return modelAndView;
      }
      
      /**
       * @Description (初始化编辑界面)
       * @author RudolphLiu
       * @Date 2017年5月18日 上午11:48:13
       */
      @RequestMapping(value="/ServerTypeModify.hjrz")
      public ModelAndView modifyInit(Integer id,HttpServletRequest request,
          HttpServletResponse response){
          ModelAndView modelAndView = new ModelAndView();
          try {
            ServerType serverType = serverTypeService.get(id);
            modelAndView.addObject("serverType",serverType);
            modelAndView.setViewName("servicer/modify_serverType");
          } catch (Exception e) {
            modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
            modelAndView.addObject("message","获取信息失败！");
            modelAndView.setViewName("500");
          }
          return modelAndView;
      }
      
      /**
       * @Description (修改服务器类型信息)
       * @author RudolphLiu
       * @Date 2017年5月18日 上午11:59:32
       */
      @SuppressWarnings("rawtypes")
      @RequestMapping(value="/ModifyInfo.hjrz",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
      public @ResponseBody ExchangeData modifyServerType(@RequestBody ServerType serverType,HttpServletRequest request)
      {
          ExchangeData<Object> exchangeData = new ExchangeData<Object>();
          try {
            serverTypeService.modifyServerType(serverType);
          } catch (Exception e) {
        	  exchangeData.markException(e);
          }
          return exchangeData;
      }
      
      /**
       * @Description (添加服务器类型)
       * @author RudolphLiu
       * @Date 2017年5月11日 上午10:51:16
       */
	    @SuppressWarnings("rawtypes")
		@RequestMapping(value="/addservertype.hjrz",method= RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	      public @ResponseBody ExchangeData addServerType(@RequestBody ServerType serverType,HttpServletRequest request)
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
