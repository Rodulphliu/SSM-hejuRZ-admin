package com.hjrz.admin.entity;

public class Server_info {
    private Long siCode;

    private Integer serverCode;

    private String siProcessor;

    private String cpuMixNumber;

    private String sibrandName;

    private String siSize;

    private String sihardamount;

    private String sioperSystem;

    private String siCPURAM;

    private String productdesc;

    private String siDetails;

    public Long getSiCode() {
        return siCode;
    }

    public void setSiCode(Long siCode) {
        this.siCode = siCode;
    }

    public Integer getServerCode() {
        return serverCode;
    }

    public void setServerCode(Integer serverCode) {
        this.serverCode = serverCode;
    }

    public String getSiProcessor() {
        return siProcessor;
    }

    public void setSiProcessor(String siProcessor) {
        this.siProcessor = siProcessor == null ? null : siProcessor.trim();
    }

    public String getCpuMixNumber() {
        return cpuMixNumber;
    }

    public void setCpuMixNumber(String cpuMixNumber) {
        this.cpuMixNumber = cpuMixNumber == null ? null : cpuMixNumber.trim();
    }

    public String getSibrandName() {
        return sibrandName;
    }

    public void setSibrandName(String sibrandName) {
        this.sibrandName = sibrandName == null ? null : sibrandName.trim();
    }

    public String getSiSize() {
        return siSize;
    }

    public void setSiSize(String siSize) {
        this.siSize = siSize == null ? null : siSize.trim();
    }

    public String getSihardamount() {
        return sihardamount;
    }

    public void setSihardamount(String sihardamount) {
        this.sihardamount = sihardamount == null ? null : sihardamount.trim();
    }

    public String getSioperSystem() {
        return sioperSystem;
    }

    public void setSioperSystem(String sioperSystem) {
        this.sioperSystem = sioperSystem == null ? null : sioperSystem.trim();
    }

    public String getSiCPURAM() {
        return siCPURAM;
    }

    public void setSiCPURAM(String siCPURAM) {
        this.siCPURAM = siCPURAM == null ? null : siCPURAM.trim();
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc == null ? null : productdesc.trim();
    }

    public String getSiDetails() {
        return siDetails;
    }

    public void setSiDetails(String siDetails) {
        this.siDetails = siDetails == null ? null : siDetails.trim();
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
            && (this.getServerCode() == null ? other.getServerCode() == null : this.getServerCode().equals(other.getServerCode()))
            && (this.getSiProcessor() == null ? other.getSiProcessor() == null : this.getSiProcessor().equals(other.getSiProcessor()))
            && (this.getCpuMixNumber() == null ? other.getCpuMixNumber() == null : this.getCpuMixNumber().equals(other.getCpuMixNumber()))
            && (this.getSibrandName() == null ? other.getSibrandName() == null : this.getSibrandName().equals(other.getSibrandName()))
            && (this.getSiSize() == null ? other.getSiSize() == null : this.getSiSize().equals(other.getSiSize()))
            && (this.getSihardamount() == null ? other.getSihardamount() == null : this.getSihardamount().equals(other.getSihardamount()))
            && (this.getSioperSystem() == null ? other.getSioperSystem() == null : this.getSioperSystem().equals(other.getSioperSystem()))
            && (this.getSiCPURAM() == null ? other.getSiCPURAM() == null : this.getSiCPURAM().equals(other.getSiCPURAM()))
            && (this.getProductdesc() == null ? other.getProductdesc() == null : this.getProductdesc().equals(other.getProductdesc()))
            && (this.getSiDetails() == null ? other.getSiDetails() == null : this.getSiDetails().equals(other.getSiDetails()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSiCode() == null) ? 0 : getSiCode().hashCode());
        result = prime * result + ((getServerCode() == null) ? 0 : getServerCode().hashCode());
        result = prime * result + ((getSiProcessor() == null) ? 0 : getSiProcessor().hashCode());
        result = prime * result + ((getCpuMixNumber() == null) ? 0 : getCpuMixNumber().hashCode());
        result = prime * result + ((getSibrandName() == null) ? 0 : getSibrandName().hashCode());
        result = prime * result + ((getSiSize() == null) ? 0 : getSiSize().hashCode());
        result = prime * result + ((getSihardamount() == null) ? 0 : getSihardamount().hashCode());
        result = prime * result + ((getSioperSystem() == null) ? 0 : getSioperSystem().hashCode());
        result = prime * result + ((getSiCPURAM() == null) ? 0 : getSiCPURAM().hashCode());
        result = prime * result + ((getProductdesc() == null) ? 0 : getProductdesc().hashCode());
        result = prime * result + ((getSiDetails() == null) ? 0 : getSiDetails().hashCode());
        return result;
    }
}