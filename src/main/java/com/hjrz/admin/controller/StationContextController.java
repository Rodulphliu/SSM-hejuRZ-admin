package com.hjrz.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.Stationcontext;
import com.hjrz.admin.service.StationContextService;

/** 
* @ClassName: StationContextController 
* @Description: TODO(站内内容管理控制器) 
* @author RodulphLiu
* @date 2017年9月20日 下午5:10:32  
*/
@Controller
@RequestMapping(value="/StationContext")
public class StationContextController {
	
	@Autowired
	private StationContextService stationContextService;
	
	/** 
	* @Description: TODO(初始化添加站内内容) 
	* @author RodulphLiu
	* @date 2017年9月20日 下午5:32:45 
	*/
	@RequestMapping(value="/addStationContext.do")
	public String toaddStationContext(HttpServletRequest request) 
	{
		return "stationcontext/stationcontext_add";
	}
	
	/** 
	* @Description: TODO(添加站内内容) 
	* @author RodulphLiu
	* @date 2017年9月20日 下午5:33:02 
	*/
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/addStationContextInit.do",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ExchangeData addStationContext(@RequestBody Stationcontext stationcontext,HttpServletRequest request){
		ExchangeData<Object> exchangeData = new ExchangeData<Object>();
		try {
			stationContextService.addstationContext(stationcontext);
		} catch (Exception e) {
			exchangeData.markFail("添加站内内容失败");
		}
		return exchangeData;
	}
	
	/** 
	* @Description: TODO(条件查询/查询全部) 
	* @author RodulphLiu
	* @date 2017年9月20日 下午5:48:59 
	*/
	@RequestMapping(value="/stationContext.do")
	public ModelAndView getallStationContextInit(Stationcontext stationcontext){
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<Stationcontext> stationcontexts = stationContextService.findbyContion(stationcontext);
			modelAndView.addObject("stationcontexts",stationcontexts);
			modelAndView.setViewName("");
		} catch (Exception e) {
			modelAndView.addObject("500");
			modelAndView.setViewName("stationcontext/stationcontext_list");
		}
		return modelAndView;
	}
	
	
}
