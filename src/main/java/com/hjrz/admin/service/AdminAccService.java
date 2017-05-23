package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.AdminStatusEnum;
import com.hjrz.admin.dao.AdminMapper;
import com.hjrz.admin.entity.Admin;
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
       * @Description (添加管理员账号)
       * @author RodulphLiu
       * @Date 2017年5月2日 下午1:18:37
       */
      public void addAdminAccount(Admin admin) throws SYSException
      {
        String encryptPassword = EncryptUtil.getMD5String(admin.getAdmpassword());
        admin.setAdmpassword(encryptPassword);
        admin.setAdminstate(AdminStatusEnum.VALID);
        adminMapper.insertSelective(admin);
      }
}
