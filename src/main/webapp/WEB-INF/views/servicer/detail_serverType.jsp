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
        <div class="sidebar">
            <ul class="nav">
                <li id="index"><a href="index.html">首页</a></li>
		<li><a href="#">资源管理</a></li>
		<li><a href="#">前台管理</a></li>
		 <li class="has-sub active">
			<a href="javascript:void(0);"><span>服务器管理</span>
			<i class="fa fa-caret-right fa-fw pull-right"></i></a>
			<ul class="sub-menu" style="display: block;">
				<li><a href="<%=basePath %>#"><i class="fa fa-circle-o fa-fw"></i>&nbsp;服务器管理</a></li>
				<li class="active"><a href="<%=basePath %>/ServerType/queryServerTypeInit.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;服务器类型管理</a></li>
				<li><a href="<%=basePath %>/ServerType/toaddServerType.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;服务器属性管理</a></li>
			</ul>
		</li>
			<li><a href="#">工作站管理</a></li>
			<li><a href="#">硬件库管理</a></li>
			<li><a href="#">后台管理</a></li>
			<li><a href="#">用户管理</a></li>
			<li><a href="#">反馈处理</a></li>
          </ul>
       			 </div>
       	<!-- leftNav end -->
       	 <div class="maincontent">
       	 <!--我是主要内容 start-->
       	 	<ul class="breadcrumb">
	             <li>服务器类型管理</li>
	             <li class="active">服务器类型信息</li>
	        </ul>
	        <div class="row" id="form-datepicker">
	        	<div class="col-xs-5 col-md-5" style="margin-left:20.0%;">
	        		<div class="component">
	        		
	        			<div class="panel panel-default">
							  <div class="panel-body">
							    <h4><b>服务器类型名称：</b></h4>
							    <p>${serverType.typeName}</p>
							    <i style="font-size:12px;color:#808080">创建时间：${serverType.create_time}</i>
							  </div>
							</div>
              				
              				<div class="panel panel-default">
								<div class="panel-body">
								 <h4><b>服务器类型简介：</b></h4>
							    <p>${serverType.typeTitle}</p>
								</div>
							</div>
								
							<div class="panel panel-default">
								<div class="panel-body">
								<h4><b>服务器类型描述：</b></h4>
							    <p>${serverType.typeDetails}</p>
								</div>
							</div>
							
							<div class="panel panel-default">
								  <div class="panel-body">
								  	 <a href="/ServerType/ServerTypeModify.do?id=${serverType.typeCode}" class="button button-primary"><b>编辑</b></a>
								  	 <a href="http://www.bootcss.com/" class="button button-caution "><b>删除</b></a>
								  	 <a href="http://www.bootcss.com/" class="button"><b>返回</b></a>
								  </div>
							</div>
	        		
	        		</div>
	        	</div>
	        </div>
       	</div>
      </div>
</body>
</html>