package com.hjrz.admin.constants;

/**
 * @ClassName ResourceLEVEnum
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年6月16日 下午3:11:45
 * @version 1.0.0
 */
public enum ResourceLEVEnum {
        IMPORTANT(1,"重要的"),ORDINARY(2,"普通的");
  
        private int code;
        
        private String desc;

        private ResourceLEVEnum(int code, String desc) {
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
