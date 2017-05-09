package com.hjrz.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hjrz.admin.entity.MenuItem;

/**
 * @ClassName MenultemService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RodulphLiu
 * @Date 2017年5月9日 下午5:57:20
 * @version 1.0.0
 */
@Service("MenultemService")
public class MenultemService {
    
    public List<MenuItem> getLeftNavItem(){
      List<MenuItem> ment_list = new ArrayList<MenuItem>();
      return ment_list;
    }
}
