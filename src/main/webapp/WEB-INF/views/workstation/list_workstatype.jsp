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
       	<!-- rightNav before -->
       	<div class="maincontent">

    	<div class="maincontent">
            <!--我是主要内容 start-->
	            <ul class="breadcrumb">
	                <li class="active">工作站类型管理</li>
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
	              		<form class="form-inline" action="/WorkstationType/queryByLike.hjrz" method="get">
		              		<div class="form-group">
		              		 <label>类型名称</label>
		   					 <input type="text" class="form-control" name="wksTypename" placeholder="工作站类型名称，如“XX工作站”" value="${workstatype.wksTypename}">
		   					 
		   					 <label>类型标题</label>
		   					 <input type="text" class="form-control" name="wksTypetitle" placeholder="工作站类型标题内容" value="${workstatype.wksTypetitle }">
		   					 
		   					 <label>描述内容</label>
		   					 <input type="text" class="form-control" name="wksTypedetails" placeholder="描述内容，如“XXX”" value="${workstatype.wksTypedetails }">
		              		</div>
		              		
		              		<div class="form-group">
		              		<input type="submit" class="btn btn-primary" value="提交查询"/>
		              		</div>
		              	
		              		<div class="form-group pull-right">
		              		<input type="button"  class="btn btn-info" onclick="window.location.href='<%=basePath %>WorkstationType/toAddWorkstatype.hjrz'"  value="添加工作站类型>>>">
		              		</div>
		              	</form>
	              		</div>
              		</div>
              			<table>
					<thead>
						<tr style="background-color:#009ACD;color: #FFFFFF;">
							<th>编号</th>
							<th>工作站类型名</th>
							<th>工作站类型标题</th>
							<th>工作站类型详细内容</th>
							<th>创建时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>	
					<c:forEach items="${workstatypeList}" var="wl" begin="0" varStatus="status">
						<tr>
							<td>${status.index+1}</td>
							<td>${wl.wksTypename}</td>
							<td>${fn:substring(wl.wksTypetitle, 0, 15)}...</td>
							<td>${fn:substring(wl.wksTypedetails, 0, 30)}...</td>
							<td><fmt:formatDate value="${wl.createTime}" pattern="yyyy年 MM月 dd日 HH:mm"/></td>
							<td>
								<button type="button" class="btn btn-default" onclick="window.location.href='<%=basePath %>WorkstationType/queryByCode.hjrz?wksTypecode=${wl.wksTypecode}'" >查看</button>
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
        </div>
        <!-- leftNav end -->
</body>
</html>