package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.ServicerMapper;

/**
 * @ClassName ServicerService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月17日 下午3:47:59
 * @version 1.0.0
 */
@Service
public class ServicerService {
    
      @Autowired
      private ServicerMapper servicerMapper;
      
      
}
