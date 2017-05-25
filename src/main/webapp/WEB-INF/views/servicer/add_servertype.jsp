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
		<!-- leftNav before-->
		<div class="container-fluid all">
        <div class="sidebar">
            <ul class="nav">
                <li id="index"><a href="index.html">首页</a></li>
		<li><a href="#">资源管理</a></li>
		<li><a href="#">前台管理</a></li>
		<li class="has-sub active">
			<a href="javascript:void(0);"><span>服务器管理</span>
			<i class="fa fa-caret-right fa-fw pull-right"></i></a>
			<ul class="sub-menu" style="display: block;">
				<li><a href="<%=basePath %>/ServerType/queryServerTypeInit.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;服务器列表</a></li>
				<li class="active"><a href="<%=basePath %>/ServerType/toaddServerType.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;添加服务器</a></li>
			</ul>
		</li>
		<li><a href="#">工作站管理</a></li>
		<li><a href="#">硬件库管理</a></li>
		<li><a href="#">后台管理</a></li>
		<li><a href="#">用户管理</a></li>
		<li><a href="#">反馈处理</a></li>
            </ul>
        </div>
        <!-- leftNav end -->
        <div class="maincontent">
            <!--我是主要内容 start-->
	            <ul class="breadcrumb">
	                <li class="active">首页</li>
	            </ul>
	     <div class="row" id="form-datepicker">
            <div class="page-header text-center" style="color: #31B0D5;">
                 <h2>添加服务器类型</h2>
             </div>
            <div class="col-md-5" style="margin-left: 30.0%;">
		       <form action="<%=basePath %>ServerType/addservertype.do" method="post">
				  <div class="form-group">
				    <label>服务器类型名称</label>
				    <input type="text" class="form-control" id="typeName" name="typeName"  placeholder="请输入服务器类型的名称">
				  </div>
				  <div class="form-group">
				    <label>服务器标题简介</label>
				    <input type="text" class="form-control" id="typeTitle" name="typeTitle"  placeholder="请输入服务器类型的简介">
				  </div>
				  <div class="form-group">
				    <label>服务器详细介绍</label>
				    <textarea class="form-control" rows="3" id="typeDetails" name="typeDetails"  placeholder="请输入服务器类型详细介绍" style="resize:none"></textarea>
				  </div>
				  <div align="center">
				  	 <button id="subform" type="submit" class="button button-pill button-primary">提交</button>
				 </div>
				</form> 
            </div>
            <!--我是主要内容 end-->
        </div>
    </div>
    </div>
    <a href="#top" id="goTop"><i class="fa fa-angle-up fa-3x"></i></a>
   	<script type="text/javascript">
   	$(document).ready(function() {
   		toastr.options = {
   				"progressBar": true,
   				"positionClass": "toast-bottom-right",
   			};
   		
   		//当添加完成返回页面时
   		if("${exchangeData.callStatus}" == 'SUCCESS')
   		{
   			Command: toastr["success"]("添加服务器类型成功");
   		}
   		if("${exchangeData.callStatus}" == 'FAIL')
   		{
   			Command: toastr["error"]("添加失败，请联系管理员");
   		}
   		
   		
   		//绑定表单验证
   		 $("#subform").click(function(){
   			 if($("#typeName").val()=="" || $("#typeTitle").val()=="" || $("#typeDetails").val()==""){
   				 Command: toastr["info"]("请输入完整的表单");
   				 return false;
   			 }
   		 })
   	})
   	
   	</script>
</body>
</html>