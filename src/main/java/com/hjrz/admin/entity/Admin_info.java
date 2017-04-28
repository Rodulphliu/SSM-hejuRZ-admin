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

    public Admin_info(Integer adminfocode, String realname, String admsex, String admphone, String admDuty, String headpath, String admemail, Integer admcode) {
        this.adminfocode = adminfocode;
        this.realname = realname;
        this.admsex = admsex;
        this.admphone = admphone;
        this.admDuty = admDuty;
        this.headpath = headpath;
        this.admemail = admemail;
        this.admcode = admcode;
    }

    public Admin_info() {
        super();
    }

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
}