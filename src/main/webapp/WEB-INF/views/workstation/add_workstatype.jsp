<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>添加服务器类型</title>
    <%@include file="../common/share_static.jsp" %>
    <link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/user.defined/bootstrap.ufd.css" />
   <script type="text/javascript">
   $(function(){
		$("#submit").click(function(){
			var workstatype = {};
			workstatype.wksTypename = $("#wksTypename").val();
			workstatype.wksTypetitle = $("#wksTypetitle").val();
			workstatype.wksTypedetails = $("#wksTypedetails").val();
			if( $("#wksTypename").val()!="" && $("#wksTypetitle").val()!="" && $("#wksTypedetails").val()!=""){
				$.ajax({
					url:"../WorkstationType/addWorkstatype.hjrz",
				    type:'post',
				    contentType:'application/json',
				    dataType:'json',
				    data:JSON.stringify(workstatype),
				    success:function(data){
				    	if(data.callStatus == 'SUCCESS'){
				    			alert("success");
								$(location).attr('href', '../WorkstationType/queryAll.hjrz');
				    	}
				    	else{
				    			toastr.options = {
									"progressBar": true,
									"positionClass": "toast-bottom-right",
								};
								Command: toastr["error"]("录入失败","失败")
								return false;
				    	}
			   	 	},
					error:function(){
						
					}
				})
			}
			else{
				toastr.options = {
						"progressBar":true,
						"preventDuplicates":true,
						"positionClass": "toast-bottom-right",
				};
				Command: toastr["warning"]("请输入完整的表单","提示")
				return false;
			}
		});
})
   </script> 
    
    
</head>
<body>
	<%@include file="../common/header.jsp"%>
	<div class="container-fluid all">
	<%@include file="../common/leftnav.jsp" %>
  	<div class="maincontent">
      <!--我是主要内容 start-->
	       <ul class="breadcrumb">
	            <li class="active">添加工作站类型</li>
	       </ul>
	     <div class="row" id="form-datepicker">
            
            <div class="col-xs-7 col-md-7" style="margin-left:20.0%;">
              	<!--style="margin-left:20.0%;"-->
              	<div class="component">
              		<!-- 添加工作站类型框 -->
              		<div style="margin-bottom:30px;">
						<button type="button" class="btn btn-success" onclick="window.location.href='<%=basePath %>ServerType/queryServerTypeInit.hjrz'">
						<span class="glyphicon glyphicon-menu-left"></span>&nbsp;返回&nbsp;
						</button>
              		</div>
              			<div class="panel panel-ufd-aqua">
						  <div class="panel-heading">
						  	<h3 class="panel-title">添加工作站类型</h3>
						  </div>
						  <div class="panel-body">
						  <form >
							  	<div class="form-group">
			              		 <label>类型名称</label>
			   					<input type="text" class="form-control" id="wksTypename" name="wksTypename" placeholder="请输入完整的类型名称">
			   					 
			   					 <label>标题内容</label>
			   					 <input type="text" class="form-control" id="wksTypetitle" name="wksTypetitle"  placeholder="简单的描述该工作站类型的特点">
			   					 
			   					 <label>描述内容</label>
			   					 <textarea class="form-control" style="resize:none;" id="wksTypedetails" name="wksTypedetails" placeholder="详细的介绍工作站类型特点及其功能"></textarea>
			              		</div>
			              		<div class="form-group pull-right">
			              		<input type="button" class="btn btn-info" id="submit" value="确认添加"/>
			              		</div>
			              		</form>
						  </div>
		       		</div>
		        </div>
		        </div>
	        </div>
            <!--我是主要内容 end-->
        </div>
    </div>
    <a href="#top" id="goTop"><i class="fa fa-angle-up fa-3x"></i></a>
</body>
</html>