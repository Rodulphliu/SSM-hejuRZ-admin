package com.hjrz.admin.util;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * @ClassName RedisCacheServiceImpl
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月4日 下午4:58:16
 * @version 1.0.0
 */

@Component("RedisCacheServiceImpl")
public class RedisCacheServiceImpl implements AbstractCacheService{
  
      @Autowired
      private RedisTemplate<String, Object> redisTemplate;
      
      private ValueOperations<String, Object> valueOps;
      
      private SetOperations<String, Object> setOperations;
      
      @PostConstruct
      private void initValueOps() {
        valueOps = redisTemplate.opsForValue();
        setOperations = redisTemplate.opsForSet();
      }

      @Override
      public void putKey(String key, Object value) {
        valueOps.set(key, value, ONEDAY, TimeUnit.SECONDS);
      }

      @Override
      public void removeCache(String key) {
        redisTemplate.delete(key);
      }

      @Override
      public void removeLikeCache(String pre) {
        Set<String> tmsKeys = redisTemplate.keys(pre + "*");
        if (tmsKeys != null && tmsKeys.size() > 0) {
          for (String string : tmsKeys) {
            redisTemplate.delete(string);
          }
        }
      }

      public Long sAdd(String key, String value) {
        return setOperations.add(key, value);
      }

      public Set<Object> sMembers(String key) {
        return setOperations.members(key);
      }

      public Long sSize(String key) {
        return setOperations.size(key);
      }
      
      final Logger logger = LoggerFactory.getLogger(RedisCacheServiceImpl.class);

      @SuppressWarnings("unchecked")
      @Override
      public <T>  T getValue(String key) {
        T t =  (T) redisTemplate.opsForValue().get(key) ;
        if(t != null){
          logger.info("RedisCacheService Hit Key " + key);
        }
        return t;
      }

            @Override
            public void putKey(String key, Object value, int expireTime) {
              valueOps.set(key, value, expireTime, TimeUnit.SECONDS);
            }
}
