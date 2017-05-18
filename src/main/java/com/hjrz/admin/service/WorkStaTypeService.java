package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.WorkstatypeMapper;
import com.hjrz.admin.entity.Workstatype;

/**
 * @ClassName WorkStaTypeService
 * @Description TODO(工作站类型管理)
 * @author RudolphLiu
 * @Date 2017年5月18日 下午5:24:34
 * @version 1.0.0
 */
@Service
public class WorkStaTypeService {
    
    @Autowired
    private WorkstatypeMapper workstatypeMapper;
    
    /**
     * @Description (添加工作站类型)
     * @author RudolphLiu
     * @Date 2017年5月18日 下午5:27:34
     */
    public void addWorkstaType(Workstatype workstatype)throws Exception{
      int key = workstatypeMapper.insertSelective(workstatype);
      if(key<1){
        throw new Exception("添加工作站类型失败");
      }
    }
    
}
