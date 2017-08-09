package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.DynamicStatusEnum;
import com.hjrz.admin.dao.DynamicMapper;
import com.hjrz.admin.entity.Dynamic;
import com.hjrz.admin.form.DynamicForm;
import com.hjrz.admin.util.AbstractCacheService;

/**
 * @ClassName DynamicService
 * @Description TODO(动态服务层)
 * @author RudolphLiu
 * @Date 2017年7月4日 下午5:22:50
 * @version 1.0.0
 */
@Service("DynamicService")
public class DynamicService {
        
      @Autowired
      private DynamicMapper dynamicMapper;
      
      @Autowired
      private AbstractCacheService cacheService;
      
      public void addDynamic(DynamicForm dynamicForm)throws Exception{
          Dynamic dynamic = new Dynamic();
          dynamic.setDyAliveState(DynamicStatusEnum.ALIVE);
          dynamic.setCreate_admin("null");
          dynamicMapper.insert(dynamic);
      }
}
