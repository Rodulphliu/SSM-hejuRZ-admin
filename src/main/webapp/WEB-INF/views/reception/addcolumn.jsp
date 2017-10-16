<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>添加服务器类型</title>
    <%@include file="../common/share_static.jsp" %>
</head>
<body>
	<div>
		<form action="/HomeColumn/add.hjrz" method="post">
			<p>首页栏目标题:</p><input type="text" name="columnTitle"/>
			<p>栏目中的文字:</p><input type="text" name="columnContent"/>
			<p>所属栏目 :</p><input type="text" name="belongColumn"/>
			<input type="submit" value="添加">
		</form>
	</div>
</body>
</html>