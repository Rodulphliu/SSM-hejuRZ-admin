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

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((admcode == null) ? 0 : admcode.hashCode());
      result = prime * result + ((adminstate == null) ? 0 : adminstate.hashCode());
      result = prime * result + ((admname == null) ? 0 : admname.hashCode());
      result = prime * result + ((admpassword == null) ? 0 : admpassword.hashCode());
      result = prime * result + ((create_time == null) ? 0 : create_time.hashCode());
      result = prime * result + ((last_time == null) ? 0 : last_time.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Admin other = (Admin) obj;
      if (admcode == null) {
        if (other.admcode != null)
          return false;
      } else if (!admcode.equals(other.admcode))
        return false;
      if (adminstate != other.adminstate)
        return false;
      if (admname == null) {
        if (other.admname != null)
          return false;
      } else if (!admname.equals(other.admname))
        return false;
      if (admpassword == null) {
        if (other.admpassword != null)
          return false;
      } else if (!admpassword.equals(other.admpassword))
        return false;
      if (create_time == null) {
        if (other.create_time != null)
          return false;
      } else if (!create_time.equals(other.create_time))
        return false;
      if (last_time == null) {
        if (other.last_time != null)
          return false;
      } else if (!last_time.equals(other.last_time))
        return false;
      return true;
    }
    
    
}