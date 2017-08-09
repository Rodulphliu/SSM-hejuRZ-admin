package com.hjrz.admin.service.common;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.hjrz.admin.exception.UploadException;
import com.hjrz.admin.model.FileModel;

/**
 * 上传图片
 * @author RodulphLiu
 */
@Service("UploadService")
public class UploadService {
		
		public void uploadFile(CommonsMultipartFile file,FileModel fileModel) throws IOException{
			File destfile = new File(fileModel.getFile_path());
			FileUtils.copyInputStreamToFile(file.getInputStream(),destfile);
		}
}
