package com.hjrz.admin.constants;

public enum WorkStationEnum {
	EXIST(1,"存在"),INVALID(2,"失效"),DELETED(3,"已删除");
    
    private int code;
    
    private String desc;

    /**
     * @Description TODO(这里用一句话描述这个方法的作用)
     * @param code
     * @param desc
     */
    private WorkStationEnum(int code, String desc) {
      this.code = code;
      this.desc = desc;
    }

    public int getCode() {
      return code;
    }

    public void setCode(int code) {
      this.code = code;
    }

    public String getDesc() {
      return desc;
    }

    public void setDesc(String desc) {
      this.desc = desc;
    }
}
