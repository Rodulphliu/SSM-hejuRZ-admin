package com.hjrz.admin.service;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtilsBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.AdminStatusEnum;
import com.hjrz.admin.constants.CachekeyPrefix;
import com.hjrz.admin.dao.AbstractCacheService;
import com.hjrz.admin.dao.AdminMapper;
import com.hjrz.admin.dao.Admin_infoMapper;
import com.hjrz.admin.entity.Admin;
import com.hjrz.admin.entity.Admin_info;
import com.hjrz.admin.exception.LoginException;
import com.hjrz.admin.exception.SYSException;
import com.hjrz.admin.form.LoginForm;
import com.hjrz.admin.model.AdminAccountModel;
import com.hjrz.admin.util.EncryptUtil;

/**
 * @ClassName LoginService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月28日 下午3:41:38
 * @version 1.0.0
 */
@Service("LoginService")
public class LoginService {
    @Autowired
    private AbstractCacheService cacheService;
    
    @Autowired
    private AdminMapper adminMapper;
    
    @Autowired
    private Admin_infoMapper admin_infoMapper;
    
    
    /**
     * @Description (登录)
     * @author RodulphLiu
     * @Date 2017年4月28日 下午5:24:32
     */
    public AdminAccountModel adminLogin(LoginForm loginForm,HttpServletRequest request,
        HttpServletResponse response)
            throws LoginException,SYSException,IllegalAccessException, InvocationTargetException
    {
            AdminAccountModel aam = new AdminAccountModel();
            //取得用户输入的MD5值密码与数据库中的相比较
            String encryptPassword  = EncryptUtil.getMD5String(loginForm.getAdmpassword());
            loginForm.setAdmpassword(encryptPassword);
            Admin admin = adminMapper.adminAccountLogin(loginForm);
            if(admin == null){
              throw new LoginException("用户名或密码不正确");
            }
            if(admin.getAdminstate()!=AdminStatusEnum.VALID){
              throw new LoginException("管理员账号"+admin.getAdmname()+"不可用，请联系管理员");
            }
            Admin_info admin_info = admin_infoMapper.selectByPrimaryKey(admin.getAdmcode());
            //赋值给AdminAccountModel
            BeanUtilsBean2.getInstance().copyProperties(aam, admin);
            BeanUtilsBean2.getInstance().copyProperties(aam, admin_info);
            cacheService.putKey(CachekeyPrefix.ADMIN_ACC_CORE+admin.getAdmcode(),aam,AbstractCacheService.HALFDAY);
             return aam;
          } 
    
    }
