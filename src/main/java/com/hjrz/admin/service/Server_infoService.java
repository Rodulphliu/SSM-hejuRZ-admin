package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.Server_infoMapper;

/**
 * @ClassName Server_infoService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月17日 下午3:57:25
 * @version 1.0.0
 */
@Service
public class Server_infoService {
    
    @Autowired
    private Server_infoMapper server_infoMapper;
}
