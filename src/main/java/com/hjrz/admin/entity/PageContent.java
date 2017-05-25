package com.hjrz.admin.entity;

import java.util.Date;

public class PageContent {
    private Integer contentCode;

    private String contentName;

    private Integer contentBelongCode;

    private String contentImage;

    private Date create_time;

    private String create_admin;

    private String contentAliveState;

    private String contentURL;

    private String textintroduce;

    public Integer getContentCode() {
        return contentCode;
    }

    public void setContentCode(Integer contentCode) {
        this.contentCode = contentCode;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName == null ? null : contentName.trim();
    }

    public Integer getContentBelongCode() {
        return contentBelongCode;
    }

    public void setContentBelongCode(Integer contentBelongCode) {
        this.contentBelongCode = contentBelongCode;
    }

    public String getContentImage() {
        return contentImage;
    }

    public void setContentImage(String contentImage) {
        this.contentImage = contentImage == null ? null : contentImage.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCreate_admin() {
        return create_admin;
    }

    public void setCreate_admin(String create_admin) {
        this.create_admin = create_admin == null ? null : create_admin.trim();
    }

    public String getContentAliveState() {
        return contentAliveState;
    }

    public void setContentAliveState(String contentAliveState) {
        this.contentAliveState = contentAliveState == null ? null : contentAliveState.trim();
    }

    public String getContentURL() {
        return contentURL;
    }

    public void setContentURL(String contentURL) {
        this.contentURL = contentURL == null ? null : contentURL.trim();
    }

    public String getTextintroduce() {
        return textintroduce;
    }

    public void setTextintroduce(String textintroduce) {
        this.textintroduce = textintroduce == null ? null : textintroduce.trim();
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
        PageContent other = (PageContent) that;
        return (this.getContentCode() == null ? other.getContentCode() == null : this.getContentCode().equals(other.getContentCode()))
            && (this.getContentName() == null ? other.getContentName() == null : this.getContentName().equals(other.getContentName()))
            && (this.getContentBelongCode() == null ? other.getContentBelongCode() == null : this.getContentBelongCode().equals(other.getContentBelongCode()))
            && (this.getContentImage() == null ? other.getContentImage() == null : this.getContentImage().equals(other.getContentImage()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_admin() == null ? other.getCreate_admin() == null : this.getCreate_admin().equals(other.getCreate_admin()))
            && (this.getContentAliveState() == null ? other.getContentAliveState() == null : this.getContentAliveState().equals(other.getContentAliveState()))
            && (this.getContentURL() == null ? other.getContentURL() == null : this.getContentURL().equals(other.getContentURL()))
            && (this.getTextintroduce() == null ? other.getTextintroduce() == null : this.getTextintroduce().equals(other.getTextintroduce()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContentCode() == null) ? 0 : getContentCode().hashCode());
        result = prime * result + ((getContentName() == null) ? 0 : getContentName().hashCode());
        result = prime * result + ((getContentBelongCode() == null) ? 0 : getContentBelongCode().hashCode());
        result = prime * result + ((getContentImage() == null) ? 0 : getContentImage().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_admin() == null) ? 0 : getCreate_admin().hashCode());
        result = prime * result + ((getContentAliveState() == null) ? 0 : getContentAliveState().hashCode());
        result = prime * result + ((getContentURL() == null) ? 0 : getContentURL().hashCode());
        result = prime * result + ((getTextintroduce() == null) ? 0 : getTextintroduce().hashCode());
        return result;
    }
}