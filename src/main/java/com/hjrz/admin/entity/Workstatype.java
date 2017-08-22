package com.hjrz.admin.entity;

import java.util.Date;

public class Workstatype {
    private Integer wksTypecode;

    private String wksTypename;

    private Date createTime;

    private String wksTypetitle;

    private String wksTypedetails;

    public Integer getWksTypecode() {
        return wksTypecode;
    }

    public void setWksTypecode(Integer wksTypecode) {
        this.wksTypecode = wksTypecode;
    }

    public String getWksTypename() {
        return wksTypename;
    }

    public void setWksTypename(String wksTypename) {
        this.wksTypename = wksTypename == null ? null : wksTypename.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getWksTypetitle() {
        return wksTypetitle;
    }

    public void setWksTypetitle(String wksTypetitle) {
        this.wksTypetitle = wksTypetitle == null ? null : wksTypetitle.trim();
    }

    public String getWksTypedetails() {
        return wksTypedetails;
    }

    public void setWksTypedetails(String wksTypedetails) {
        this.wksTypedetails = wksTypedetails == null ? null : wksTypedetails.trim();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((wksTypecode == null) ? 0 : wksTypecode.hashCode());
		result = prime * result + ((wksTypedetails == null) ? 0 : wksTypedetails.hashCode());
		result = prime * result + ((wksTypename == null) ? 0 : wksTypename.hashCode());
		result = prime * result + ((wksTypetitle == null) ? 0 : wksTypetitle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Workstatype other = (Workstatype) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (wksTypecode == null) {
			if (other.wksTypecode != null)
				return false;
		} else if (!wksTypecode.equals(other.wksTypecode))
			return false;
		if (wksTypedetails == null) {
			if (other.wksTypedetails != null)
				return false;
		} else if (!wksTypedetails.equals(other.wksTypedetails))
			return false;
		if (wksTypename == null) {
			if (other.wksTypename != null)
				return false;
		} else if (!wksTypename.equals(other.wksTypename))
			return false;
		if (wksTypetitle == null) {
			if (other.wksTypetitle != null)
				return false;
		} else if (!wksTypetitle.equals(other.wksTypetitle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Workstatype [wksTypecode=" + wksTypecode + ", wksTypename=" + wksTypename + ", createTime=" + createTime
				+ ", wksTypetitle=" + wksTypetitle + ", wksTypedetails=" + wksTypedetails + "]";
	}
    
    
    
}