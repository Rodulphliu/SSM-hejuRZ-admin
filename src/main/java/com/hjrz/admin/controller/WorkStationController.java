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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hjrz.admin.data.ExchangeData;
import com.hjrz.admin.entity.Workstatype;
import com.hjrz.admin.form.WorkStationQuery;
import com.hjrz.admin.model.WorkStationModel;
import com.hjrz.admin.service.WorkStationService;
import com.hjrz.admin.service.WorkstatypeService;

@Controller
@RequestMapping(value="/worksatation")
public class WorkStationController {
		
		@Autowired
		private WorkstatypeService workstatypeService;
		
		@Autowired
		private WorkStationService workStationService;
		
		/** 
		 * @Title toadd 
		 * @Description TODO(初始化添加工作站) 
		 * @author RodulphLiu
		 * @Date 2017年9月1日
		 */
		@RequestMapping(value="/addWorkStation.do")
		public String toadd(HttpServletRequest request,HttpServletResponse response){
			try {
				List<Workstatype> workstatypes;
				workstatypes = workstatypeService.findAll();
				request.setAttribute("workstatypes",workstatypes);
			} catch (Exception e) {
				return "404";
			}
			return "workstation/workstainfo_add";
		}
		
		/** 
		 * @Title add 
		 * @Description TODO(添加工作站执行SQL) 
		 * @author RodulphLiu
		 * @Date 2017年9月1日
		 */
		@SuppressWarnings("rawtypes")
		@RequestMapping(value="/addWorkStationinfo.do",method= RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
		@ResponseBody
		public ExchangeData add(@RequestBody WorkStationModel workStationModel,HttpServletRequest request){
			ExchangeData<Object> exchangeData = new ExchangeData<Object>();
			try {
				workStationService.addWorkStation(workStationModel);
			} catch (Exception e) {
				exchangeData.markFail();
			}
			return exchangeData;
		}
		
		/** 
		 * @Title queryWorkstation 
		 * @Description TODO(获取全部/条件查询) 
		 * @author RodulphLiu
		 * @Date 2017年9月4日
		 */
		@RequestMapping(value="/workStation.do")
		public ModelAndView queryWorkstation(WorkStationQuery workStationQuery){
			ModelAndView modelAndView = new ModelAndView();
			try {
				List<WorkStationModel> workStationModels = workStationService.findbyContion(workStationQuery);
				modelAndView.addObject("workStationModels",workStationModels);
				modelAndView.setViewName("workstation/workstainfo_list");
			} catch (Exception e) {
				modelAndView.addObject("message","获取工作站失败，请联系管理员");
				modelAndView.setViewName("500");
			}
			return modelAndView;
		}
		
		/** 
		 * @Title queryWorkstationById 
		 * @Description TODO(根据ID获取工作站详细信息) 
		 * @author RodulphLiu
		 * @Date 2017年9月4日
		 */
		public ModelAndView queryWorkstationById(Long worksCode){
			ModelAndView modelAndView = new ModelAndView();
			try {
				WorkStationModel workStationModel = workStationService.getbyid(worksCode);
				modelAndView.addObject("workStationModel",workStationModel);
				modelAndView.setViewName("workstation/workstainfo_detail");
			} catch (Exception e) {
				modelAndView.addObject("message","获取工作站信息失败，请联系管理员");
				modelAndView.setViewName("500");
			}
			return modelAndView;
		}
}