package com.hjrz.admin.entity;

import java.util.Date;

public class HomeColumn {
    private Integer columnId;

    private String columnTitle;

    private String belongColumn;

    private Date create_time;

    private String columnContent;

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public String getColumnTitle() {
        return columnTitle;
    }

    public void setColumnTitle(String columnTitle) {
        this.columnTitle = columnTitle == null ? null : columnTitle.trim();
    }

    public String getBelongColumn() {
        return belongColumn;
    }

    public void setBelongColumn(String belongColumn) {
        this.belongColumn = belongColumn == null ? null : belongColumn.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getColumnContent() {
        return columnContent;
    }

    public void setColumnContent(String columnContent) {
        this.columnContent = columnContent == null ? null : columnContent.trim();
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
        HomeColumn other = (HomeColumn) that;
        return (this.getColumnId() == null ? other.getColumnId() == null : this.getColumnId().equals(other.getColumnId()))
            && (this.getColumnTitle() == null ? other.getColumnTitle() == null : this.getColumnTitle().equals(other.getColumnTitle()))
            && (this.getBelongColumn() == null ? other.getBelongColumn() == null : this.getBelongColumn().equals(other.getBelongColumn()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getColumnContent() == null ? other.getColumnContent() == null : this.getColumnContent().equals(other.getColumnContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getColumnId() == null) ? 0 : getColumnId().hashCode());
        result = prime * result + ((getColumnTitle() == null) ? 0 : getColumnTitle().hashCode());
        result = prime * result + ((getBelongColumn() == null) ? 0 : getBelongColumn().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getColumnContent() == null) ? 0 : getColumnContent().hashCode());
        return result;
    }
}