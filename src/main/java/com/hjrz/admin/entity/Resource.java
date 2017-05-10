package com.hjrz.admin.entity;

public class Resource {
    private Integer resourceCode;

    private String resourceName;

    private String resourceURL;

    private Integer parentID;

    private String englishName;

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

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
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
            && (this.getEnglishName() == null ? other.getEnglishName() == null : this.getEnglishName().equals(other.getEnglishName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResourceCode() == null) ? 0 : getResourceCode().hashCode());
        result = prime * result + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        result = prime * result + ((getResourceURL() == null) ? 0 : getResourceURL().hashCode());
        result = prime * result + ((getParentID() == null) ? 0 : getParentID().hashCode());
        result = prime * result + ((getEnglishName() == null) ? 0 : getEnglishName().hashCode());
        return result;
    }
}