package com.hjrz.admin.entity;

import java.util.Date;

public class Servicer {
    private Integer serverCode;

    private String serverName;

    private Integer serverType;

    private String serverState;

    private Date create_time;

    public Integer getServerCode() {
        return serverCode;
    }

    public void setServerCode(Integer serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Integer getServerType() {
        return serverType;
    }

    public void setServerType(Integer serverType) {
        this.serverType = serverType;
    }

    public String getServerState() {
        return serverState;
    }

    public void setServerState(String serverState) {
        this.serverState = serverState == null ? null : serverState.trim();
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
        Servicer other = (Servicer) that;
        return (this.getServerCode() == null ? other.getServerCode() == null : this.getServerCode().equals(other.getServerCode()))
            && (this.getServerName() == null ? other.getServerName() == null : this.getServerName().equals(other.getServerName()))
            && (this.getServerType() == null ? other.getServerType() == null : this.getServerType().equals(other.getServerType()))
            && (this.getServerState() == null ? other.getServerState() == null : this.getServerState().equals(other.getServerState()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServerCode() == null) ? 0 : getServerCode().hashCode());
        result = prime * result + ((getServerName() == null) ? 0 : getServerName().hashCode());
        result = prime * result + ((getServerType() == null) ? 0 : getServerType().hashCode());
        result = prime * result + ((getServerState() == null) ? 0 : getServerState().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}