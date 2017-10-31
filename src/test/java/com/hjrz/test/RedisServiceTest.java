package com.hjrz.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.hjrz.admin.constants.CallStatusEnum;
import com.hjrz.admin.util.AbstractCacheService;

/**
 * @ClassName RedisServiceTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月4日 下午5:08:49
 * @version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
public class RedisServiceTest {
      @BeforeClass
      public static void setUpBeforeClass() throws Exception {}
    
      @AfterClass
      public static void tearDownAfterClass() throws Exception {}
    
      @Before
      public void setUp() throws Exception {}
    
      @After
      public void tearDown() throws Exception {}
      
      @Autowired
      private AbstractCacheService cacheservice;
      
      @Test
      public void test() {
    	UserTable table = new UserTable();
    	table.setId(1);
    	table.setUsername("liuzibing");
    	table.setMiaoshu("verygood");
    	table.setUsersex("男");
    	table.setCall(CallStatusEnum.SUCCESS);
    	Bee bee = new Bee();
    	bee.setBeid(3);
    	bee.setStrkey("hahhaha");
    	table.setBee(bee);
        cacheservice.putKey("kyo",table,12 * 60 * 60);
        UserTable table2 = cacheservice.getValue("kyo");
        System.out.println(table2.getId());
        System.out.println(table2.getUsername());
        System.out.println(table2.getMiaoshu());
        System.out.println(table2.getUsersex());
        System.out.println(table2.getCall());
        System.out.println(table2.getBee().getStrkey());
      }
}
