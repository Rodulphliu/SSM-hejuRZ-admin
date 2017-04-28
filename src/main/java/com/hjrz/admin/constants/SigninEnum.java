package com.hjrz.admin.constants;

/**
 * @ClassName SigninEnum
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月26日 下午5:48:20
 * @version 1.0.0
 */
public enum SigninEnum {
    Y(1, "是"), N(2, "否");
    
    private int code;
    
    private String desc;
    
    private SigninEnum(int code, String desc) {
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
