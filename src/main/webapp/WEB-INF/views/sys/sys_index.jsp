<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="../common/share_static.jsp" %>
</head>
<body>
<!--外围容器 -->
	 <div class="container">
	 	<%@include file="../common/header.jsp"%>
		<%@include file="../common/leftnav.jsp"%>
		<!--正文开始-->
			<div class="col-xs-12 col-sm-9">
	      			<h3>欢迎！管理员${adminname}</h3>
					<hr style="height:10px;border:none;border-top:10px groove skyblue;"/>
					<div class="jumbotron">
						<h1>
							Welcome!
						</h1>
						<p>
							上次登录：xxxxx
							新增数据：xxxxx
						</p>
						<p>
							<a href="" class="btn btn-default">开始编辑</a>
						</p>
					</div>
			</div>
		<!--正文结束-->
	 </div>
<!-- 容器结束 -->
</body>
</html>