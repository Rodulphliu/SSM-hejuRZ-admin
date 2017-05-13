package com.hjrz.admin.entity;

public class Wkstation_infoWithBLOBs extends Wkstation_info {
    private String sifeatures;

    private String description;

    public String getSifeatures() {
        return sifeatures;
    }

    public void setSifeatures(String sifeatures) {
        this.sifeatures = sifeatures == null ? null : sifeatures.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
        Wkstation_infoWithBLOBs other = (Wkstation_infoWithBLOBs) that;
        return (this.getWksinfoCode() == null ? other.getWksinfoCode() == null : this.getWksinfoCode().equals(other.getWksinfoCode()))
            && (this.getWksCode() == null ? other.getWksCode() == null : this.getWksCode().equals(other.getWksCode()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getCPUtype() == null ? other.getCPUtype() == null : this.getCPUtype().equals(other.getCPUtype()))
            && (this.getCPUnumber() == null ? other.getCPUnumber() == null : this.getCPUnumber().equals(other.getCPUnumber()))
            && (this.getMaxRAM() == null ? other.getMaxRAM() == null : this.getMaxRAM().equals(other.getMaxRAM()))
            && (this.getHDattr() == null ? other.getHDattr() == null : this.getHDattr().equals(other.getHDattr()))
            && (this.getSifeatures() == null ? other.getSifeatures() == null : this.getSifeatures().equals(other.getSifeatures()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
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
        result = prime * result + ((getSifeatures() == null) ? 0 : getSifeatures().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}