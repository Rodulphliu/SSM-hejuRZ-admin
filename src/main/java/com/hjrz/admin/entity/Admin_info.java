package com.hjrz.admin.entity;

public class Admin_info {
    private Integer adminfocode;

    private String realname;

    private String admsex;

    private String admphone;

    private String admDuty;

    private String headpath;

    private String admemail;

    private Integer admcode;

    public Integer getAdminfocode() {
        return adminfocode;
    }

    public void setAdminfocode(Integer adminfocode) {
        this.adminfocode = adminfocode;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getAdmsex() {
        return admsex;
    }

    public void setAdmsex(String admsex) {
        this.admsex = admsex == null ? null : admsex.trim();
    }

    public String getAdmphone() {
        return admphone;
    }

    public void setAdmphone(String admphone) {
        this.admphone = admphone == null ? null : admphone.trim();
    }

    public String getAdmDuty() {
        return admDuty;
    }

    public void setAdmDuty(String admDuty) {
        this.admDuty = admDuty == null ? null : admDuty.trim();
    }

    public String getHeadpath() {
        return headpath;
    }

    public void setHeadpath(String headpath) {
        this.headpath = headpath == null ? null : headpath.trim();
    }

    public String getAdmemail() {
        return admemail;
    }

    public void setAdmemail(String admemail) {
        this.admemail = admemail == null ? null : admemail.trim();
    }

    public Integer getAdmcode() {
        return admcode;
    }

    public void setAdmcode(Integer admcode) {
        this.admcode = admcode;
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
        Admin_info other = (Admin_info) that;
        return (this.getAdminfocode() == null ? other.getAdminfocode() == null : this.getAdminfocode().equals(other.getAdminfocode()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getAdmsex() == null ? other.getAdmsex() == null : this.getAdmsex().equals(other.getAdmsex()))
            && (this.getAdmphone() == null ? other.getAdmphone() == null : this.getAdmphone().equals(other.getAdmphone()))
            && (this.getAdmDuty() == null ? other.getAdmDuty() == null : this.getAdmDuty().equals(other.getAdmDuty()))
            && (this.getHeadpath() == null ? other.getHeadpath() == null : this.getHeadpath().equals(other.getHeadpath()))
            && (this.getAdmemail() == null ? other.getAdmemail() == null : this.getAdmemail().equals(other.getAdmemail()))
            && (this.getAdmcode() == null ? other.getAdmcode() == null : this.getAdmcode().equals(other.getAdmcode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdminfocode() == null) ? 0 : getAdminfocode().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getAdmsex() == null) ? 0 : getAdmsex().hashCode());
        result = prime * result + ((getAdmphone() == null) ? 0 : getAdmphone().hashCode());
        result = prime * result + ((getAdmDuty() == null) ? 0 : getAdmDuty().hashCode());
        result = prime * result + ((getHeadpath() == null) ? 0 : getHeadpath().hashCode());
        result = prime * result + ((getAdmemail() == null) ? 0 : getAdmemail().hashCode());
        result = prime * result + ((getAdmcode() == null) ? 0 : getAdmcode().hashCode());
        return result;
    }
}