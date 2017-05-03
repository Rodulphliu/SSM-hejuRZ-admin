<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="../views/common/share_static.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/admin/style_login.css">
</head>
<body class="login">
	<div class="login_m">
		<div class="login_boder">
			<div class="login_padding" id="login_model">
 				<form id="contact" action="/login/login.do" method="post">
					<div class="form-group">
						<label for="exampleInputEmail1">用户名：</label>
						<input type="text" id="username" name="admin_name" class="form-control" required autofocus placeholder="用户名">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">密码：</label>
						<input type="password" name="admin_password" class="form-control" placeholder="密码" required>
					</div>	
					<div class="checkbox">
						<label>
					      <input type="checkbox"> Check me out
					    </label>
					</div>
					<input type="submit" class="btn btn-default" value="登录" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>