package com.hjrz.admin.entity;

import java.util.Date;

import com.hjrz.admin.constants.HardWareStateEnum;

public class Hardware {
    private Long hardwareCode;

    private String hardwareName;

    private Long brandCode;

    private Long hardwareType;

    private HardWareStateEnum hardwareState;

    private Date create_time;

    public Long getHardwareCode() {
        return hardwareCode;
    }

    public void setHardwareCode(Long hardwareCode) {
        this.hardwareCode = hardwareCode;
    }

    public String getHardwareName() {
        return hardwareName;
    }

    public void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName == null ? null : hardwareName.trim();
    }

    public Long getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(Long brandCode) {
        this.brandCode = brandCode;
    }

    public Long getHardwareType() {
        return hardwareType;
    }

    public void setHardwareType(Long hardwareType) {
        this.hardwareType = hardwareType;
    }

    public HardWareStateEnum getHardwareState() {
		return hardwareState;
	}

	public void setHardwareState(HardWareStateEnum hardwareState) {
		this.hardwareState = hardwareState;
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
        Hardware other = (Hardware) that;
        return (this.getHardwareCode() == null ? other.getHardwareCode() == null : this.getHardwareCode().equals(other.getHardwareCode()))
            && (this.getHardwareName() == null ? other.getHardwareName() == null : this.getHardwareName().equals(other.getHardwareName()))
            && (this.getBrandCode() == null ? other.getBrandCode() == null : this.getBrandCode().equals(other.getBrandCode()))
            && (this.getHardwareType() == null ? other.getHardwareType() == null : this.getHardwareType().equals(other.getHardwareType()))
            && (this.getHardwareState() == null ? other.getHardwareState() == null : this.getHardwareState().equals(other.getHardwareState()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHardwareCode() == null) ? 0 : getHardwareCode().hashCode());
        result = prime * result + ((getHardwareName() == null) ? 0 : getHardwareName().hashCode());
        result = prime * result + ((getBrandCode() == null) ? 0 : getBrandCode().hashCode());
        result = prime * result + ((getHardwareType() == null) ? 0 : getHardwareType().hashCode());
        result = prime * result + ((getHardwareState() == null) ? 0 : getHardwareState().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}