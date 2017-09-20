package com.hjrz.admin.entity;

import java.util.Date;

public class Stationcontext {
    private Long scCode;

    private String scTitle;

    private String scContext;

    private String scImageCode;

    private String scApath;

    private String scSource;

    private String scStatus;

    private Date create_time;

    private Date change_time;

    public Long getScCode() {
        return scCode;
    }

    public void setScCode(Long scCode) {
        this.scCode = scCode;
    }

    public String getScTitle() {
        return scTitle;
    }

    public void setScTitle(String scTitle) {
        this.scTitle = scTitle == null ? null : scTitle.trim();
    }

    public String getScContext() {
        return scContext;
    }

    public void setScContext(String scContext) {
        this.scContext = scContext == null ? null : scContext.trim();
    }

    public String getScImageCode() {
        return scImageCode;
    }

    public void setScImageCode(String scImageCode) {
        this.scImageCode = scImageCode == null ? null : scImageCode.trim();
    }

    public String getScApath() {
        return scApath;
    }

    public void setScApath(String scApath) {
        this.scApath = scApath == null ? null : scApath.trim();
    }

    public String getScSource() {
        return scSource;
    }

    public void setScSource(String scSource) {
        this.scSource = scSource == null ? null : scSource.trim();
    }

    public String getScStatus() {
        return scStatus;
    }

    public void setScStatus(String scStatus) {
        this.scStatus = scStatus == null ? null : scStatus.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getChange_time() {
        return change_time;
    }

    public void setChange_time(Date change_time) {
        this.change_time = change_time;
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
        Stationcontext other = (Stationcontext) that;
        return (this.getScCode() == null ? other.getScCode() == null : this.getScCode().equals(other.getScCode()))
            && (this.getScTitle() == null ? other.getScTitle() == null : this.getScTitle().equals(other.getScTitle()))
            && (this.getScContext() == null ? other.getScContext() == null : this.getScContext().equals(other.getScContext()))
            && (this.getScImageCode() == null ? other.getScImageCode() == null : this.getScImageCode().equals(other.getScImageCode()))
            && (this.getScApath() == null ? other.getScApath() == null : this.getScApath().equals(other.getScApath()))
            && (this.getScSource() == null ? other.getScSource() == null : this.getScSource().equals(other.getScSource()))
            && (this.getScStatus() == null ? other.getScStatus() == null : this.getScStatus().equals(other.getScStatus()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getChange_time() == null ? other.getChange_time() == null : this.getChange_time().equals(other.getChange_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScCode() == null) ? 0 : getScCode().hashCode());
        result = prime * result + ((getScTitle() == null) ? 0 : getScTitle().hashCode());
        result = prime * result + ((getScContext() == null) ? 0 : getScContext().hashCode());
        result = prime * result + ((getScImageCode() == null) ? 0 : getScImageCode().hashCode());
        result = prime * result + ((getScApath() == null) ? 0 : getScApath().hashCode());
        result = prime * result + ((getScSource() == null) ? 0 : getScSource().hashCode());
        result = prime * result + ((getScStatus() == null) ? 0 : getScStatus().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getChange_time() == null) ? 0 : getChange_time().hashCode());
        return result;
    }
}