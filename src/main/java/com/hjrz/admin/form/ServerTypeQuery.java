package com.hjrz.admin.form;

/**
 * @ClassName ServerTypeQuery
 * @Description TODO(查询服务器类型)
 * @author RodulphLiu
 * @Date 2017年5月8日 下午3:52:09
 * @version 1.0.0
 */
public class ServerTypeQuery {
      
      private Long typeCode;
  
      private String typeName;
      
      private String create_time;
      
      private String typeTitle;
      
      private String typeDetails;

      public Long getTypeCode() {
        return typeCode;
      }

      public void setTypeCode(Long typeCode) {
        this.typeCode = typeCode;
      }

      public String getTypeName() {
        return typeName;
      }

      public void setTypeName(String typeName) {
        this.typeName = typeName;
      }

      public String getCreate_time() {
        return create_time;
      }

      public void setCreate_time(String create_time) {
        this.create_time = create_time;
      }

      public String getTypeTitle() {
        return typeTitle;
      }

      public void setTypeTitle(String typeTitle) {
        this.typeTitle = typeTitle;
      }

      public String getTypeDetails() {
        return typeDetails;
      }

      public void setTypeDetails(String typeDetails) {
        this.typeDetails = typeDetails;
      }
}
