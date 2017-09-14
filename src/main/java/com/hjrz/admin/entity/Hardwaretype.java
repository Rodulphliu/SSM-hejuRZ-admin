package com.hjrz.admin.entity;

import com.hjrz.admin.constants.HardWareTypeEnum;

public class Hardwaretype {
    private Long hardtypeCode;

    private String hardtypeName;

    private String hardtypeImgPath;

    private String hardtypeIntroduction;

    private HardWareTypeEnum hardtypestate;

    public Long getHardtypeCode() {
        return hardtypeCode;
    }

    public void setHardtypeCode(Long hardtypeCode) {
        this.hardtypeCode = hardtypeCode;
    }

    public String getHardtypeName() {
        return hardtypeName;
    }

    public void setHardtypeName(String hardtypeName) {
        this.hardtypeName = hardtypeName == null ? null : hardtypeName.trim();
    }

    public String getHardtypeImgPath() {
        return hardtypeImgPath;
    }

    public void setHardtypeImgPath(String hardtypeImgPath) {
        this.hardtypeImgPath = hardtypeImgPath == null ? null : hardtypeImgPath.trim();
    }

    public String getHardtypeIntroduction() {
        return hardtypeIntroduction;
    }

    public void setHardtypeIntroduction(String hardtypeIntroduction) {
        this.hardtypeIntroduction = hardtypeIntroduction == null ? null : hardtypeIntroduction.trim();
    }
   
    public HardWareTypeEnum getHardtypestate() {
		return hardtypestate;
	}

	public void setHardtypestate(HardWareTypeEnum hardtypestate) {
		this.hardtypestate = hardtypestate;
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
        Hardwaretype other = (Hardwaretype) that;
        return (this.getHardtypeCode() == null ? other.getHardtypeCode() == null : this.getHardtypeCode().equals(other.getHardtypeCode()))
            && (this.getHardtypeName() == null ? other.getHardtypeName() == null : this.getHardtypeName().equals(other.getHardtypeName()))
            && (this.getHardtypeImgPath() == null ? other.getHardtypeImgPath() == null : this.getHardtypeImgPath().equals(other.getHardtypeImgPath()))
            && (this.getHardtypeIntroduction() == null ? other.getHardtypeIntroduction() == null : this.getHardtypeIntroduction().equals(other.getHardtypeIntroduction()))
            && (this.getHardtypestate() == null ? other.getHardtypestate() == null : this.getHardtypestate().equals(other.getHardtypestate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHardtypeCode() == null) ? 0 : getHardtypeCode().hashCode());
        result = prime * result + ((getHardtypeName() == null) ? 0 : getHardtypeName().hashCode());
        result = prime * result + ((getHardtypeImgPath() == null) ? 0 : getHardtypeImgPath().hashCode());
        result = prime * result + ((getHardtypeIntroduction() == null) ? 0 : getHardtypeIntroduction().hashCode());
        result = prime * result + ((getHardtypestate() == null) ? 0 : getHardtypestate().hashCode());
        return result;
    }
}