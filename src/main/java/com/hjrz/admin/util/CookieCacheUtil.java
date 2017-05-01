package com.hjrz.admin.util;

/**
 * @ClassName CookieCacheUtil
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月28日 下午3:25:29
 * @version 1.0.0
 */
public interface CookieCacheUtil {
  
      public static int ONEDAY = 24 * 60 * 60;
      public static int HALFDAY = 12 * 60 * 60;
      public static int ONEHOUR = 60 * 60;
      public static int HALFHOUR = 30 * 60;
      
      //10分钟
      public static int TENMINUTES = 10 * 60;
      public static int FIVEMINUTES = 10 * 60;
      
      /**
       * @Description (默认一天失效)
       * @author RodulphLiu
       * @Date 2017年4月10日 下午2:45:33
       */
      public void putKey(String key, Object value);
      
      /**
       * @Description (自定义失效的时间)
       * @author RodulphLiu
       * @Date 2017年4月10日 下午2:46:26
       */
      public void putKey(String key, Object value, int expireTime);
      
      public <T> T getValue(String key);

      public void removeCache(String key);
}
