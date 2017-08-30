package com.hjrz.admin.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hjrz.admin.data.ExchangeData;

@Controller
@RequestMapping(value="/toupload")
public class UploadController {
	
	@RequestMapping(value="/toupload.do")
	public String toupload(HttpServletRequest request){
		return "test/testupload";
	}
	
	
	@SuppressWarnings({ "rawtypes", "unused" })
	@RequestMapping(value="/ajax/uploadFile.do",produces = {"application/json"})
	public @ResponseBody ExchangeData uploadfile(@RequestParam("uploadFileId") MultipartFile file,
			HttpServletRequest request)
	{
		ExchangeData exchangeData = new ExchangeData();
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		String fileName = file.getOriginalFilename();
		File targetFile = new File(path,fileName);
		if(!targetFile.exists()){
			targetFile.mkdirs();
		}
		try {
			file.transferTo(targetFile);
			exchangeData.markSuccess("上传成功");
		}catch (Exception e) {
			exchangeData.markFail("上传失败");
		}
		return exchangeData;
	}
}