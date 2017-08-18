package com.hjrz.admin.entity;

import java.util.Date;

public class WorkstaType {
    private Integer wks_typeCode;

    private String wks_typeName;

    private Date create_time;

    private String wks_typeTitle;

    private String wks_typeDetails;

    public Integer getWks_typeCode() {
        return wks_typeCode;
    }

    public void setWks_typeCode(Integer wks_typeCode) {
        this.wks_typeCode = wks_typeCode;
    }

    public String getWks_typeName() {
        return wks_typeName;
    }

    public void setWks_typeName(String wks_typeName) {
        this.wks_typeName = wks_typeName == null ? null : wks_typeName.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getWks_typeTitle() {
        return wks_typeTitle;
    }

    public void setWks_typeTitle(String wks_typeTitle) {
        this.wks_typeTitle = wks_typeTitle == null ? null : wks_typeTitle.trim();
    }

    public String getWks_typeDetails() {
        return wks_typeDetails;
    }

    public void setWks_typeDetails(String wks_typeDetails) {
        this.wks_typeDetails = wks_typeDetails == null ? null : wks_typeDetails.trim();
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
        WorkstaType other = (WorkstaType) that;
        return (this.getWks_typeCode() == null ? other.getWks_typeCode() == null : this.getWks_typeCode().equals(other.getWks_typeCode()))
            && (this.getWks_typeName() == null ? other.getWks_typeName() == null : this.getWks_typeName().equals(other.getWks_typeName()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getWks_typeTitle() == null ? other.getWks_typeTitle() == null : this.getWks_typeTitle().equals(other.getWks_typeTitle()))
            && (this.getWks_typeDetails() == null ? other.getWks_typeDetails() == null : this.getWks_typeDetails().equals(other.getWks_typeDetails()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWks_typeCode() == null) ? 0 : getWks_typeCode().hashCode());
        result = prime * result + ((getWks_typeName() == null) ? 0 : getWks_typeName().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getWks_typeTitle() == null) ? 0 : getWks_typeTitle().hashCode());
        result = prime * result + ((getWks_typeDetails() == null) ? 0 : getWks_typeDetails().hashCode());
        return result;
    }
}