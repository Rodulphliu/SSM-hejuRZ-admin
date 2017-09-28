<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<%@include file="../common/share_static.jsp" %>
		
<script type="text/javascript">
	$(function(){
		
		$("#delete").click(function(){
			var wksTypecode = $("#wksTypecode").val();
			if(window.confirm("确定要删除该工作站类型吗？")){
				$.ajax({
					url:"../WorkstationType/deleteByCode.do",
					data:JSON.stringify(wksTypecode),
					contentType:"application/json",
					dataType:"json",
					type:"post",
					success:function(data){
						if(data.callStatus == "SUCCESS"){
							/* toastr.options = {  
							        progressBar: true,  
							        positionClass: "toast-top-center", 
							        timeOut: "1500"  
							    }
							toastr.success("删除成功！","提示"); */
							alert("删除成功！")
							$(location).attr('href', '/WorkstationType/queryAll.do');
							
						}else{
							 toastr.options = {  
								        progressBar: true,  
								        positionClass: "toast-top-center", 
								        timeOut: "1500"  
								    }; 
							 Command:toastr["error"]("删除失败！","错误");
							 return false;
						}
					}
				});
			}
		});
		
	})

</script>
		
		
</head>
<body>
		<%@include file="../common/header.jsp"%>
		<!-- leftNav before-->
		<div class="container-fluid all">
       <%@include file="../common/leftnav.jsp"%>
       	<!-- leftNav end -->
       	 <div class="maincontent">
       	 <!--我是主要内容 start-->
       	 	<ul class="breadcrumb">
	             <li>工作站类型管理</li>
	             <li class="active">工作站类型信息</li>
	        </ul>
	        <div class="row" id="form-datepicker">
	        	<div class="col-xs-5 col-md-5" style="margin-left:20.0%;">
	        		<div class="component">
	        			<div class="panel panel-default">
							  <div class="panel-body">
							    <h4><b>工作站类型名称：</b></h4>
							    <p>${workstatype.wksTypename}</p>
							    <i style="font-size:12px;color:#808080">创建时间：${workstatype.createTime}</i>
							  </div>
							</div>
              				<div class="panel panel-default">
								<div class="panel-body">
								 <h4><b>工作站类型简介：</b></h4>
							    <p>${workstatype.wksTypetitle}</p>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-body">
								<h4><b>工作站类型描述：</b></h4>
							    <p>${workstatype.wksTypedetails}</p>
								</div>
							</div>
							<div class="panel panel-default">
								  <div class="panel-body">
								  	 <a href="/ServerType/ServerTypeModify.do?id=${workstatype.wksTypecode}" class="button button-primary"><b>编辑</b></a>
								  	 <input type="hidden" value="${workstatype.wksTypecode }" id="wksTypecode"/>
								  	 <a  class="button button-caution " id="delete"><b>删除</b></a>
								  	 <a href="<%=contextPath %>/WorkstationType/queryAll.do" class="button " id="back"><b>返回</b></a>
								  </div>
							</div>
	        		
	        		</div>
	        	</div>
	        </div>
       	</div>
      </div>
</body>
</html>