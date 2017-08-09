package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.form.DynamicForm;
import com.hjrz.admin.service.DynamicService;

/**
 * @ClassName DynamicController
 * @Description TODO(动态控制器)
 * @author RudolphLiu
 * @Date 2017年7月4日 下午5:42:24
 * @version 1.0.0
 */
@Controller
@RequestMapping("/dynamic")
public class DynamicController {
    
      @Autowired
      private DynamicService dynamicService;
      
      @RequestMapping(value="/toadd",method=RequestMethod.GET)
      public String toaddDynamic(HttpServletRequest request,HttpServletResponse response){
         return "dynamic/dynamic_add";
      }
      
      
      public ModelAndView add(DynamicForm dynamicForm){
        ModelAndView modelAndView = new ModelAndView();
        try {
           dynamicService.addDynamic(dynamicForm);
        } catch (Exception e) {
          // TODO: handle exception
        }
        return modelAndView;
      }
}
