package com.hjrz.admin.entity;

import java.util.Date;

import com.hjrz.admin.constants.DynamicStatusEnum;

public class Dynamic {
    private Integer dyCode;

    private String dyTitle;

    private String dyimageCover;

    private Date create_time;

    private String create_admin;

    private DynamicStatusEnum dyAliveState;

    private String dycontent;

    public Integer getDyCode() {
        return dyCode;
    }

    public void setDyCode(Integer dyCode) {
        this.dyCode = dyCode;
    }

    public String getDyTitle() {
        return dyTitle;
    }

    public void setDyTitle(String dyTitle) {
        this.dyTitle = dyTitle == null ? null : dyTitle.trim();
    }

    public String getDyimageCover() {
        return dyimageCover;
    }

    public void setDyimageCover(String dyimageCover) {
        this.dyimageCover = dyimageCover == null ? null : dyimageCover.trim();
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
    
    public DynamicStatusEnum getDyAliveState() {
      return dyAliveState;
    }

    public void setDyAliveState(DynamicStatusEnum dyAliveState) {
      this.dyAliveState = dyAliveState;
    }

    public String getDycontent() {
        return dycontent;
    }

    public void setDycontent(String dycontent) {
        this.dycontent = dycontent == null ? null : dycontent.trim();
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
        Dynamic other = (Dynamic) that;
        return (this.getDyCode() == null ? other.getDyCode() == null : this.getDyCode().equals(other.getDyCode()))
            && (this.getDyTitle() == null ? other.getDyTitle() == null : this.getDyTitle().equals(other.getDyTitle()))
            && (this.getDyimageCover() == null ? other.getDyimageCover() == null : this.getDyimageCover().equals(other.getDyimageCover()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_admin() == null ? other.getCreate_admin() == null : this.getCreate_admin().equals(other.getCreate_admin()))
            && (this.getDyAliveState() == null ? other.getDyAliveState() == null : this.getDyAliveState().equals(other.getDyAliveState()))
            && (this.getDycontent() == null ? other.getDycontent() == null : this.getDycontent().equals(other.getDycontent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDyCode() == null) ? 0 : getDyCode().hashCode());
        result = prime * result + ((getDyTitle() == null) ? 0 : getDyTitle().hashCode());
        result = prime * result + ((getDyimageCover() == null) ? 0 : getDyimageCover().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_admin() == null) ? 0 : getCreate_admin().hashCode());
        result = prime * result + ((getDyAliveState() == null) ? 0 : getDyAliveState().hashCode());
        result = prime * result + ((getDycontent() == null) ? 0 : getDycontent().hashCode());
        return result;
    }
}