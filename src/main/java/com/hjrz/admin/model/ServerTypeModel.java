package com.hjrz.admin.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @ClassName ServerTypeModel
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年5月8日 上午9:29:18
 * @version 1.0.0
 */
public class ServerTypeModel {
       //服务器类型名称
      @NotBlank(message ="服务器名称不能为空")
      @Length(min=3,max=15,message="服务器类型名称不符合字数限制")
      private String typeName;
      
       //服务器类型标题简介
      @NotBlank(message ="服务器简介不能为空")
      @Length(min=5,max=13,message="服务器类型简介不符合字数限制")
      private String typeTitle;
      
      //服务器类型详细介绍
      private String typeDetails;

      public String getTypeName() {
        return typeName;
      }

      public void setTypeName(String typeName) {
        this.typeName = typeName;
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
