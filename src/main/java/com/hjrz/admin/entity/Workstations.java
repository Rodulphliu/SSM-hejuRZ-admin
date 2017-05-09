package com.hjrz.admin.entity;

import java.util.Date;

public class Workstations {
    private Integer wksCode;

    private String wksname;

    private String wksType;

    private String wksState;

    private Date create_time;

    public Integer getWksCode() {
        return wksCode;
    }

    public void setWksCode(Integer wksCode) {
        this.wksCode = wksCode;
    }

    public String getWksname() {
        return wksname;
    }

    public void setWksname(String wksname) {
        this.wksname = wksname == null ? null : wksname.trim();
    }

    public String getWksType() {
        return wksType;
    }

    public void setWksType(String wksType) {
        this.wksType = wksType == null ? null : wksType.trim();
    }

    public String getWksState() {
        return wksState;
    }

    public void setWksState(String wksState) {
        this.wksState = wksState == null ? null : wksState.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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
        Workstations other = (Workstations) that;
        return (this.getWksCode() == null ? other.getWksCode() == null : this.getWksCode().equals(other.getWksCode()))
            && (this.getWksname() == null ? other.getWksname() == null : this.getWksname().equals(other.getWksname()))
            && (this.getWksType() == null ? other.getWksType() == null : this.getWksType().equals(other.getWksType()))
            && (this.getWksState() == null ? other.getWksState() == null : this.getWksState().equals(other.getWksState()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWksCode() == null) ? 0 : getWksCode().hashCode());
        result = prime * result + ((getWksname() == null) ? 0 : getWksname().hashCode());
        result = prime * result + ((getWksType() == null) ? 0 : getWksType().hashCode());
        result = prime * result + ((getWksState() == null) ? 0 : getWksState().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}