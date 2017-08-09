<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>To upload</title>
	<%@include file="../common/share_static.jsp" %>
	<link rel="stylesheet" href="<%=contextPath %>/css/test/amazeui.min.css">
	<link rel="stylesheet" href="<%=contextPath %>/css/test/amazeui.cropper.css">
	<link rel="stylesheet" href="<%=contextPath %>/css/test/custom_up_img.css">
	 <style type="text/css">
     		.up-img-cover {width: 100px;height: 100px;}
     		.up-img-cover img{width: 100%;}
     </style>
</head>
<body>
	<div class="up-img-cover"  id="up-img-touch" >
    		<img class="am-circle" alt="点击图片上传" src="img/hu.jpg" data-am-popover="{content: '点击上传', trigger: 'hover focus'}" >
    	</div>
    	<div><a style="text-align: center; display: block;"  id="pic"></a></div>
    	
    	<!--图片上传框-->
    	<div class="am-modal am-modal-no-btn up-frame-bj " tabindex="-1" id="doc-modal-1">
		  <div class="am-modal-dialog up-frame-parent up-frame-radius">
		    <div class="am-modal-hd up-frame-header">
		       <label>修改头像</label>
		      <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
		    </div>
		    <div class="am-modal-bd  up-frame-body">
		      <div class="am-g am-fl">
		      	<div class="am-form-group am-form-file">
			      <div class="am-fl">
			        <button type="button" class="am-btn am-btn-default am-btn-sm">
			          <i class="am-icon-cloud-upload"></i> 选择要上传的文件</button>
			      </div>
			      <input type="file" id="inputImage">
			   	</div>
		      </div>
		      <div class="am-g am-fl" >
		      	<div class="up-pre-before up-frame-radius">
		      		<img alt="" src="" id="image" >
		      	</div>
		      	<div class="up-pre-after up-frame-radius">
		      	</div>
		      </div>
		      <div class="am-g am-fl">
   				<div class="up-control-btns">
    				<span class="am-icon-rotate-left"  onclick="rotateimgleft()"></span>
    				<span class="am-icon-rotate-right" onClick="rotateimgright()"></span>
    				<span class="am-icon-check" id="up-btn-ok" url="/admin/user/upload.action"></span>
   				</div>
	    	  </div>
		      
		    </div>
		  </div>
		</div>
    	
    	<!--加载框-->
    	<div class="am-modal am-modal-loading am-modal-no-btn" tabindex="-1" id="my-modal-loading">
		  <div class="am-modal-dialog">
		    <div class="am-modal-hd">正在上传...</div>
		    <div class="am-modal-bd">
		      <span class="am-icon-spinner am-icon-spin"></span>
		    </div>
		  </div>
		</div>
		
		<!--警告框-->
		<div class="am-modal am-modal-alert" tabindex="-1" id="my-alert">
		  <div class="am-modal-dialog">
		    <div class="am-modal-hd">信息</div>
		    <div class="am-modal-bd"  id="alert_content">
		              成功了
		    </div>
		    <div class="am-modal-footer">
		      <span class="am-modal-btn">确定</span>
		    </div>
		  </div>
		</div>
		<script type="text/javascript" charset="utf-8" src="<%=contextPath %>/js/test/amazeui.min.js"></script>
		<script type="text/javascript" charset="utf-8" src="<%=contextPath %>/js/test/cropper.min.js"></script>
		<script type="text/javascript" charset="utf-8" src="<%=contextPath %>/js/test/custom_up_img.js"></script>
</body>
</html>