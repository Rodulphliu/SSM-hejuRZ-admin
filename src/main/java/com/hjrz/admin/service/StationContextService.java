package com.hjrz.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.StationContextSourceEnum;
import com.hjrz.admin.dao.StationcontextMapper;
import com.hjrz.admin.entity.Stationcontext;

/**
 * @ClassName: StationContextService
 * @Description: TODO(站内内容服务)
 * @author RodulphLiu
 * @date 2017年9月20日 下午4:42:52
 */
@Service
public class StationContextService {

	@Autowired
	private StationcontextMapper stationcontextMapper;


	/** 
	* @Description: TODO(添加站内内容) 
	* @author RodulphLiu
	* @date 2017年9月20日 下午5:06:21 
	*/
	public void addstationContext(Stationcontext stationcontext) throws Exception {
		stationcontextMapper.insertSelective(stationcontext);
	}
	
	/** 
	* @Description: TODO(查询全部/条件查询) 
	* @author RodulphLiu
	* @date 2017年9月20日 下午5:45:40 
	*/
	public List<Stationcontext> findbyContion(Stationcontext stationcontext)throws Exception{
		return stationcontextMapper.selectByCondition(stationcontext);
	}
}
