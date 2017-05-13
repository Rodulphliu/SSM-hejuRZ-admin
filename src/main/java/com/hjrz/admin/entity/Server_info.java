package com.hjrz.admin.entity;

public class Server_info {
    private Integer siCode;

    private Integer servercode;

    private String platform;

    private String CPUnumber;

    private String maxRAM;

    private String HDattr;

    private String HDplace;

    public Integer getSiCode() {
        return siCode;
    }

    public void setSiCode(Integer siCode) {
        this.siCode = siCode;
    }

    public Integer getServercode() {
        return servercode;
    }

    public void setServercode(Integer servercode) {
        this.servercode = servercode;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getCPUnumber() {
        return CPUnumber;
    }

    public void setCPUnumber(String CPUnumber) {
        this.CPUnumber = CPUnumber == null ? null : CPUnumber.trim();
    }

    public String getMaxRAM() {
        return maxRAM;
    }

    public void setMaxRAM(String maxRAM) {
        this.maxRAM = maxRAM == null ? null : maxRAM.trim();
    }

    public String getHDattr() {
        return HDattr;
    }

    public void setHDattr(String HDattr) {
        this.HDattr = HDattr == null ? null : HDattr.trim();
    }

    public String getHDplace() {
        return HDplace;
    }

    public void setHDplace(String HDplace) {
        this.HDplace = HDplace == null ? null : HDplace.trim();
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
        Server_info other = (Server_info) that;
        return (this.getSiCode() == null ? other.getSiCode() == null : this.getSiCode().equals(other.getSiCode()))
            && (this.getServercode() == null ? other.getServercode() == null : this.getServercode().equals(other.getServercode()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getCPUnumber() == null ? other.getCPUnumber() == null : this.getCPUnumber().equals(other.getCPUnumber()))
            && (this.getMaxRAM() == null ? other.getMaxRAM() == null : this.getMaxRAM().equals(other.getMaxRAM()))
            && (this.getHDattr() == null ? other.getHDattr() == null : this.getHDattr().equals(other.getHDattr()))
            && (this.getHDplace() == null ? other.getHDplace() == null : this.getHDplace().equals(other.getHDplace()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSiCode() == null) ? 0 : getSiCode().hashCode());
        result = prime * result + ((getServercode() == null) ? 0 : getServercode().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getCPUnumber() == null) ? 0 : getCPUnumber().hashCode());
        result = prime * result + ((getMaxRAM() == null) ? 0 : getMaxRAM().hashCode());
        result = prime * result + ((getHDattr() == null) ? 0 : getHDattr().hashCode());
        result = prime * result + ((getHDplace() == null) ? 0 : getHDplace().hashCode());
        return result;
    }
}