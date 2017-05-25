package com.hjrz.admin.dao;

import com.hjrz.admin.entity.PageContent;
import com.hjrz.admin.entity.PageContentExample;

public interface PageContentMapper {
    int countByExample(PageContentExample example);

    int deleteByPrimaryKey(Integer contentCode);

    int insert(PageContent record);

    int insertSelective(PageContent record);

    PageContent selectByPrimaryKey(Integer contentCode);

    int updateByPrimaryKeySelective(PageContent record);

    int updateByPrimaryKeyWithBLOBs(PageContent record);

    int updateByPrimaryKey(PageContent record);
}