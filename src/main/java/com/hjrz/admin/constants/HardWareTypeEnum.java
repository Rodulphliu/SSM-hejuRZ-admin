package com.hjrz.admin.constants;

public enum HardWareTypeEnum {
	 EXIST(1,"存在"),DELETED(2,"已删除"),REVIEW(3,"待审核"),DISABLED(4,"停用");
	
		private int code;
		
		private String desc;
		
		private HardWareTypeEnum(int code, String desc) {
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
