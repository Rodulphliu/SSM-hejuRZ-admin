package com.hjrz.admin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.WorkstatypeMapper;
import com.hjrz.admin.entity.Workstatype;
import com.hjrz.admin.entity.WorkstatypeExample;

@Service("workstatypeService")
public class WorkstatypeService {
	@Resource
	 private WorkstatypeMapper workstatypeMapper;
	
	//全部查询业务
	public List<Workstatype> findAll() throws Exception{
		List<Workstatype> workstatypes = workstatypeMapper.selectAll();
		return workstatypes;
	}
	
	//添加工作站类型业务
	public void addOne(Workstatype record) throws Exception{
		int total = workstatypeMapper.insertSelective(record);
		if(total < 1){
			throw new Exception("工作站类型添加失败！");
		}
	}
	
	//工作站类型模糊查询业务
	public List<Workstatype> findByLike(Workstatype workstatype) throws Exception{
		List<Workstatype> workstatypes = workstatypeMapper.selectByLike(workstatype);
		return workstatypes;
	}
	
	//根据工作站类型ID查询业务
	public Workstatype findByCode(Integer wksTypecode) throws Exception{
		Workstatype workstatype = workstatypeMapper.selectByPrimaryKey(wksTypecode);
		if(workstatype == null){
			throw new Exception("工作站类型信息查询失败，请联系管理员！");
		}
		return workstatype;
	}
	
	
	//根据工作站类型ID删除业务
	public void deleteByCode(Integer wksTypecode) throws Exception{
		int total = workstatypeMapper.deleteByPrimaryKey(wksTypecode);
		if(total < 1){
			throw new Exception("工作站类型删除失败！");
		}	
	}
	
	
	
}














