package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HomePageController
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年5月3日 下午5:03:05
 * @version 1.0.0
 */
@Controller
@RequestMapping("/common/home")
public class HomePageController {
    
    @RequestMapping(value="/index.do")
    public String index(HttpServletRequest request, HttpServletResponse response)
    {
        return "sys/sys_index";
    }
}
