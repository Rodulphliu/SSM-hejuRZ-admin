package com.hjrz.admin.entity;

public class WorkstationInfo {
    private Long wscode;

    private Long workcode;

    private String wsprocessor;

    private String cpumixnumber;

    private String sibrandname;

    private String sisize;

    private String sihardamout;

    private String siopersystem;

    private String sicpuram;

    private String productdesc;

    private String sidetails;

    public Long getWscode() {
        return wscode;
    }

    public void setWscode(Long wscode) {
        this.wscode = wscode;
    }

    public Long getWorkcode() {
        return workcode;
    }

    public void setWorkcode(Long workcode) {
        this.workcode = workcode;
    }

    public String getWsprocessor() {
        return wsprocessor;
    }

    public void setWsprocessor(String wsprocessor) {
        this.wsprocessor = wsprocessor == null ? null : wsprocessor.trim();
    }

    public String getCpumixnumber() {
        return cpumixnumber;
    }

    public void setCpumixnumber(String cpumixnumber) {
        this.cpumixnumber = cpumixnumber == null ? null : cpumixnumber.trim();
    }

    public String getSibrandname() {
        return sibrandname;
    }

    public void setSibrandname(String sibrandname) {
        this.sibrandname = sibrandname == null ? null : sibrandname.trim();
    }

    public String getSisize() {
        return sisize;
    }

    public void setSisize(String sisize) {
        this.sisize = sisize == null ? null : sisize.trim();
    }

    public String getSihardamout() {
        return sihardamout;
    }

    public void setSihardamout(String sihardamout) {
        this.sihardamout = sihardamout == null ? null : sihardamout.trim();
    }

    public String getSiopersystem() {
        return siopersystem;
    }

    public void setSiopersystem(String siopersystem) {
        this.siopersystem = siopersystem == null ? null : siopersystem.trim();
    }

    public String getSicpuram() {
        return sicpuram;
    }

    public void setSicpuram(String sicpuram) {
        this.sicpuram = sicpuram == null ? null : sicpuram.trim();
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc == null ? null : productdesc.trim();
    }

    public String getSidetails() {
        return sidetails;
    }

    public void setSidetails(String sidetails) {
        this.sidetails = sidetails == null ? null : sidetails.trim();
    }
}