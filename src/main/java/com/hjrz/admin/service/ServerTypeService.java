package com.hjrz.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.ServerTypeMapper;
import com.hjrz.admin.entity.ServerType;

/**
 * @ClassName ServerTypeService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年5月3日 下午4:56:14
 * @version 1.0.0
 */
@Service
public class ServerTypeService {
    
    @Autowired
    private ServerTypeMapper serverTypeMapper;

    /**
     * @Description (添加服务器类型)
     * @author RodulphLiu
     * @Date 2017年5月8日 下午3:46:15
     */
    public void addServerType(ServerType serverType)throws Exception{
        int key = serverTypeMapper.insertSelective(serverType); 
        if(key<1){
            throw new Exception("服务器类型添加失败");
        }
    }
    
    
}
