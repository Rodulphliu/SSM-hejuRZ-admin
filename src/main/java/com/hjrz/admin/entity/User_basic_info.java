package com.hjrz.admin.entity;

import java.util.Date;

public class User_basic_info {
    private Integer user_basic_Code;

    private String user_login_phone;

    private String user_password;

    private String user_info_state;

    private Date create_time;

    private Date last_login_time;

    public Integer getUser_basic_Code() {
        return user_basic_Code;
    }

    public void setUser_basic_Code(Integer user_basic_Code) {
        this.user_basic_Code = user_basic_Code;
    }

    public String getUser_login_phone() {
        return user_login_phone;
    }

    public void setUser_login_phone(String user_login_phone) {
        this.user_login_phone = user_login_phone == null ? null : user_login_phone.trim();
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password == null ? null : user_password.trim();
    }

    public String getUser_info_state() {
        return user_info_state;
    }

    public void setUser_info_state(String user_info_state) {
        this.user_info_state = user_info_state == null ? null : user_info_state.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User_basic_info other = (User_basic_info) that;
        return (this.getUser_basic_Code() == null ? other.getUser_basic_Code() == null : this.getUser_basic_Code().equals(other.getUser_basic_Code()))
            && (this.getUser_login_phone() == null ? other.getUser_login_phone() == null : this.getUser_login_phone().equals(other.getUser_login_phone()))
            && (this.getUser_password() == null ? other.getUser_password() == null : this.getUser_password().equals(other.getUser_password()))
            && (this.getUser_info_state() == null ? other.getUser_info_state() == null : this.getUser_info_state().equals(other.getUser_info_state()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getLast_login_time() == null ? other.getLast_login_time() == null : this.getLast_login_time().equals(other.getLast_login_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser_basic_Code() == null) ? 0 : getUser_basic_Code().hashCode());
        result = prime * result + ((getUser_login_phone() == null) ? 0 : getUser_login_phone().hashCode());
        result = prime * result + ((getUser_password() == null) ? 0 : getUser_password().hashCode());
        result = prime * result + ((getUser_info_state() == null) ? 0 : getUser_info_state().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getLast_login_time() == null) ? 0 : getLast_login_time().hashCode());
        return result;
    }
}