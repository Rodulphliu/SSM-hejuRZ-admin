package com.hjrz.admin.util;

import java.util.Set;

import org.springframework.scheduling.annotation.Async;

/**
 * @ClassName AbstractCacheService
 * @Description TODO(抽象缓存服务)
 * @author RudolphLiu
 * @Date 2017年6月16日 上午10:10:42
 * @version 1.0.0
 */
public interface AbstractCacheService {
        
        //一天
        public static int ONEDAY = 24 * 60 * 60;
        //半天
        public static int HALFDAY = 12 * 60 * 60;
        
        
        //一小时
        public static int ONEHOUR = 60 * 60;
        //半小时
        public static int HALFHOUR = 30 * 60;
        
        //10分钟
        public static int TENMINUTES = 10 * 60;
        //5分钟
        public static int FIVEMINUTES = 5 * 60;
        
        
        /**
         * @Description (默认其一天失效)
         * @author RudolphLiu
         * @Date 2017年6月16日 上午10:14:30
         */
        public void pubkey(String key,Object value);
        
        
        /**
         * @Description (自定义其失效时间)
         * @author RudolphLiu
         * @Date 2017年6月16日 上午10:33:44
         */
        public void putKey(String key, Object value, int expireTime);
        
        /**
         * @Description (根据key获取value)
         * @author RudolphLiu
         * @Date 2017年6月16日 上午10:34:19
         */
        public <T> T getValue(String key);
        
        /**
         * @Description (删除key)
         * @author RudolphLiu
         * @Date 2017年6月16日 上午10:34:35
         */
        public void removeCache(String key);
        
        /**
         * @Description (删除缓存KEY 前缀为 preString 的缓存)
         * @author RudolphLiu
         * @Date 2017年6月16日 上午10:36:29
         */
        @Async
        public void removeLikeCache(String preString);
        
        public Long sAdd(String key, String value);
        
        public Set<?> sMembers(String key);

        public Long sSize(String key);
}
