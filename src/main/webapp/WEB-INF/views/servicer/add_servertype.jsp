<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-us">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>添加服务器类型</title>
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
				<li><a href="left1.html"><i class="fa fa-circle-o fa-fw"></i>&nbsp;服务器列表</a></li>
				<li class="active"><a href="left2.html"><i class="fa fa-circle-o fa-fw"></i>&nbsp;添加服务器</a></li>
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
	                <li class="active">首页</li>
	            </ul>
	     <div class="row" id="form-datepicker">
            <div class="page-header text-center" style="color: #31B0D5;">
                 <h2>添加服务器类型</h2>
             </div>
            <div class="col-md-8" style="margin-left: 15.5%;">
		               <form>
				  <div class="form-group">
				    <label>服务器类型名称</label>
				    <input type="text" class="form-control con-form-width-5" placeholder="请输入服务器类型的名称">
				  </div>
				  <div class="form-group">
				    <label>服务器标题简介</label>
				    <input type="text" class="form-control con-form-width-6" placeholder="请输入服务器类型的简介">
				  </div>
				  <div class="form-group">
				    <label>服务器详细介绍</label>
				    <textarea class="form-control con-form-width-7" rows="3" placeholder="请输入服务器类型详细介绍" style="resize:none"></textarea>
				  </div>
				   <input type="submit" value="Go" class="button button-pill button-primary">
				</form> 
            </div>
            <!--我是主要内容 end-->
        </div>
    </div>
    <a href="#top" id="goTop"><i class="fa fa-angle-up fa-3x"></i></a>
</body>
</html>