package com.hjrz.admin.service.common;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.hjrz.admin.exception.SYSException;
import com.hjrz.admin.exception.UploadException;
import com.hjrz.admin.model.FileModel;

/**
 * 上传图片
 * @author RodulphLiu
 */
@Service("UploadService")
public class UploadService {
		
		/** 
		 * @Title uploadFile 
		 * @Description TODO(文件上传，返回文件名) 
		 * @author RodulphLiu
		 * @Date 2017年9月6日
		 */
		public String uploadFile(MultipartFile file,HttpServletRequest request) throws SYSException,IOException{
			//获取文件上传位置路径
//			String path = request.getSession().getServletContext().getRealPath("/upload/");
			String path = "D:"+File.separator+"/upload/";
			//文件原名(无后缀)
			String orgname = file.getOriginalFilename().substring(0,file.getOriginalFilename().lastIndexOf("."));
			//文件类型
			String type=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
			//时间加文件名
			String dateorgname = UploadPrefix.compositionName(orgname)+type;
			//获取文件原名+文件后缀
			String fileName = file.getOriginalFilename();
			if(file.getSize()==0){
				throw new SYSException("请选择上传的文件");
			}
			if (fileName.endsWith("jpg") || fileName.endsWith("png") || fileName.endsWith("jpeg")) {
				//创建新文件
				File targetFile = new File(path,dateorgname);
				if(!targetFile.exists()){
					targetFile.mkdirs();
				}
				file.transferTo(targetFile);
			}
			else {
				throw new SYSException("文件上传类型错误");
			}
			return dateorgname;
		}
}
