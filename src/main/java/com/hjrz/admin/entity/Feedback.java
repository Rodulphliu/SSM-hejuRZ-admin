package com.hjrz.admin.entity;

import java.util.Date;

public class Feedback {
    private Long fbCode;

    private String fb_user_name;

    private String fbuseremail;

    private Date create_time;

    private String link_handle_state;

    private String link_message;

    public Long getFbCode() {
        return fbCode;
    }

    public void setFbCode(Long fbCode) {
        this.fbCode = fbCode;
    }

    public String getFb_user_name() {
        return fb_user_name;
    }

    public void setFb_user_name(String fb_user_name) {
        this.fb_user_name = fb_user_name == null ? null : fb_user_name.trim();
    }

    public String getFbuseremail() {
        return fbuseremail;
    }

    public void setFbuseremail(String fbuseremail) {
        this.fbuseremail = fbuseremail == null ? null : fbuseremail.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getLink_handle_state() {
        return link_handle_state;
    }

    public void setLink_handle_state(String link_handle_state) {
        this.link_handle_state = link_handle_state == null ? null : link_handle_state.trim();
    }

    public String getLink_message() {
        return link_message;
    }

    public void setLink_message(String link_message) {
        this.link_message = link_message == null ? null : link_message.trim();
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
        Feedback other = (Feedback) that;
        return (this.getFbCode() == null ? other.getFbCode() == null : this.getFbCode().equals(other.getFbCode()))
            && (this.getFb_user_name() == null ? other.getFb_user_name() == null : this.getFb_user_name().equals(other.getFb_user_name()))
            && (this.getFbuseremail() == null ? other.getFbuseremail() == null : this.getFbuseremail().equals(other.getFbuseremail()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getLink_handle_state() == null ? other.getLink_handle_state() == null : this.getLink_handle_state().equals(other.getLink_handle_state()))
            && (this.getLink_message() == null ? other.getLink_message() == null : this.getLink_message().equals(other.getLink_message()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFbCode() == null) ? 0 : getFbCode().hashCode());
        result = prime * result + ((getFb_user_name() == null) ? 0 : getFb_user_name().hashCode());
        result = prime * result + ((getFbuseremail() == null) ? 0 : getFbuseremail().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getLink_handle_state() == null) ? 0 : getLink_handle_state().hashCode());
        result = prime * result + ((getLink_message() == null) ? 0 : getLink_message().hashCode());
        return result;
    }
}