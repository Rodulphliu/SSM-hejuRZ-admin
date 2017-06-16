package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.Admin_infoMapper;
import com.hjrz.admin.entity.Admin;
import com.hjrz.admin.entity.Admin_info;
import com.hjrz.admin.exception.SYSException;

/**
 * @ClassName AdminInfoService
 * @Description TODO(管理员信息服务)
 * @author RodulphLiu
 * @Date 2017年5月2日 下午2:37:48
 * @version 1.0.0
 */
@Service("AdminInfoService")
public class AdminInfoService {
    
      @Autowired
      private Admin_infoMapper admin_infoMapper;
      
      /**
       * @Description(管理员添加信息)
       * @author RodulphLiu
       * @Date 2017年5月4日 上午10:39:29
       */
      public void addAdminInfo(Admin_info admin_info)throws Exception{
          Integer admcode = admin_info.getAdmcode();
            if(admcode==0 ||admcode==null)
            {
              throw new Exception("系统异常，无法为此账号添加详细信息");
            }
          int successNum = admin_infoMapper.insertSelective(admin_info);
            if(successNum<1)
            {
              throw new Exception("管理员信息添加失败");
            }
      }
      
        /**
         * @Description (根据adminCode获取用户详细信息)
         * @author RudolphLiu
         * @Date 2017年6月16日 下午6:08:14
         */
        public Admin_info getInfoByID(Integer adminfocode)throws SYSException{
            Admin_info admin_info =  admin_infoMapper.selectByPrimaryKey(adminfocode);
            return admin_info;
        } 
}
