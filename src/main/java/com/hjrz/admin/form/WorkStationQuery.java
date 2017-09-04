package com.hjrz.admin.form;

public class WorkStationQuery {
		//根据工作站id搜索
		private Integer worksCode;
		
		//根据工作站名称搜索
		private String worksName;
		
		//根据工作站类型名称搜索
		private String wksTypename;

		public Integer getWorksCode() {
			return worksCode;
		}

		public void setWorksCode(Integer worksCode) {
			this.worksCode = worksCode;
		}

		public String getWorksName() {
			return worksName;
		}

		public void setWorksName(String worksName) {
			this.worksName = worksName;
		}

		public String getWksTypename() {
			return wksTypename;
		}

		public void setWksTypename(String wksTypename) {
			this.wksTypename = wksTypename;
		}
		
		
}
