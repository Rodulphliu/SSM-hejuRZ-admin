package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.ServicerMapper;
import com.hjrz.admin.entity.Servicer;
import com.hjrz.admin.exception.ServicerException;

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
      
      /**
       * @Description (添加服务器)
       * @author RudolphLiu
       * @Date 2017年5月18日 下午5:45:46
       */
      public void addServicer(Servicer servicer)throws Exception{
          int key = servicerMapper.insertSelective(servicer);
          if(key<1){
            throw new ServicerException("添加服务器失败");
          }
      }
      
      
}
