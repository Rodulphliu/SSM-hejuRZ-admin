package com.hjrz.admin.service;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.AdminStatusEnum;
import com.hjrz.admin.dao.AdminMapper;
import com.hjrz.admin.entity.Admin;
import com.hjrz.admin.exception.LoginException;
import com.hjrz.admin.exception.SYSException;
import com.hjrz.admin.model.AdminAccountModel;
import com.hjrz.admin.util.EncryptUtil;

/**
 * @ClassName LoginService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月28日 下午3:41:38
 * @version 1.0.0
 */
@Service
public class LoginService {
    
    @Autowired
    private AdminMapper adminMapper;
    
    /**
     * @Description (登录)
     * @author RodulphLiu
     * @Date 2017年4月28日 下午5:24:32
     */
    public Boolean adminLogin(AdminAccountModel adminAccountModel,HttpServletRequest request,
        HttpServletResponse response)
            throws LoginException,SYSException,IllegalAccessException, InvocationTargetException
    {
      //取得用户输入的MD5值密码与数据库中的相比较
      String encryptPassword  = EncryptUtil.getMD5String(adminAccountModel.getAdmin_password());
      adminAccountModel.setAdmin_password(encryptPassword);
      Admin admin = adminMapper.adminAccountLogin(adminAccountModel);
      if(admin == null){
        throw new LoginException("用户名或密码错误");
      }
      if(admin.getAdminstate()!=AdminStatusEnum.VALID){
        throw new LoginException("管理员账号"+admin.getAdmname()+"不可用，请联系管理员");
      }
      //获取用户详细信息
//      Admin_info admin_info = admin_infoMapper.selectByPrimaryKey(admin.getAdmcode());
       return true;
    } 
    
    
}
