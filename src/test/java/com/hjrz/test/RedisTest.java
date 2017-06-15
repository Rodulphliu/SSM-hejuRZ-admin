package com.hjrz.test;

import redis.clients.jedis.Jedis;

/**
 * @ClassName RedisTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年6月15日 下午6:04:32
 * @version 1.0.0
 */
public class RedisTest {
      @SuppressWarnings("resource")
      public static void main(String[] args) {
            Jedis jedis = new Jedis("127.0.0.1",6379);
            jedis.auth("footman");
             System.out.println(jedis.ping());
             jedis.set("foo", "bar");
             String value = jedis.get("foo");
             System.out.println(value);
      }
}
