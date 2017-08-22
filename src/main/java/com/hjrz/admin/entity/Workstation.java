package com.hjrz.admin.entity;

import java.util.Date;

public class Workstation {
    private Long workscode;

    private String worksname;

    private Integer workstype;

    private String serverstate;

    private Date createTime;

    public Long getWorkscode() {
        return workscode;
    }

    public void setWorkscode(Long workscode) {
        this.workscode = workscode;
    }

    public String getWorksname() {
        return worksname;
    }

    public void setWorksname(String worksname) {
        this.worksname = worksname == null ? null : worksname.trim();
    }

    public Integer getWorkstype() {
        return workstype;
    }

    public void setWorkstype(Integer workstype) {
        this.workstype = workstype;
    }

    public String getServerstate() {
        return serverstate;
    }

    public void setServerstate(String serverstate) {
        this.serverstate = serverstate == null ? null : serverstate.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}