package com.hjrz.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.Brand;
import com.hjrz.admin.service.BrandService;
import com.hjrz.admin.service.common.UploadService;

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
		return "brand/brand_add";
	}
	
	/** 
	 * @Title addBrand 
	 * @Description TODO(添加品牌)
	 * @author RodulphLiu
	 * @Date 2017年8月28日
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/addbrandinfo.do",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ExchangeData addBrand(@RequestBody Brand brand,HttpServletRequest request){
		ExchangeData<Object> exchangeData = new ExchangeData<Object>();
		try {
			brandService.add(brand);
		} catch (Exception e) {
			exchangeData.markException("添加失败，系统异常", e);
		}
		return exchangeData;
	}
	
	/** 
	 * @Title queryBrand 
	 * @Description TODO(获取全部/条件查询) 
	 * @author RodulphLiu
	 * @Date 2017年9月4日
	 */
	@RequestMapping(value="/brand.do")
	public ModelAndView queryBrand(Brand brand){
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<Brand> brands = brandService.findbyContion(brand);
			modelAndView.addObject("brands",brands);
			modelAndView.setViewName("brand/brand_list");
		} catch (Exception e) {
			modelAndView.addObject("message","获取品牌失败,请联系管理员");
			modelAndView.setViewName("500");
		}
		return modelAndView;
	}
	
	/**
	 * @Title querybrandById 
	 * @Description TODO(根据ID获取品牌详细信息) 
	 * @author RodulphLiu
	 * @Date 2017年9月4日
	 */
	public ModelAndView querybrandById(Long brandCode){
		ModelAndView modelAndView = new ModelAndView();
		try {
			Brand brand = brandService.getbyId(brandCode);
			modelAndView.addObject(brand);
			modelAndView.setViewName("");
		} catch (Exception e) {
			modelAndView.addObject("message","获取品牌失败，请联系管理员");
			modelAndView.setViewName("brand/brand_detail");
		}
		return modelAndView;
	}
	
	
}
