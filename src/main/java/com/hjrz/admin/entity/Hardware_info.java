package com.hjrz.admin.entity;

public class Hardware_info {
    private Long hardwareinfoCode;

    private Long hardwareCode;

    private String hardwareImgpath;

    private String hardwareinfoDetail;

    public Long getHardwareinfoCode() {
        return hardwareinfoCode;
    }

    public void setHardwareinfoCode(Long hardwareinfoCode) {
        this.hardwareinfoCode = hardwareinfoCode;
    }

    public Long getHardwareCode() {
        return hardwareCode;
    }

    public void setHardwareCode(Long hardwareCode) {
        this.hardwareCode = hardwareCode;
    }

    public String getHardwareImgpath() {
        return hardwareImgpath;
    }

    public void setHardwareImgpath(String hardwareImgpath) {
        this.hardwareImgpath = hardwareImgpath == null ? null : hardwareImgpath.trim();
    }

    public String getHardwareinfoDetail() {
        return hardwareinfoDetail;
    }

    public void setHardwareinfoDetail(String hardwareinfoDetail) {
        this.hardwareinfoDetail = hardwareinfoDetail == null ? null : hardwareinfoDetail.trim();
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
        Hardware_info other = (Hardware_info) that;
        return (this.getHardwareinfoCode() == null ? other.getHardwareinfoCode() == null : this.getHardwareinfoCode().equals(other.getHardwareinfoCode()))
            && (this.getHardwareCode() == null ? other.getHardwareCode() == null : this.getHardwareCode().equals(other.getHardwareCode()))
            && (this.getHardwareImgpath() == null ? other.getHardwareImgpath() == null : this.getHardwareImgpath().equals(other.getHardwareImgpath()))
            && (this.getHardwareinfoDetail() == null ? other.getHardwareinfoDetail() == null : this.getHardwareinfoDetail().equals(other.getHardwareinfoDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHardwareinfoCode() == null) ? 0 : getHardwareinfoCode().hashCode());
        result = prime * result + ((getHardwareCode() == null) ? 0 : getHardwareCode().hashCode());
        result = prime * result + ((getHardwareImgpath() == null) ? 0 : getHardwareImgpath().hashCode());
        result = prime * result + ((getHardwareinfoDetail() == null) ? 0 : getHardwareinfoDetail().hashCode());
        return result;
    }
}