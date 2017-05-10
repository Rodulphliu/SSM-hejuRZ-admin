package com.hjrz.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hjrz.admin.entity.MenuItem;

/**
 * @ClassName MenultemService
 * @Description TODO(菜单导航)
 * @author RudolphLiu
 * @Date 2017年5月10日 上午9:51:52
 * @version 1.0.0
 */
@Service("MenultemService")
public class MenultemService {
    
    public List<MenuItem> getLeftNavItem(){
      List<MenuItem> ment_list = new ArrayList<MenuItem>();
      return ment_list;
    }
}
