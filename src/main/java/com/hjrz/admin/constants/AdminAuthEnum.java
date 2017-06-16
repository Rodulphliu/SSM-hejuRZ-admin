package com.hjrz.admin.constants;

/**
 * @ClassName AdminAuthEnum
 * @Description TODO(管理员权限)
 * @author RudolphLiu
 * @Date 2017年6月16日 下午2:24:16
 * @version 1.0.0
 */
public enum AdminAuthEnum {
       HIGHEST(1,"最高级别管理员"),VICE(2,"总管理员"),ORDINARY(3,"普通管理员");
  
        private int code;
        
        private String desc;

        private AdminAuthEnum(int code, String desc) {
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
