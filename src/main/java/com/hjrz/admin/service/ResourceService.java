package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.ResourceMapper;

/**
 * @ClassName ResourceService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月10日 上午11:38:38
 * @version 1.0.0
 */
@Service("ResourceService")
public class ResourceService {
    
      @Autowired
     private ResourceMapper resourceMapper;
      
     
     
     
}
