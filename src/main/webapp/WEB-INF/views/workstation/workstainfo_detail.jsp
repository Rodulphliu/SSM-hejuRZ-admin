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
		<%@include file="../common/header.jsp"%>
		<div class="container-fluid all">
		 <%@include file="../common/leftnav.jsp" %>
		<div class="maincontent">
            <!--我是主要内容 start-->
	            <ul class="breadcrumb">
	                <li class="active">添加服务器类型</li>
	            </ul>
	     <div class="row" id="form-datepicker">
            
            <div class="col-xs-7 col-md-7" style="margin-left:20.0%;">
              	<!--style="margin-left:20.0%;"-->
              	<div class="component">
              		<!-- 内容start -->
              		<table>
							<thead>
								<tr style="background-color:#009ACD;color: #FFFFFF;">
									<th>编号</th>
									<th>服务器名称</th>
									<th>服务器类型</th>
									<th>创建时间</th>
									<th>处理器</th>
									<th>品牌</th>
									<th>操作系统</th>
									<th>产品特性简述</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>	
							<c:forEach items="${servicerList}" var="s" begin="0" varStatus="status">
								<tr>
									<td>${status.index+1}</td>
									<td>${s.serverName}</td>
									<td>${s.typeName}</td>
									<td>${s.create_time}</td>
									<td>${s.siProcessor}</td>
									<td>${s.sibrandName}</td>
									<td>${s.sioperSystem}</td>
									<td>${s.productdesc}</td>
									<td>
										<button class="btn btn-default" type="button" onclick="window.location.href='/servicer/serverDetail.do?serverCode=${s.serverCode}'">查看</button>
										<button class="btn btn-default" type="button">编辑</button>
									</td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
              		<!-- 内容end -->	
              	</div>
              </div>
             </div>	
			</div>
		</div>
</body>
</html>