package com.hjrz.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.constants.BrandEnum;
import com.hjrz.admin.dao.BrandMapper;
import com.hjrz.admin.entity.Brand;

@Service
public class BrandService {
	
	@Autowired
	private BrandMapper brandMapper;
	
	/** 
	 * @Title add 
	 * @Description TODO(品牌添加) 
	 * @author RodulphLiu
	 * @Date 2017年8月28日
	 */
	public void add(Brand brand)throws Exception 
	{
		brand.setBrandstate(BrandEnum.EXIST);
		brandMapper.insertSelective(brand);
	}
	
	/** 
	 * @Title findbyContion 
	 * @Description TODO(获取全部/条件查询) 
	 * @author RodulphLiu
	 * @Date 2017年8月28日
	 */
	public List<Brand> findbyContion(Brand brand)
	{
		List<Brand> brands = brandMapper.selectByCondition(brand);
		return brands;
	}
	
	
}
