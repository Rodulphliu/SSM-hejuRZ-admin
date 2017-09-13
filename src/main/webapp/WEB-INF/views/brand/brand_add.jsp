<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>添加服务器类型</title>
		<%@include file="../common/share_static.jsp" %>
		<script type="text/javascript" src="<%=contextPath %>/js/admin/common/hjrz.common.js"></script>
		<script type="text/javascript" src="<%=contextPath %>/js/jqueryupload/jquery.ui.widget.js"></script>
		<script type="text/javascript" src="<%=contextPath %>/js/jqueryupload/jquery.iframe-transport.js"></script>
		<script type="text/javascript" src="<%=contextPath %>/js/jqueryupload/jquery.fileupload.js"></script>
</head>
<body>
		<%@include file="../common/header.jsp"%>
		<div class="container-fluid all">
		 <%@include file="../common/leftnav.jsp" %>
		<div class="maincontent">
            <!--我是主要内容 start-->
	            <ul class="breadcrumb">
	                <li class="active">添加服务器类型</li>
	            </ul>
            <div class="col-xs-9 col-md-9" style="margin-left:20.0%;">
              	<!--style="margin-left:20.0%;"-->
              	<div class="component">
              		<!-- 内容start -->
              		<div class="panel-body col-md-7">
						  	 <div class="form-group">
							    <label>品牌名称:</label>
								<input type="text" id="brandName" class="form-control" placeholder="请输入品牌名称">
							  </div>
							  <div class="form-group">
							   <label>品牌LOGO:</label><br />
								   <div id="image_box">
									    <input id="myfile" type="file" name="file" onchange="showPreview(this)" style="display:none"/>
			  							<img id="previewImg" src="<%=basePath %>/images/common/noimage.png" style="width:168px;height:128px;border-radius:10px;" onclick="F_Open_dialog()"/>
								   		<input type="hidden" id="filename" name="filename"/>
								   </div>
							  </div>
								  	<div class="form-group">
									    <label>品牌内容描述:</label>
										<textarea class="form-control" id="brandIntroduction" rows="10" style="resize:none"></textarea>
									</div>
							<div class="form-group" align="center">
										<button type="button" id="submit" class="btn btn-default">确认添加</button>
							</div>
		       		 </div>
              	<!-- 内容end -->	
              	</div>
              </div>
			</div>
		</div>
<script src="<%=contextPath %>/js/admin/brand/brand_add.js"></script>
</body>
</html>