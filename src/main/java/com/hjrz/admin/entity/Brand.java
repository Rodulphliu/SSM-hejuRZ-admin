package com.hjrz.admin.entity;

import java.util.Date;

import com.hjrz.admin.constants.BrandEnum;

public class Brand {
    private Long brandCode;

    private String brandName;

    private String brandImgPath;

    private String brandIntroduction;

    private BrandEnum brandstate;

    private Date create_time;

    public Long getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(Long brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandImgPath() {
        return brandImgPath;
    }

    public void setBrandImgPath(String brandImgPath) {
        this.brandImgPath = brandImgPath == null ? null : brandImgPath.trim();
    }

    public String getBrandIntroduction() {
        return brandIntroduction;
    }

    public void setBrandIntroduction(String brandIntroduction) {
        this.brandIntroduction = brandIntroduction == null ? null : brandIntroduction.trim();
    }

    public BrandEnum getBrandstate() {
		return brandstate;
	}

	public void setBrandstate(BrandEnum brandstate) {
		this.brandstate = brandstate;
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
        Brand other = (Brand) that;
        return (this.getBrandCode() == null ? other.getBrandCode() == null : this.getBrandCode().equals(other.getBrandCode()))
            && (this.getBrandName() == null ? other.getBrandName() == null : this.getBrandName().equals(other.getBrandName()))
            && (this.getBrandImgPath() == null ? other.getBrandImgPath() == null : this.getBrandImgPath().equals(other.getBrandImgPath()))
            && (this.getBrandIntroduction() == null ? other.getBrandIntroduction() == null : this.getBrandIntroduction().equals(other.getBrandIntroduction()))
            && (this.getBrandstate() == null ? other.getBrandstate() == null : this.getBrandstate().equals(other.getBrandstate()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBrandCode() == null) ? 0 : getBrandCode().hashCode());
        result = prime * result + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
        result = prime * result + ((getBrandImgPath() == null) ? 0 : getBrandImgPath().hashCode());
        result = prime * result + ((getBrandIntroduction() == null) ? 0 : getBrandIntroduction().hashCode());
        result = prime * result + ((getBrandstate() == null) ? 0 : getBrandstate().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}