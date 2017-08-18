package com.hjrz.admin.entity;

public class Workstation_info {
    private Long wsCode;

    private Long workCode;

    private String wsProcessor;

    private String cpuMixNumber;

    private String sibrandName;

    private String siSize;

    private String sihardamout;

    private String sioperSystem;

    private String siCPURAM;

    private String productdesc;

    private String siDetails;

    public Long getWsCode() {
        return wsCode;
    }

    public void setWsCode(Long wsCode) {
        this.wsCode = wsCode;
    }

    public Long getWorkCode() {
        return workCode;
    }

    public void setWorkCode(Long workCode) {
        this.workCode = workCode;
    }

    public String getWsProcessor() {
        return wsProcessor;
    }

    public void setWsProcessor(String wsProcessor) {
        this.wsProcessor = wsProcessor == null ? null : wsProcessor.trim();
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

    public String getSihardamout() {
        return sihardamout;
    }

    public void setSihardamout(String sihardamout) {
        this.sihardamout = sihardamout == null ? null : sihardamout.trim();
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
        Workstation_info other = (Workstation_info) that;
        return (this.getWsCode() == null ? other.getWsCode() == null : this.getWsCode().equals(other.getWsCode()))
            && (this.getWorkCode() == null ? other.getWorkCode() == null : this.getWorkCode().equals(other.getWorkCode()))
            && (this.getWsProcessor() == null ? other.getWsProcessor() == null : this.getWsProcessor().equals(other.getWsProcessor()))
            && (this.getCpuMixNumber() == null ? other.getCpuMixNumber() == null : this.getCpuMixNumber().equals(other.getCpuMixNumber()))
            && (this.getSibrandName() == null ? other.getSibrandName() == null : this.getSibrandName().equals(other.getSibrandName()))
            && (this.getSiSize() == null ? other.getSiSize() == null : this.getSiSize().equals(other.getSiSize()))
            && (this.getSihardamout() == null ? other.getSihardamout() == null : this.getSihardamout().equals(other.getSihardamout()))
            && (this.getSioperSystem() == null ? other.getSioperSystem() == null : this.getSioperSystem().equals(other.getSioperSystem()))
            && (this.getSiCPURAM() == null ? other.getSiCPURAM() == null : this.getSiCPURAM().equals(other.getSiCPURAM()))
            && (this.getProductdesc() == null ? other.getProductdesc() == null : this.getProductdesc().equals(other.getProductdesc()))
            && (this.getSiDetails() == null ? other.getSiDetails() == null : this.getSiDetails().equals(other.getSiDetails()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWsCode() == null) ? 0 : getWsCode().hashCode());
        result = prime * result + ((getWorkCode() == null) ? 0 : getWorkCode().hashCode());
        result = prime * result + ((getWsProcessor() == null) ? 0 : getWsProcessor().hashCode());
        result = prime * result + ((getCpuMixNumber() == null) ? 0 : getCpuMixNumber().hashCode());
        result = prime * result + ((getSibrandName() == null) ? 0 : getSibrandName().hashCode());
        result = prime * result + ((getSiSize() == null) ? 0 : getSiSize().hashCode());
        result = prime * result + ((getSihardamout() == null) ? 0 : getSihardamout().hashCode());
        result = prime * result + ((getSioperSystem() == null) ? 0 : getSioperSystem().hashCode());
        result = prime * result + ((getSiCPURAM() == null) ? 0 : getSiCPURAM().hashCode());
        result = prime * result + ((getProductdesc() == null) ? 0 : getProductdesc().hashCode());
        result = prime * result + ((getSiDetails() == null) ? 0 : getSiDetails().hashCode());
        return result;
    }
}