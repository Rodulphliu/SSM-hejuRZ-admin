package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.Server_infoMapper;
import com.hjrz.admin.dao.ServicerMapper;
import com.hjrz.admin.entity.Server_info;
import com.hjrz.admin.entity.Servicer;
import com.hjrz.admin.model.ServicerModel;

/**
 * @ClassName ServicerService
 * @Description TODO(服务器管理服务类)
 * @author RudolphLiu
 * @Date 2017年5月17日 下午3:47:59
 * @version 1.0.0
 */
@Service("ServicerService")
public class ServicerService {
      
	  @Autowired
	  private ServicerMapper servicermapper;
	
      @Autowired
      private Server_infoMapper server_infoMapper;
     
      /**
       * 添加服务器
       * @param servicer
       * @param server_info
       * @throws Exception
       */
      public void addServicer(ServicerModel servicerModel)throws Exception{
    	  servicermapper.insertSelective(servicer);
      }
      
}
