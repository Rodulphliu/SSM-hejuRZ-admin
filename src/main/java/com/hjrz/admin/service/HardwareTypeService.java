package com.hjrz.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hjrz.admin.constants.HardWareStateEnum;
import com.hjrz.admin.dao.HardwaretypeMapper;
import com.hjrz.admin.entity.Hardwaretype;

@Service("HardwareTypeService")
public class HardwareTypeService {
	
	@Autowired
	private HardwaretypeMapper hardwaretypeMapper;
	
	/** 
	 * @Title addhardwareType 
	 * @Description TODO(添加硬件类型) 
	 * @author RodulphLiu
	 * @Date 2017年9月4日
	 */
	public void addhardwareType(Hardwaretype hardwaretype)throws Exception{
		hardwaretype.setHardtypestate(HardWareStateEnum.EXIST);
		hardwaretypeMapper.insertSelective(hardwaretype);
	}
	
	/** 
	 * @Title findbyContion
	 * @Description TODO(获取全部/条件查询)
	 * @author RodulphLiu
	 * @Date 2017年9月8日
	 */
	public List<Hardwaretype> findbyContion(Hardwaretype hardwaretype)throws Exception{
		List<Hardwaretype> hardwaretypes = hardwaretypeMapper.selectByCondition(hardwaretype);
		return hardwaretypes;
	}	
	
	/** 
	 * @Title getByid 
	 * @Description TODO(根据ID获取相关对象) 
	 * @author RodulphLiu
	 * @Date 2017年9月14日
	 */
	public Hardwaretype getByid(Long hardwaretypeCode)throws Exception
	{
		Hardwaretype hardwaretype = hardwaretypeMapper.selectByPrimaryKey(hardwaretypeCode);
		return hardwaretype;
	}
}
