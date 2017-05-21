package com.hjrz.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hjrz.admin.service.WorkStaTypeService;
import com.hjrz.admin.service.WorkstationService;

/**
 * @ClassName WorkStationController
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月21日 下午10:56:48
 * @version 1.0.0
 */
@Controller
@RequestMapping(value="/workstation")
public class WorkStationController {
    
    @Autowired
    private WorkStaTypeService workStaTypeService;
    
    @Autowired
    private WorkstationService workstationService;
}
