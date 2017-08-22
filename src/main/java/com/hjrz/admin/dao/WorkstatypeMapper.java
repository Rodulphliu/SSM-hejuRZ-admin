package com.hjrz.admin.dao;

import com.hjrz.admin.entity.Workstatype;
import com.hjrz.admin.entity.WorkstatypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkstatypeMapper {
    int countByExample(WorkstatypeExample example);

    int deleteByExample(WorkstatypeExample example);

    int deleteByPrimaryKey(Integer wksTypecode);

    int insert(Workstatype record);

    int insertSelective(Workstatype record);

    List<Workstatype> selectByExampleWithBLOBs(WorkstatypeExample example);

    List<Workstatype> selectByExample(WorkstatypeExample example);
    
    List<Workstatype> selectAll();//全部查询
    
    List<Workstatype> selectByLike(Workstatype workstatype);//模糊查询

    Workstatype selectByPrimaryKey(Integer wksTypecode);

    int updateByExampleSelective(@Param("record") Workstatype record, @Param("example") WorkstatypeExample example);

    int updateByExampleWithBLOBs(@Param("record") Workstatype record, @Param("example") WorkstatypeExample example);

    int updateByExample(@Param("record") Workstatype record, @Param("example") WorkstatypeExample example);

    int updateByPrimaryKeySelective(Workstatype record);

    int updateByPrimaryKeyWithBLOBs(Workstatype record);

    int updateByPrimaryKey(Workstatype record);
}