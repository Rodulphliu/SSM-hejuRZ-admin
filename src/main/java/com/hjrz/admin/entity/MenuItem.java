package com.hjrz.admin.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName Menultem
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年5月9日 下午5:53:50
 * @version 1.0.0
 */
public class MenuItem implements Serializable{

  private static final long serialVersionUID = 1L;
 
  private String item_name;

  private String item_url;

  private String data_path;
  
  private List<MenuItem> children;

  public String getItem_name() {
    return item_name;
  }


  public void setItem_name(String item_name) {
    this.item_name = item_name;
  }


  public String getItem_url() {
    return item_url;
  }


  public void setItem_url(String item_url) {
    this.item_url = item_url;
  }


  public String getData_path() {
    return data_path;
  }


  public void setData_path(String data_path) {
    this.data_path = data_path;
  }


  public List<MenuItem> getChildren() {
    return children;
  }


  public void setChildren(List<MenuItem> children) {
    this.children = children;
  }

}
