package com.hjrz.admin.controller;

import java.lang.reflect.InvocationTargetException;

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

import com.hjrz.admin.exception.LoginException;
import com.hjrz.admin.model.AdminAccountModel;
import com.hjrz.admin.service.LoginService;

/**
 * @ClassName LoginController
 * @Description TODO(登录控制器)
 * @author RodulphLiu
 * @Date 2017年4月28日 下午5:17:58
 * @version 1.0.0
 */
@Controller
@RequestMapping(value="/login")
public class LoginController {
    
    @Autowired
    private LoginService loginService;
  
    /**
     * @Description (初始化登录页面)
     * @author RodulphLiu
     * @Date 2017年4月28日 下午5:35:07
     */
    @RequestMapping(value="/addInit.do",method=RequestMethod.GET)
    public ModelAndView loginInit(HttpServletRequest request,HttpServletResponse response)
    {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("admin_login");
       return modelAndView;
    }
    
    /**
     * @Description (登录)
     * @author RodulphLiu
     * @Date 2017年4月28日 下午5:38:19
     */
    @RequestMapping(value = "/login.do",method = {RequestMethod.POST})
    public ModelAndView login(AdminAccountModel adminAccountModel,HttpServletRequest request,
        HttpServletResponse response)
    {
        ModelAndView modelAndView = new ModelAndView();
        try {
            loginService.adminLogin(adminAccountModel, request, response);
            modelAndView.setViewName("success");
        } catch (LoginException | IllegalAccessException | InvocationTargetException e) {
            modelAndView.addObject("message",e.getMessage());
            modelAndView.setViewName("howno");
        }catch (Exception e) {
            modelAndView.addObject("message",e.getMessage());
            modelAndView.setViewName("howno");
        }
        return modelAndView;
    }
    
    
}
