package com.hjrz.admin.service;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.AdminAuthEnum;
import com.hjrz.admin.constants.AdminStatusEnum;
import com.hjrz.admin.dao.AdminMapper;
import com.hjrz.admin.dao.Admin_infoMapper;
import com.hjrz.admin.entity.Admin;
import com.hjrz.admin.entity.Admin_info;
import com.hjrz.admin.exception.AdminException;
import com.hjrz.admin.exception.SYSException;
import com.hjrz.admin.model.AdminAccountModel;
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
      
      @Autowired
      private Admin_infoMapper admin_infoMapper;
      
      /**
       * @Description (管理员资格验证)
       * @author RudolphLiu
       * @Date 2017年6月16日 下午3:36:17
       */
      public void AuthorizationVerification(AdminAccountModel adminAccountModel)throws SYSException,AdminException,Exception
      {
            AdminAuthEnum authEnum = adminAccountModel.getAdmDuty();
            AdminStatusEnum statusEnum = adminAccountModel.getAdminstate();
            if(authEnum.equals(AdminAuthEnum.ORDINARY)){
                    throw new AdminException("普通管理员没有权限添加管理员");
            }
            if(!statusEnum.equals(AdminStatusEnum.VALID)){
                    throw new AdminException("当前管理员账号不可用");
            }
      }
      
      /**
       * @Description (添加管理员账号)
       * @author RodulphLiu
       * @throws InvocationTargetException 
       * @throws IllegalAccessException 
       * @Date 2017年5月2日 下午1:18:37
       */
      public void addAdminAccount(AdminAccountModel  adminAccountModel) 
          throws SYSException,AdminException, IllegalAccessException, InvocationTargetException
      {
            String encryptPassword = EncryptUtil.getMD5String(adminAccountModel.getAdmpassword());
            adminAccountModel.setAdmpassword(encryptPassword);
            Admin admin = new Admin();
            admin.setAdminstate(AdminStatusEnum.VALID);
            BeanUtils.copyProperties(admin,adminAccountModel);
            adminMapper.insert(admin);
            Admin_info admin_info = new Admin_info();
            admin_info.setAdmDuty(AdminAuthEnum.ORDINARY);
            BeanUtils.copyProperties(admin_info,adminAccountModel);
            admin_infoMapper.insert(admin_info);
      }
      
      
}
