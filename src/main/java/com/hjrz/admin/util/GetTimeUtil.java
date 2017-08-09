package com.hjrz.admin.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName GetTimeUtil
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年4月27日 上午10:40:27
 * @version 1.0.0
 */
public class GetTimeUtil {
    
      public static Date date = new Date();
      
      //获取标准的时间(字符串)
      public static String getStandardTime()
      {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String thisTime= df.format(date);
        return thisTime;
      }
      
      //获取连体时间(字符串)
      public static String getContinuityTime()
      {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");//设置日期格式
        String thisTime= df.format(date);
        return thisTime;
      }
      
      
      //获取格式化时间(字符串)
      public static String getZCtime() { 
      SimpleDateFormat df = new SimpleDateFormat("yyyy年-MM月-dd日   HH时:mm分:ss秒");//设置日期格式
      return df.format(date);
      }
}
