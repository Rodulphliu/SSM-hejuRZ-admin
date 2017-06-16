package com.hjrz.admin.model;

import java.io.Serializable;
import java.util.Date;

import com.hjrz.admin.constants.AdminAuthEnum;
import com.hjrz.admin.constants.AdminStatusEnum;

/**
 * @ClassName AdminAccountModel
 * @Description TODO(管理员账号模型)
 * @author RodulphLiu
 * @Date 2017年4月28日 上午11:57:44
 * @version 1.0.0
 */
public class AdminAccountModel implements Serializable{

   private static final long serialVersionUID = 7741550805343358749L;

   //基本信息
    private String admin_name;
    private String admin_password;
    private AdminStatusEnum   adminstate;
    private Date last_time;
    
    //详细信息
    private String realname;
    private String admsex;
    private String admphone;
    private AdminAuthEnum  admDuty;
    
    private String headpath;
    private String admemail;
    
    public String getAdmin_name() {
      return admin_name;
    }
    public void setAdmin_name(String admin_name) {
      this.admin_name = admin_name;
    }
    public String getAdmin_password() {
      return admin_password;
    }
    public void setAdmin_password(String admin_password) {
      this.admin_password = admin_password;
    }
    public AdminStatusEnum getAdminstate() {
      return adminstate;
    }
    public void setAdminstate(AdminStatusEnum adminstate) {
      this.adminstate = adminstate;
    }
    public Date getLast_time() {
      return last_time;
    }
    public void setLast_time(Date last_time) {
      this.last_time = last_time;
    }
    public String getRealname() {
      return realname;
    }
    public void setRealname(String realname) {
      this.realname = realname;
    }
    public String getAdmsex() {
      return admsex;
    }
    public void setAdmsex(String admsex) {
      this.admsex = admsex;
    }
    public String getAdmphone() {
      return admphone;
    }
    public void setAdmphone(String admphone) {
      this.admphone = admphone;
    }
    public AdminAuthEnum getAdmDuty() {
      return admDuty;
    }
    public void setAdmDuty(AdminAuthEnum admDuty) {
      this.admDuty = admDuty;
    }
    public String getHeadpath() {
      return headpath;
    }
    public void setHeadpath(String headpath) {
      this.headpath = headpath;
    }
    public String getAdmemail() {
      return admemail;
    }
    public void setAdmemail(String admemail) {
      this.admemail = admemail;
    }
    public static long getSerialversionuid() {
      return serialVersionUID;
    }
    
}
