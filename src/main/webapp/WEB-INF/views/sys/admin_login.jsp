<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>核聚瑞增后台管理系统</title>
 <%@include file="../common/common.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/admin/login/style_login.css">
</head>
<body class="login">
	<div class="ad_m">
		<img src="/images/loginview/login_left_bg.png"/>
	</div>
	<!--登录框begin-->
	<div class="login_m">
		<div class="login_boder">
			<div class="login_padding" id="login_model">
				<form id="contact">
					<div class="form-group">
						<label>用户名：</label> 
						<input type="text" id="username" class="form-control" required placeholder="用户名" autocomplete="off"/>
					</div>
					<div class="form-group">
						<label>密码：</label> 
						<input type="password" id="upassword" class="form-control" placeholder="密码" required autocomplete="off"/>
					</div>
					<!-- <div class="checkbox">
						<label> <input type="checkbox">记住密码
						</label>
					</div> -->
					<button id="login" class="btn btn-default">提交</button>
					<!-- <a>注册</a> -->
				</form>
			</div>
		</div>
	</div>
	<!--登录框end-->
	<script type="text/javascript" src="<%=contextPath %>/js/jquery/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="<%=contextPath %>/js/admin/login/admin_login.js"></script>
</body>
</html>