package com.hjrz.admin.entity;

import java.util.Date;

import com.hjrz.admin.constants.AdminStatusEnum;

public class Admin {
    private Integer admcode;

    private String admname;

    private String admpassword;

    private Date create_time;

    private AdminStatusEnum adminstate;

    private Date last_time;

    public Admin(Integer admcode, String admname, String admpassword, Date create_time, AdminStatusEnum adminstate, Date last_time) {
        this.admcode = admcode;
        this.admname = admname;
        this.admpassword = admpassword;
        this.create_time = create_time;
        this.adminstate = adminstate;
        this.last_time = last_time;
    }

    public Admin() {
        super();
    }

    public Integer getAdmcode() {
        return admcode;
    }

    public void setAdmcode(Integer admcode) {
        this.admcode = admcode;
    }

    public String getAdmname() {
        return admname;
    }

    public void setAdmname(String admname) {
        this.admname = admname == null ? null : admname.trim();
    }

    public String getAdmpassword() {
        return admpassword;
    }

    public void setAdmpassword(String admpassword) {
        this.admpassword = admpassword == null ? null : admpassword.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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
}