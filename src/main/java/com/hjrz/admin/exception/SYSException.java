package com.hjrz.admin.exception;

/**
 * @ClassName SYSException
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月27日 上午10:31:33
 * @version 1.0.0
 */
public class SYSException extends AdminException{

  private static final long serialVersionUID = -9093368310248101664L;
    
  public SYSException(String message)
  {
    super(message);
  }
  
  public SYSException(String message,Throwable exception)
  {
    super(message,exception);
  }
}
