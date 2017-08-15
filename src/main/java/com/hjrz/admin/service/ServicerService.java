package com.hjrz.admin.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.print.attribute.standard.RequestingUserName;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.ServicerEnum;
import com.hjrz.admin.dao.Server_infoMapper;
import com.hjrz.admin.dao.ServicerMapper;
import com.hjrz.admin.entity.Server_info;
import com.hjrz.admin.entity.Servicer;
import com.hjrz.admin.exception.SYSException;
import com.hjrz.admin.form.ServicerQuery;
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
       * @throws InvocationTargetException 
       * @throws IllegalAccessException 
       * @throws Exception
       */
      public void addServicer(ServicerModel servicerModel)
    		throws SYSException, IllegalAccessException, InvocationTargetException
      {
    	  Servicer servicer = new Servicer();
    	  servicer.setServerName(servicerModel.getServerName());
    	  servicer.setServerType(servicerModel.getServerType());
    	  servicer.setServerState(ServicerEnum.EXIST);
    	  
    	  servicermapper.insert(servicer);
    	  System.out.println("xxxxxxxxx"+servicer.getServerCode());
    	  Server_info server_info = new Server_info();
    	  server_info.setServerCode(servicer.getServerCode());
    	  server_info.setSiProcessor(servicerModel.getSiProcessor());
    	  server_info.setCpuMixNumber(servicerModel.getCpuMixNumber());
    	  server_info.setSibrandName(servicerModel.getSibrandName());
    	  server_info.setSiSize(servicerModel.getSiSize());
    	  server_info.setSihardamount(servicerModel.getSihardamount());
    	  server_info.setSioperSystem(servicerModel.getSioperSystem());
    	  server_info.setSiCPURAM(servicerModel.getSiCPURAM());
    	  server_info.setProductdesc(servicerModel.getProductdesc());
    	  server_info.setSiDetails(servicerModel.getSiDetails());
    	  
    	  server_infoMapper.insert(server_info);
      }
      
      	/** 
	     * @Title findbyContion 
	     * @Description TODO(显示全部/条件查询) 
	     * @author RodulphLiu
	     * @Date 2017年8月15日
	     */
	    public List<ServicerModel> findbyContion(ServicerQuery servicerQuery)throws Exception
	    {
	    	List<ServicerModel> servicers = servicermapper.queryforServerInfo(servicerQuery);
	    	return servicers;
	    }
	    
	    /** 
	     * @Title get 
	     * @Description TODO(根据ID获取详细信息) 
	     * @author RodulphLiu
	     * @Date 2017年8月15日
	     */
	    public ServicerModel get(Integer id)throws Exception{
	    	ServicerModel servicerModel = servicermapper.selectByServerCode(id);
	    	return servicerModel;
	    }
}
