package com.hjrz.admin.constants;

/**
 * @ClassName DynamicStatusEnum
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月4日 下午5:00:49
 * @version 1.0.0
 */
public enum DynamicStatusEnum {
      ALIVE(1,"存在"),DELETED(2,"已删除"),PENDING(3,"待审核");
  
      private int code;
      
      private String desc;

      /**
       * @Description TODO(这里用一句话描述这个方法的作用)
       * @param code
       * @param desc
       */
      private DynamicStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
      }

      public int getCode() {
        return code;
      }

      public String getDesc() {
        return desc;
      }

      public void setCode(int code) {
        this.code = code;
      }

      public void setDesc(String desc) {
        this.desc = desc;
      }
    
}
