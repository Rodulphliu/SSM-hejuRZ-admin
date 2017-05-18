package com.hjrz.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.ServerTypeMapper;
import com.hjrz.admin.entity.ServerType;
import com.hjrz.admin.form.ServerTypeQuery;

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
     * @Description (显示全部/条件查询)
     * @author RudolphLiu
     * @Date 2017年5月15日 下午5:34:04
     */
    public List<ServerType> findbyContion(ServerTypeQuery serverTypeQuery){
      List<ServerType> serverTypes = serverTypeMapper.selectByCondition(serverTypeQuery);
      return serverTypes;
    }

    /**
     * @Description (根据条件查询/获取结果数量)
     * @author RudolphLiu
     * @Date 2017年5月15日 下午5:58:24
     */
    public int countByQuery(ServerTypeQuery serverTypeQuery){
        int total = serverTypeMapper.countByQuery(serverTypeQuery);
        return total;
    }
    
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
    
    /**
     * @Description (根据ID获取详细信息)
     * @author RudolphLiu
     * @Date 2017年5月18日 上午11:24:35
     */
    public ServerType get(Integer id)throws Exception{
        ServerType serverType = serverTypeMapper.selectByPrimaryKey(id);
        return serverType;
    }
    
    
    /**
     * @Description (修改)
     * @author RudolphLiu
     * @Date 2017年5月18日 上午11:24:51
     */
    public void modifyServerType(ServerType serverType)throws Exception{
        int key = serverTypeMapper.updateByPrimaryKeySelective(serverType);
        if(key<1){
            throw new Exception("修改品牌失败");
        } 
    }
}
