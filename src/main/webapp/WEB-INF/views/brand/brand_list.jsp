<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>添加服务器类型</title>
		<%@include file="../common/share_static.jsp" %>
		<!-- ServerTypeList CSS -->
		<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/servicer.css/component.css" />
		<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/servicer.css/normalize.css" />
</head>
<body>
		<%@include file="../common/header.jsp"%>
		<div class="container-fluid all">
		 <%@include file="../common/leftnav.jsp" %>
		<div class="maincontent">
            <!--我是主要内容 start-->
	            <ul class="breadcrumb">
	                <li class="active">添加服务器类型</li>
	            </ul>
            <div class="col-xs-12 col-md-12">
              	<!--style="margin-left:20.0%;"-->
              	<div class="component">
              	<input type="button"  class="btn btn-info" onclick="window.location.href='<%=basePath %>brands/addbrand.hjrz'" value="添加品牌>>>">
              		<!-- 内容start -->
              		  	<table>
					<thead>
						<tr style="background-color:#009ACD;color: #FFFFFF;">
							<th>编号</th>
							<th>品牌名称</th>
							<th>品牌logo</th>
							<th>品牌描述</th>
							<th>创建时间</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${brands}" var="b" begin="0" varStatus="status">
						<tr>
							<td>${status.index+1}</td>
							<td>${b.brandName}</td>
							<td><img src="/upload/${b.brandImgPath}" style="width:100px;height:40px;"/></td>
							<td>${fn:substring(b.brandIntroduction, 0, 30)}...</td>
							<td><fmt:formatDate value="${b.create_time}" pattern="yyyy年 MM月 dd日 HH:mm"/></td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
              	</div>
              </div>
			</div>
		</div>
</body>
</html>