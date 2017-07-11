package com.hjrz.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.Brand;
import com.hjrz.admin.service.BrandService;

@Controller
@RequestMapping(value="/brands")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	/** 
	 * @Title addBrand 
	 * @Description TODO(前往添加品牌页面) 
	 * @author RodulphLiu
	 * @Date 2017年8月28日
	 */
	@RequestMapping(value="/addbrand.do")
	public String toaddBrand(HttpServletRequest request){
		return "brand/add_brand";
	}
	
	/** 
	 * @Title addBrand 
	 * @Description TODO(添加品牌) 
	 * @author RodulphLiu
	 * @Date 2017年8月28日
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/add.do",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ExchangeData addBrand(@RequestBody Brand brand,HttpServletRequest request){
		ExchangeData<Object> exchangeData = new ExchangeData<Object>();
		try {
			brandService.add(brand);
		} catch (Exception e) {
			exchangeData.markException("添加失败，系统异常", e);
		}
		return exchangeData;
	}
	
	
}
