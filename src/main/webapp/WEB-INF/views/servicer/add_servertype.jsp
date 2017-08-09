<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>添加服务器类型</title>
    <%@include file="../common/share_static.jsp" %>
    <link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/user.defined/bootstrap.ufd.css" />
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
	                <li class="active">添加服务器类型</li>
	            </ul>
	     <div class="row" id="form-datepicker">
            
            <div class="col-xs-7 col-md-7" style="margin-left:20.0%;">
              	<!--style="margin-left:20.0%;"-->
              	<div class="component">
              		<!-- 添加服务器类型框 -->
              		<div style="margin-bottom:30px;">
						<button type="button" class="btn btn-success" onclick="window.location.href='<%=basePath %>/ServerType/queryServerTypeInit.do'">
						<span class="glyphicon glyphicon-menu-left"></span>&nbsp;返回&nbsp;
						</button>
              		</div>
              			<div class="panel panel-ufd-aqua">
						  <div class="panel-heading">
						  	<h3 class="panel-title">添加服务器类型</h3>
						  </div>
						  <div class="panel-body">
						  <form >
							  	<div class="form-group">
			              		 <label>类型名称</label>
			   					<input type="text" class="form-control" id="typeName" name="typeName" placeholder="请输入完整的类型名称">
			   					 
			   					 <label>标题内容</label>
			   					 <input type="text" class="form-control" id="typeTitle" name="typeTitle"  placeholder="简单的描述该服务器类型的特点">
			   					 
			   					 <label>描述内容</label>
			   					 <textarea class="form-control" style="resize:none;" id="typeDetails" name="typeDetails" placeholder="详细的介绍服务器类型特点及其功能"></textarea>
			              		</div>
			              		<div class="form-group pull-right">
			              		<input type="button" class="btn btn-info" id="submit" value="确认添加"/>
			              		</div>
			              		</form>
						  </div>
		       		</div>
		        </div>
	        </div>
            <!--我是主要内容 end-->
        </div>
    </div>
    </div>
    <a href="#top" id="goTop"><i class="fa fa-angle-up fa-3x"></i></a>
</body>
<script type="text/javascript" src="/js/admin/servicer/add_servertype.js"></script>
</html>