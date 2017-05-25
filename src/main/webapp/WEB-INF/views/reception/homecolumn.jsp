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
		<table>
			<c:forEach items="${homeColumns}" var="s">
				<tr>
					<td>${s.columnTitle}</td>
					<td>${s.belongColumn}</td>
					<td>${s.columnContent}</td>
				</tr>
			</c:forEach>
		</table>
		</div>
	</body>
</html>