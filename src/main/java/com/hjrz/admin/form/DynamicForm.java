package com.hjrz.admin.form;

/**
 * @ClassName DynamicForm
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月4日 下午5:27:02
 * @version 1.0.0
 */
public class DynamicForm {
    private String dyTitle;
    private String dycontent;
    private String dyimageCover;
    
    public String getDyTitle() {
      return dyTitle;
    }
    public String getDycontent() {
      return dycontent;
    }
    public String getDyimageCover() {
      return dyimageCover;
    }
    public void setDyTitle(String dyTitle) {
      this.dyTitle = dyTitle;
    }
    public void setDycontent(String dycontent) {
      this.dycontent = dycontent;
    }
    public void setDyimageCover(String dyimageCover) {
      this.dyimageCover = dyimageCover;
    }
}
