package com.hjrz.admin.entity;

public class User_detail_info {
    private Integer user_detail_Code;

    private Integer user_basic_Code;

    private String user_email;

    private String user_realname;

    private String user_sex;

    private String user_address;

    public Integer getUser_detail_Code() {
        return user_detail_Code;
    }

    public void setUser_detail_Code(Integer user_detail_Code) {
        this.user_detail_Code = user_detail_Code;
    }

    public Integer getUser_basic_Code() {
        return user_basic_Code;
    }

    public void setUser_basic_Code(Integer user_basic_Code) {
        this.user_basic_Code = user_basic_Code;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email == null ? null : user_email.trim();
    }

    public String getUser_realname() {
        return user_realname;
    }

    public void setUser_realname(String user_realname) {
        this.user_realname = user_realname == null ? null : user_realname.trim();
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex == null ? null : user_sex.trim();
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address == null ? null : user_address.trim();
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
        User_detail_info other = (User_detail_info) that;
        return (this.getUser_detail_Code() == null ? other.getUser_detail_Code() == null : this.getUser_detail_Code().equals(other.getUser_detail_Code()))
            && (this.getUser_basic_Code() == null ? other.getUser_basic_Code() == null : this.getUser_basic_Code().equals(other.getUser_basic_Code()))
            && (this.getUser_email() == null ? other.getUser_email() == null : this.getUser_email().equals(other.getUser_email()))
            && (this.getUser_realname() == null ? other.getUser_realname() == null : this.getUser_realname().equals(other.getUser_realname()))
            && (this.getUser_sex() == null ? other.getUser_sex() == null : this.getUser_sex().equals(other.getUser_sex()))
            && (this.getUser_address() == null ? other.getUser_address() == null : this.getUser_address().equals(other.getUser_address()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser_detail_Code() == null) ? 0 : getUser_detail_Code().hashCode());
        result = prime * result + ((getUser_basic_Code() == null) ? 0 : getUser_basic_Code().hashCode());
        result = prime * result + ((getUser_email() == null) ? 0 : getUser_email().hashCode());
        result = prime * result + ((getUser_realname() == null) ? 0 : getUser_realname().hashCode());
        result = prime * result + ((getUser_sex() == null) ? 0 : getUser_sex().hashCode());
        result = prime * result + ((getUser_address() == null) ? 0 : getUser_address().hashCode());
        return result;
    }
}