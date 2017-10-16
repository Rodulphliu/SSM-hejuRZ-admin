<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<%@include file="../common/share_static.jsp" %>
</head>
<body>
		<%@include file="../common/header.jsp"%>
		<!-- leftNav before-->
		<div class="container-fluid all">
        <%@include file="../common/leftnav.jsp" %>
       	<!-- leftNav end -->
       	 <div class="maincontent">
       	 <!--我是主要内容 start-->
       	 	<ul class="breadcrumb">
	             <li>服务器类型管理</li>
	             <li class="active">服务器类型信息</li>
	        </ul>
	        <div class="row" id="form-datepicker">
	        	<div class="col-xs-5 col-md-5" style="margin-left:20.0%;">
	        		<div class="component">
	        		
	        			<div class="panel panel-info">
						  <div class="panel-heading">
						  	<h3 class="panel-title">编辑服务器类型</h3>
						  </div>
						  <div class="panel-body">
						  	<form id="formbur">
							  	<div class="form-group">
							  	<input type="hidden" value="${serverType.typeCode}" id="typeCode"/>
			              		 <label>类型名称</label>
			   					 <input type="text" class="form-control" id="typeName" name="typeName" placeholder="请输入完整的类型名称" value="${serverType.typeName}">
			   					 
			   					 <label>标题内容</label>
			   					 <input type="text" class="form-control" id="typeTitle" name="typeTitle"  placeholder="简单的描述该服务器类型的特点" value="${serverType.typeTitle}">
			   					 
			   					 <label>描述内容</label>
			   					 <textarea class="form-control" style="resize:none;"  rows="5"  id="typeDetails" name="typeDetails">${serverType.typeDetails}</textarea>
			              		</div>
			              		<div class="form-group pull-right">
			              			<button class="btn btn-default" id="emptybtn">重置</button>
			              			<input type="button" class="btn btn-info" id="submit" value="确认修改"/>
			              		</div>
			              		<script>
			              			$(function(){
				              				$("#emptybtn").click(function(){
				              					if(window.confirm('确定要清空输入框中的内容？')){
										            $("#typeName").val("");
								              		$("#typeTitle").val("");
								              		$("#typeDetails").val("");
										           return true;
										        }else{
										           return false;
										        }
				              				});
				              				
				              				$("#back").click(function(){
				              					if(window.confirm('确定放弃本次编辑？')){
				              					 window.location.href='/ServerType/ServerTypeDetail.hjrz?TypeCode=${serverType.typeCode}'
										           return true;
										        }else{
										           return false;
										        }
				              				});
			              			})
			              		</script>
			              		<div class="form-group pull-left">
			              			<input type="button" class="btn btn-info" id="back" value="返回"/>
			              		</div>
			              	</form>
						  </div>
		       		</div>
	        		</div>
	        	</div>
	        </div>
       	</div>
      </div>
</body>
<script type="text/javascript" src="/js/admin/servicer/modify_servertype.js"></script>
</html>