package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.AdminAuthEnum;
import com.hjrz.admin.constants.AdminStatusEnum;
import com.hjrz.admin.dao.AdminMapper;
import com.hjrz.admin.entity.Admin;
import com.hjrz.admin.exception.AdminException;
import com.hjrz.admin.exception.SYSException;
import com.hjrz.admin.util.EncryptUtil;

/**
 * @ClassName AdminAccService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月27日 下午3:11:08
 * @version 1.0.0
 */
@Service("AdminAccService")
public class AdminAccService {
    
      @Autowired
      private AdminMapper adminMapper;
      
      /**
       * @Description (管理员权限验证)
       * @author RudolphLiu
       * @Date 2017年6月16日 下午3:36:17
       */
      public void AuthorizationVerification(AdminAuthEnum authEnum)throws SYSException,AdminException,Exception
      {
            if(authEnum.equals(AdminAuthEnum.ORDINARY)){
                    throw new AdminException("添加失败，添加管理员账号需要高级管理员权限");
            }
      }
      
      /**
       * @Description (添加管理员账号)
       * @author RodulphLiu
       * @Date 2017年5月2日 下午1:18:37
       */
      public void addAdminAccount(Admin admin) throws SYSException,AdminException
      {
            String encryptPassword = EncryptUtil.getMD5String(admin.getAdmpassword());
            admin.setAdmpassword(encryptPassword);
            admin.setAdminstate(AdminStatusEnum.VALID);
            adminMapper.insertSelective(admin);
      }
      
      
}
