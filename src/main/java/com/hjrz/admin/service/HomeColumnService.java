package com.hjrz.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.HomeColumnMapper;
import com.hjrz.admin.entity.HomeColumn;

/**
 * @ClassName HomeColumnService(首页栏目表)
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月25日 下午1:18:48
 * @version 1.0.0
 */
@Service
public class HomeColumnService {
  
      @Autowired
      private HomeColumnMapper homeColumnMapper;
      
      
      /**
       * @Description (查询全部/条件查询)
       * @author RudolphLiu
       * @Date 2017年5月25日 下午4:57:29
       */
      public List<HomeColumn> findBycontion(HomeColumn homeColumn){
          if(homeColumn.getColumnTitle() == ""){
              homeColumn.setColumnTitle(null);
          }
          if(homeColumn.getColumnContent() == ""){
              homeColumn.setColumnContent(null);
          }
          List<HomeColumn> homeColumns = homeColumnMapper.selectByCondition(homeColumn);
          return homeColumns;
      }
      
      /**
       * @Description (添加首页栏目标题和介绍)
       * @author RudolphLiu
       * @Date 2017年5月25日 下午1:58:11
       */
      public void add(HomeColumn homeColumn)throws Exception{
         int key = homeColumnMapper.insertSelective(homeColumn);
         if(key<0){
             throw new Exception("添加失败！请联系管理员");
         }
      }
      
      
}
