package com.hjrz.admin.entity;

public class Wkstation_info {
    private Integer wksinfoCode;

    private Integer wksCode;

    private String platform;

    private String CPUtype;

    private String CPUnumber;

    private String maxRAM;

    private String HDattr;

    public Integer getWksinfoCode() {
        return wksinfoCode;
    }

    public void setWksinfoCode(Integer wksinfoCode) {
        this.wksinfoCode = wksinfoCode;
    }

    public Integer getWksCode() {
        return wksCode;
    }

    public void setWksCode(Integer wksCode) {
        this.wksCode = wksCode;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getCPUtype() {
        return CPUtype;
    }

    public void setCPUtype(String CPUtype) {
        this.CPUtype = CPUtype == null ? null : CPUtype.trim();
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
        Wkstation_info other = (Wkstation_info) that;
        return (this.getWksinfoCode() == null ? other.getWksinfoCode() == null : this.getWksinfoCode().equals(other.getWksinfoCode()))
            && (this.getWksCode() == null ? other.getWksCode() == null : this.getWksCode().equals(other.getWksCode()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getCPUtype() == null ? other.getCPUtype() == null : this.getCPUtype().equals(other.getCPUtype()))
            && (this.getCPUnumber() == null ? other.getCPUnumber() == null : this.getCPUnumber().equals(other.getCPUnumber()))
            && (this.getMaxRAM() == null ? other.getMaxRAM() == null : this.getMaxRAM().equals(other.getMaxRAM()))
            && (this.getHDattr() == null ? other.getHDattr() == null : this.getHDattr().equals(other.getHDattr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWksinfoCode() == null) ? 0 : getWksinfoCode().hashCode());
        result = prime * result + ((getWksCode() == null) ? 0 : getWksCode().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getCPUtype() == null) ? 0 : getCPUtype().hashCode());
        result = prime * result + ((getCPUnumber() == null) ? 0 : getCPUnumber().hashCode());
        result = prime * result + ((getMaxRAM() == null) ? 0 : getMaxRAM().hashCode());
        result = prime * result + ((getHDattr() == null) ? 0 : getHDattr().hashCode());
        return result;
    }
}