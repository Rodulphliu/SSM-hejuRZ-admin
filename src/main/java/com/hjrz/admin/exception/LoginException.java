package com.hjrz.admin.exception;

/**
 * @ClassName LoginException
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月28日 下午3:08:17
 * @version 1.0.0
 */
public class LoginException extends AdminException{

  private static final long serialVersionUID = -2444268309218666579L;

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   */
  public LoginException() {
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
  public LoginException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   * @param cause
   */
  public LoginException(String message, Throwable cause) {
    super(message, cause);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   */
  public LoginException(String message) {
    super(message);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param cause
   */
  public LoginException(Throwable cause) {
    super(cause);
    // TODO Auto-generated constructor stub
  }

  
}
