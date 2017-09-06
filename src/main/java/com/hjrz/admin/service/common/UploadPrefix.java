package com.hjrz.admin.service.common;

import com.hjrz.admin.util.GetTimeUtil;

public class UploadPrefix {
	
	/** 
	 * @Title compositionName 
	 * @Description TODO(为上传文件名添加后缀) 
	 * @author RodulphLiu
	 * @Date 2017年9月6日
	 */
	public static String compositionName(String orgname){
		String getDate = GetTimeUtil.getContinuityTime();
		String MergeString = orgname+getDate;
		return MergeString;
	}
	
	
}
