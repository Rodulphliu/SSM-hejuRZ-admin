package com.hjrz.admin.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.constants.CallStatusEnum;
import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.Workstatype;
import com.hjrz.admin.service.WorkstatypeService;

@Controller
@RequestMapping(value="/WorkstationType")
public class WorkstattionTypeController {
	@Resource
	private WorkstatypeService workstatypeService;
	
	//查询所有工作站类型
	@RequestMapping(value="/queryAll.do")
	public ModelAndView queryAll(){
		ModelAndView modelAndView = new ModelAndView();
		try{
			List<Workstatype> workstatypes = workstatypeService.findAll();
			modelAndView.addObject("workstatypeList", workstatypes);
			modelAndView.setViewName("workstation/list_workstatype");
		}
		catch (Exception e) {
	          modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
	          modelAndView.addObject("message","服务器类型查询异常，请联系管理员");
	        }
		return modelAndView;
	}
	
	//跳转到add_workstatype.jsp页面
	@RequestMapping(value="/toAddWorkstatype.do")
	public ModelAndView toAddWorkstatype(){
		 ModelAndView modelAndView = new ModelAndView();
         try {
           modelAndView.setViewName("workstation/add_workstatype");
         } catch (Exception ex) {
           modelAndView.addObject("callStatus", CallStatusEnum.FAIL);
           modelAndView.addObject("message", "系统错误，请联系管理员！");
           modelAndView.setViewName("500");
       }
         return modelAndView;
	}
	
	//添加工作站类型
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/addWorkstatype.do",method= RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ExchangeData addWorkstatype( @RequestBody Workstatype workstatype , HttpServletRequest resquest,HttpServletResponse response) {
		ExchangeData<Object> exchangeData = new ExchangeData<Object>();
        try {
          workstatypeService.addOne(workstatype);
        } catch (Exception e){
          exchangeData.markException(e);
        }
		return exchangeData;
	}
	
	//模糊查询工作站类型
	//@ModelAttribute("")进行数据回显
	@RequestMapping(value="/queryByLike.do",method=RequestMethod.GET)
	public ModelAndView queryByLike(@ModelAttribute("workstatype") Workstatype workstatype){
		ModelAndView modelAndView = new ModelAndView();
		try{
		List<Workstatype> workstatypes = workstatypeService.findByLike(workstatype);
		modelAndView.addObject("workstatypeList", workstatypes);
		modelAndView.setViewName("workstation/list_workstatype");
		}catch(Exception e){
			modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
			modelAndView.addObject("message", "工作站类型查询异常,请联系管理员！");
		}
		return modelAndView;
	}
	
	//根据工作站类型ID查询
	@RequestMapping(value="/queryByCode.do")
	public ModelAndView queryByCode(Integer wksTypecode){
		ModelAndView modelAndView = new ModelAndView();
		try {
			Workstatype workstatype = workstatypeService.findByCode(wksTypecode);
			modelAndView.addObject("workstatype", workstatype);
			modelAndView.setViewName("workstation/detail_workstatype");
		} catch (Exception e) {
			modelAndView.addObject("callStatus",CallStatusEnum.FAIL);
			modelAndView.addObject("message", e.getMessage());
		}
		return modelAndView;
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/deleteByCode.do",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ExchangeData deleteByCode(@RequestBody Integer wksTypecode,HttpServletRequest resquest,HttpServletResponse response){
		ExchangeData<Object> exchangeData = new ExchangeData<Object>();
		try {
			workstatypeService.deleteByCode(wksTypecode);
		} catch (Exception e) {
			exchangeData.markException(e);
		}
		System.out.println("end.....");
		return exchangeData;
	}
}

















