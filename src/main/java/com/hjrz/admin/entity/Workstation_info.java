package com.hjrz.admin.entity;

public class Workstation_info {
    private Long wsinfoCode;

    private Long worksCode;

    private String wsProcessor;

    private String cpuMixNumber;

    private String wsbrandName;

    private String wsSize;

    private String wshardamout;

    private String wsoperSystem;

    private String wsCPURAM;

    private String productdesc;

    private String wsDetails;

    public Long getWsinfoCode() {
        return wsinfoCode;
    }

    public void setWsinfoCode(Long wsinfoCode) {
        this.wsinfoCode = wsinfoCode;
    }

    public Long getWorksCode() {
        return worksCode;
    }

    public void setWorksCode(Long worksCode) {
        this.worksCode = worksCode;
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

    public String getWsbrandName() {
        return wsbrandName;
    }

    public void setWsbrandName(String wsbrandName) {
        this.wsbrandName = wsbrandName == null ? null : wsbrandName.trim();
    }

    public String getWsSize() {
        return wsSize;
    }

    public void setWsSize(String wsSize) {
        this.wsSize = wsSize == null ? null : wsSize.trim();
    }

    public String getWshardamout() {
        return wshardamout;
    }

    public void setWshardamout(String wshardamout) {
        this.wshardamout = wshardamout == null ? null : wshardamout.trim();
    }

    public String getWsoperSystem() {
        return wsoperSystem;
    }

    public void setWsoperSystem(String wsoperSystem) {
        this.wsoperSystem = wsoperSystem == null ? null : wsoperSystem.trim();
    }

    public String getWsCPURAM() {
        return wsCPURAM;
    }

    public void setWsCPURAM(String wsCPURAM) {
        this.wsCPURAM = wsCPURAM == null ? null : wsCPURAM.trim();
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc == null ? null : productdesc.trim();
    }

    public String getWsDetails() {
        return wsDetails;
    }

    public void setWsDetails(String wsDetails) {
        this.wsDetails = wsDetails == null ? null : wsDetails.trim();
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
        return (this.getWsinfoCode() == null ? other.getWsinfoCode() == null : this.getWsinfoCode().equals(other.getWsinfoCode()))
            && (this.getWorksCode() == null ? other.getWorksCode() == null : this.getWorksCode().equals(other.getWorksCode()))
            && (this.getWsProcessor() == null ? other.getWsProcessor() == null : this.getWsProcessor().equals(other.getWsProcessor()))
            && (this.getCpuMixNumber() == null ? other.getCpuMixNumber() == null : this.getCpuMixNumber().equals(other.getCpuMixNumber()))
            && (this.getWsbrandName() == null ? other.getWsbrandName() == null : this.getWsbrandName().equals(other.getWsbrandName()))
            && (this.getWsSize() == null ? other.getWsSize() == null : this.getWsSize().equals(other.getWsSize()))
            && (this.getWshardamout() == null ? other.getWshardamout() == null : this.getWshardamout().equals(other.getWshardamout()))
            && (this.getWsoperSystem() == null ? other.getWsoperSystem() == null : this.getWsoperSystem().equals(other.getWsoperSystem()))
            && (this.getWsCPURAM() == null ? other.getWsCPURAM() == null : this.getWsCPURAM().equals(other.getWsCPURAM()))
            && (this.getProductdesc() == null ? other.getProductdesc() == null : this.getProductdesc().equals(other.getProductdesc()))
            && (this.getWsDetails() == null ? other.getWsDetails() == null : this.getWsDetails().equals(other.getWsDetails()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWsinfoCode() == null) ? 0 : getWsinfoCode().hashCode());
        result = prime * result + ((getWorksCode() == null) ? 0 : getWorksCode().hashCode());
        result = prime * result + ((getWsProcessor() == null) ? 0 : getWsProcessor().hashCode());
        result = prime * result + ((getCpuMixNumber() == null) ? 0 : getCpuMixNumber().hashCode());
        result = prime * result + ((getWsbrandName() == null) ? 0 : getWsbrandName().hashCode());
        result = prime * result + ((getWsSize() == null) ? 0 : getWsSize().hashCode());
        result = prime * result + ((getWshardamout() == null) ? 0 : getWshardamout().hashCode());
        result = prime * result + ((getWsoperSystem() == null) ? 0 : getWsoperSystem().hashCode());
        result = prime * result + ((getWsCPURAM() == null) ? 0 : getWsCPURAM().hashCode());
        result = prime * result + ((getProductdesc() == null) ? 0 : getProductdesc().hashCode());
        result = prime * result + ((getWsDetails() == null) ? 0 : getWsDetails().hashCode());
        return result;
    }
}