package com.hjrz.admin.util;

import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @ClassName RedisObjectMapper
 * @Description TODO(RedisMapper)
 * @author RudolphLiu
 * @Date 2017年6月15日 下午6:12:54
 * @version 1.0.0
 */
@SuppressWarnings("serial")
public class RedisObjectMapper extends  ObjectMapper {
      
  public RedisObjectMapper() {
        super();
        setTimeZone(TimeZone.getDefault());
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        setSerializationInclusion(Include.NON_NULL);
        enableDefaultTyping(DefaultTyping.NON_FINAL, As.PROPERTY);
  }
}
