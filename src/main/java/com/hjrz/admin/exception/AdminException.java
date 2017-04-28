package com.hjrz.admin.exception;

/**
 * @ClassName AdminException
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月27日 上午10:32:02
 * @version 1.0.0
 */
public class AdminException extends Exception{

  private static final long serialVersionUID = -8486481514988666169L;

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   */
  public AdminException() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   * @param cause
   * @param enableSuppression
   * @param writableStackTrace
   */
  public AdminException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   * @param cause
   */
  public AdminException(String message, Throwable cause) {
    super(message, cause);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   */
  public AdminException(String message) {
    super(message);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param cause
   */
  public AdminException(Throwable cause) {
    super(cause);
    // TODO Auto-generated constructor stub
  }
    
}
