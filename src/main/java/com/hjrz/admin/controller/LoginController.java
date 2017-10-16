package com.hjrz.admin.controller;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.exception.LoginException;
import com.hjrz.admin.form.LoginForm;
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
public class LoginController {
    
    @Autowired
    private LoginService loginService;
  
    /**
     * @Description (初始化登录页面)
     * @author RodulphLiu
     * @Date 2017年4月28日 下午5:35:07
     */
    @RequestMapping(value="/login.hjrz",method=RequestMethod.GET)
    public ModelAndView loginInit(HttpServletRequest request,HttpServletResponse response)
    {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("sys/admin_login");
       return modelAndView;
    }
    
    /**
     * @Description (登录)
     * @author RodulphLiu
     * @Date 2017年4月28日 下午5:38:19
     */
    @SuppressWarnings("rawtypes")
	@RequestMapping(value="/logininit.hjrz",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ExchangeData login(@Valid @RequestBody LoginForm loginForm,HttpServletRequest request)
    {
    	ExchangeData<Object> exchangeData = new ExchangeData<Object>();
        HttpSession session = request.getSession();
        try {
            AdminAccountModel  adminAccountModel = loginService.adminLogin(loginForm,request);
            session.setAttribute("adminname",adminAccountModel.getAdmname());
        }catch (LoginException | IllegalAccessException | InvocationTargetException e) {
        	exchangeData.markFail();
            exchangeData.setMessage(e.getMessage());
        }catch (Exception e) {
        	exchangeData.markFail();
            exchangeData.setMessage(e.getMessage());
        }
        return exchangeData;
    }
}
