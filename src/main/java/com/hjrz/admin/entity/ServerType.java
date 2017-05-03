package com.hjrz.admin.entity;

import java.util.Date;

public class ServerType {
    private Integer typeCode;

    private String typeName;

    private Date create_time;

    private String typeTitle;

    private String typeDetails;

    public Integer getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getTypeTitle() {
        return typeTitle;
    }

    public void setTypeTitle(String typeTitle) {
        this.typeTitle = typeTitle == null ? null : typeTitle.trim();
    }

    public String getTypeDetails() {
        return typeDetails;
    }

    public void setTypeDetails(String typeDetails) {
        this.typeDetails = typeDetails == null ? null : typeDetails.trim();
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
        ServerType other = (ServerType) that;
        return (this.getTypeCode() == null ? other.getTypeCode() == null : this.getTypeCode().equals(other.getTypeCode()))
            && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getTypeTitle() == null ? other.getTypeTitle() == null : this.getTypeTitle().equals(other.getTypeTitle()))
            && (this.getTypeDetails() == null ? other.getTypeDetails() == null : this.getTypeDetails().equals(other.getTypeDetails()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTypeCode() == null) ? 0 : getTypeCode().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getTypeTitle() == null) ? 0 : getTypeTitle().hashCode());
        result = prime * result + ((getTypeDetails() == null) ? 0 : getTypeDetails().hashCode());
        return result;
    }
}