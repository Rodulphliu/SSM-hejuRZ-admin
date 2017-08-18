<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<%@include file="../common/share_static.jsp" %>
</head>
<body>
		<%@include file="../common/header.jsp"%>
		<!-- leftNav before-->
		<div class="container-fluid all">
		   <%@include file="../common/leftnav.jsp" %>
       	<!-- leftNav end -->
       	<div class="maincontent">
       		<ul class="breadcrumb">
	             <li>服务器管理</li>
	             <li class="active">服务器信息</li>
	        </ul>
	        <div class="row" id="form-datepicker">
	        		<div class="col-xs-5 col-md-5" style="margin-left:20.0%;">
	        				<div class="component">
	        				
	        					<div class="panel panel-default">
	        						 <div class="panel-body">
									    <h4><b>服务器名称：</b></h4>
										    <p>${servicerModel.serverName}</p>
										    <p><b>服务器类型：</b>${servicerModel.typeName}</p>
										    <i style="font-size:12px;color:#808080">创建时间：${servicerModel.create_time}</i>
									  </div>
	        					</div>
							
								<div class="panel panel-default">
									<div class="panel-body">
										<p><b>服务器处理器：</b>${servicerModel.siProcessor}</p>
										<p><b>最大CPU数量：</b>${servicerModel.cpuMixNumber}</p>
										<p><b>服务器品牌：</b>${servicerModel.sibrandName}</p>
										<p><b>服务器大小尺寸规格：</b>${servicerModel.siSize}</p>
										<p><b>服务器硬盘容量：</b>${servicerModel.sihardamount}</p>
										<p><b>服务器操作系统：</b>${servicerModel.sioperSystem}</p>
										<p><b>CPU容量：</b>${servicerModel.siCPURAM}</p>
										<p><b>产品特性简述：</b>${servicerModel.productdesc}</p>
									</div>
								</div>
								
								<div class="panel panel-default">
									<div class="panel-body">
										<h4><b>详细描述：</b></h4>
									    <p>${servicerModel.siDetails}</p>
									</div>
								</div>
								
								<div class="panel panel-default">
									  <div class="panel-body">
									  	 <a href="/ServerType/ServerTypeModify.do?id=${serverType.typeCode}" class="button button-primary"><b>编辑</b></a>
									  	 <a href="http://www.bootcss.com/" class="button button-caution "><b>删除</b></a>
									  	 <a href="/servicer/queryServerInit.do" class="button"><b>返回</b></a>
									  </div>
								</div>
	        			</div>
	        		</div>
	        </div>
       	</div>
       	</div>
</body>
</html>