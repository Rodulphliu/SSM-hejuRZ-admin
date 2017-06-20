package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.constants.CallStatusEnum;
import com.hjrz.admin.dao.AbstractCacheService;
import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.Admin;
import com.hjrz.admin.exception.AdminException;
import com.hjrz.admin.model.AdminAccountModel;
import com.hjrz.admin.service.AdminAccService;

/**
 * @ClassName AdminController
 * @Description TODO(管理员账号控制器)
 * @author RodulphLiu
 * @Date 2017年4月27日 下午5:54:57
 * @version 1.0.0
 */
@Controller
@RequestMapping(value="/Account")
public class AdminController {
    
    @Autowired
    private AdminAccService adminAccService;
    
    /**
     * @Description (跳转至添加管理员账号页面)
     * @author RodulphLiu
     * @Date 2017年4月27日 下午6:00:39
     */
    @RequestMapping(value="/addInit.do")
    public String addInIt(HttpServletRequest request,HttpServletResponse response)
    {
          try {
                HttpSession session = request.getSession();
              adminAccService.AuthorizationVerification((AdminAccountModel) session.getAttribute("adminAccountModel"));
              return "add_admin";
          } catch (AdminException e) {
              request.setAttribute("", e.getMessage());
          }catch (Exception e) {
              request.setAttribute("message", "");
          }
          return null;
    }
    
    /**
     * @Description (添加管理员账号)
     * @author RodulphLiu
     * @Date 2017年5月1日 下午4:20:26
     */
    @RequestMapping(value="/add.do",method=RequestMethod.POST)
    public ModelAndView add(AdminAccountModel adminAccountModel,HttpServletRequest request)
    {
            ModelAndView modelAndView = new ModelAndView();
            ExchangeData<Object> exchangeData = new ExchangeData<Object>();
            try {
              adminAccService.addAdminAccount(adminAccountModel);
              modelAndView.setViewName("success");
              modelAndView.addObject("exchangeData",exchangeData);
            } catch (Exception e) {
              modelAndView.setViewName("500");
              exchangeData.setCallStatus(CallStatusEnum.FAIL);
              exchangeData.setMessage("系统错误，请联系管理员");
            }
            return modelAndView;
    }
    
}
