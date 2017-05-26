<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert admin</title>
</head>
<body>
	<form action="/Account/add.do" method="post">
		<h5>账号:</h5><input type="text" name="admin_name" />
		<br/>
		<h5>密码:</h5><input type="password" name="admin_password"/>
		<br/>
		<input type="submit" value="确定" />
	</form>
</body>
</html>