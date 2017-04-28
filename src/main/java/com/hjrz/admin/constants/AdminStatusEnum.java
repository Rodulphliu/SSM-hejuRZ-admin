package com.hjrz.admin.constants;

/**
 * @ClassName AdminStatusEnum
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月26日 下午5:33:07
 * @version 1.0.0
 */
public enum AdminStatusEnum {
    VALID(1, "合法 "), INVALID(2, "无效"), NEEDRESET(3, "需要审核"), DIMISSION(4,"已离职");
  
    private int code;
  
    private String desc;

    private AdminStatusEnum(int code, String desc) {
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
