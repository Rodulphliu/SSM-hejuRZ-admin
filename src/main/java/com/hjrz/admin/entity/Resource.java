package com.hjrz.admin.entity;

import java.util.Date;

public class Resource {
    private Integer resourceCode;

    private String resourceName;

    private String resourceURL;

    private Integer parentID;

    private String resourceDES;

    private String resourceLV;

    private String englishName;

    private Date create_time;

    private Integer create_admin_id;

    private String resource_status;

    public Integer getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(Integer resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getResourceURL() {
        return resourceURL;
    }

    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL == null ? null : resourceURL.trim();
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public String getResourceDES() {
        return resourceDES;
    }

    public void setResourceDES(String resourceDES) {
        this.resourceDES = resourceDES == null ? null : resourceDES.trim();
    }

    public String getResourceLV() {
        return resourceLV;
    }

    public void setResourceLV(String resourceLV) {
        this.resourceLV = resourceLV == null ? null : resourceLV.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getCreate_admin_id() {
        return create_admin_id;
    }

    public void setCreate_admin_id(Integer create_admin_id) {
        this.create_admin_id = create_admin_id;
    }

    public String getResource_status() {
        return resource_status;
    }

    public void setResource_status(String resource_status) {
        this.resource_status = resource_status == null ? null : resource_status.trim();
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
        Resource other = (Resource) that;
        return (this.getResourceCode() == null ? other.getResourceCode() == null : this.getResourceCode().equals(other.getResourceCode()))
            && (this.getResourceName() == null ? other.getResourceName() == null : this.getResourceName().equals(other.getResourceName()))
            && (this.getResourceURL() == null ? other.getResourceURL() == null : this.getResourceURL().equals(other.getResourceURL()))
            && (this.getParentID() == null ? other.getParentID() == null : this.getParentID().equals(other.getParentID()))
            && (this.getResourceDES() == null ? other.getResourceDES() == null : this.getResourceDES().equals(other.getResourceDES()))
            && (this.getResourceLV() == null ? other.getResourceLV() == null : this.getResourceLV().equals(other.getResourceLV()))
            && (this.getEnglishName() == null ? other.getEnglishName() == null : this.getEnglishName().equals(other.getEnglishName()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_admin_id() == null ? other.getCreate_admin_id() == null : this.getCreate_admin_id().equals(other.getCreate_admin_id()))
            && (this.getResource_status() == null ? other.getResource_status() == null : this.getResource_status().equals(other.getResource_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResourceCode() == null) ? 0 : getResourceCode().hashCode());
        result = prime * result + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        result = prime * result + ((getResourceURL() == null) ? 0 : getResourceURL().hashCode());
        result = prime * result + ((getParentID() == null) ? 0 : getParentID().hashCode());
        result = prime * result + ((getResourceDES() == null) ? 0 : getResourceDES().hashCode());
        result = prime * result + ((getResourceLV() == null) ? 0 : getResourceLV().hashCode());
        result = prime * result + ((getEnglishName() == null) ? 0 : getEnglishName().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_admin_id() == null) ? 0 : getCreate_admin_id().hashCode());
        result = prime * result + ((getResource_status() == null) ? 0 : getResource_status().hashCode());
        return result;
    }
}