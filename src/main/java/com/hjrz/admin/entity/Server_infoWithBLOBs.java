package com.hjrz.admin.entity;

public class Server_infoWithBLOBs extends Server_info {
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
        Server_infoWithBLOBs other = (Server_infoWithBLOBs) that;
        return (this.getSiCode() == null ? other.getSiCode() == null : this.getSiCode().equals(other.getSiCode()))
            && (this.getServercode() == null ? other.getServercode() == null : this.getServercode().equals(other.getServercode()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getCPUnumber() == null ? other.getCPUnumber() == null : this.getCPUnumber().equals(other.getCPUnumber()))
            && (this.getMaxRAM() == null ? other.getMaxRAM() == null : this.getMaxRAM().equals(other.getMaxRAM()))
            && (this.getHDattr() == null ? other.getHDattr() == null : this.getHDattr().equals(other.getHDattr()))
            && (this.getHDplace() == null ? other.getHDplace() == null : this.getHDplace().equals(other.getHDplace()))
            && (this.getSifeatures() == null ? other.getSifeatures() == null : this.getSifeatures().equals(other.getSifeatures()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
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
        result = prime * result + ((getSifeatures() == null) ? 0 : getSifeatures().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}