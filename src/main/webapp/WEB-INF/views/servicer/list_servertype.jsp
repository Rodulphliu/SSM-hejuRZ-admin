<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-us">
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>服务器类型列表</title>
		<%@include file="../common/share_static.jsp" %>
		<!-- ServerTypeList CSS -->
		<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/servicer.css/component.css" />
		<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/servicer.css/normalize.css" />
</head>
<body>
		<%@include file="../common/header.jsp"%>
		<!-- leftNav before-->
		<div class="container-fluid all">
		<%@include file="../common/leftnav.jsp"%>
       <div class="maincontent">
            <!--我是主要内容 start-->
	     <ul class="breadcrumb">
	         <li class="active">首页</li>
	     </ul>
	     <div class="row" id="form-datepicker">
           <div class="col-xs-12 col-md-12">
              	<!--style="margin-left:20.0%;"-->
              		<div class="component">
              		<!--条件查询框-->
              		<div class="panel panel-primary">	
              			<div class="panel-heading">
              				<h3 class="panel-title">条件查询</h3>
              			</div>
              			<div class="panel-body">
	              		<form class="form-inline" action="/ServerType/queryServerTypeInit.do" method="get">
		              		<div class="form-group">
		              		 <label>类型名称</label>
		   					 <input type="text" class="form-control" name="typeName" placeholder="类型名称，如“刀片”" value="${serverTypeQuery.typeName}">
		   					 
		   					 <label>标题内容</label>
		   					 <input type="text" class="form-control" name="typeTitle" placeholder="标题内容，如“可插装多个”" value="${serverTypeQuery.typeTitle}">
		   					 
		   					 <label>描述内容</label>
		   					 <input type="text" class="form-control" name="typeDetails" placeholder="描述内容，如“高可用”" value="${serverTypeQuery.typeDetails}">
		              		</div>
		              		
		              		<div class="form-group">
		              		<input type="submit" class="btn btn-primary" value="提交查询"/>
		              		</div>
		              	
		              		<div class="form-group pull-right">
		              		<input type="button"  class="btn btn-info" onclick="window.location.href='<%=basePath %>ServerType/toaddServerType.do'" value="添加服务器类型>>>">
		              		</div>
		              	</form>
	              		</div>
              		</div>
              			<table>
					<thead>
						<tr style="background-color:#009ACD;color: #FFFFFF;">
							<th>编号</th>
							<th>服务器类型名</th>
							<th>服务器类型标题</th>
							<th>服务器类型详细内容</th>
							<th>创建时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>	
					<c:forEach items="${serverTypeList}" var="s" begin="0" varStatus="status">
						<tr>
							<td>${status.index+1}</td>
							<td>${s.typeName}</td>
							<td>${fn:substring(s.typeTitle, 0, 15)}...</td>
							<td>${fn:substring(s.typeDetails, 0, 30)}...</td>
							<td><fmt:formatDate value="${s.create_time}" pattern="yyyy年 MM月 dd日 HH:mm"/></td>
							<td>
								<button type="button" class="btn btn-default" onclick="window.location.href='/ServerType/ServerTypeDetail.do?TypeCode=${s.typeCode}'" >查看</button>
								<button type="button" class="btn btn-default">编辑</button>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
              		</div>  
            <!--我是主要内容 end-->
        </div>
    	</div>
    </div>
        </div>
        <!-- leftNav end -->
</body>
</html>