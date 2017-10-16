package com.hjrz.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.constants.CallStatusEnum;
import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.HomeColumn;
import com.hjrz.admin.service.HomeColumnService;

/**
 * @ClassName HomeColumnController(首页栏目控制器)
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月25日 下午2:12:22
 * @version 1.0.0
 */
@Controller
@RequestMapping(value="/HomeColumn")
public class HomeColumnController {
      
      @Autowired
      private HomeColumnService homeColumnService;
      
      
      /**
       * @Description (查看首页栏目)
       * @author RudolphLiu
       * @Date 2017年5月25日 下午5:02:33
       */
      @RequestMapping(value="/list.hjrz",method=RequestMethod.GET)
      public ModelAndView queryhomeclumn(HomeColumn homeColumn)
      {
        ModelAndView modelAndView = new ModelAndView();
        try {
          List<HomeColumn> homeColumns = homeColumnService.findBycontion(homeColumn);
          modelAndView.addObject("homeColumns",homeColumns);
          modelAndView.setViewName("reception/homecolumn");
        } catch (Exception e) {
          modelAndView.addObject("CallStatusEnum",CallStatusEnum.FAIL);
          modelAndView.addObject("message","查询异常");
        }
        return modelAndView;
      }
      
      /**
       * @Description (初始化管理页面)
       * @author RudolphLiu
       * @Date 2017年5月25日 下午4:20:29
       */
      @RequestMapping(value="/toadd.hjrz",method=RequestMethod.GET)
      public ModelAndView addInIt(){
          ModelAndView modelAndView = new ModelAndView();
          try {
            modelAndView.setViewName("reception/addcolumn");
          } catch (Exception e) {
            modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
            modelAndView.addObject("message","系统错误，请联系管理员！");
            modelAndView.setViewName("500");;
          }
          return modelAndView;
      }
      
      @RequestMapping(value="/add.hjrz",method=RequestMethod.POST)
      public ModelAndView add(HomeColumn homeColumn){
          ModelAndView modelAndView = new ModelAndView();
          ExchangeData<Object> exchangeData = new ExchangeData<Object>();
          try {
            homeColumnService.add(homeColumn);
            modelAndView.addObject("exchangeDate",exchangeData);
          } catch (Exception e) {
            exchangeData.markException(e);
            modelAndView.addObject("exchangeData");
          }
          return modelAndView;
      }
      
}
