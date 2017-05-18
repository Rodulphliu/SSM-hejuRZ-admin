package com.hjrz.admin.constants;

/**
 * @ClassName ServicerEnum
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月18日 下午5:46:35
 * @version 1.0.0
 */
public enum ServicerEnum {
    EXIST(1,"存在"),INVALID(2,"失效");
    
    private int code;
    
    private String desc;

    /**
     * @Description TODO(这里用一句话描述这个方法的作用)
     * @param code
     * @param desc
     */
    private ServicerEnum(int code, String desc) {
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
