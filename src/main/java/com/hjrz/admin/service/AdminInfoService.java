package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.Admin_infoMapper;

/**
 * @ClassName AdminInfoService
 * @Description TODO(管理员信息服务)
 * @author RodulphLiu
 * @Date 2017年5月2日 下午2:37:48
 * @version 1.0.0
 */
@Service
public class AdminInfoService {
    
      @Autowired
      private Admin_infoMapper admin_infoMapper;
      
      
}
