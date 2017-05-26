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
		<form>
			<!-- <input type="text" id="columnTitle"/>
			<input type="text" id="columnContent"/>
			<input type="text" id="belongColumn"/> -->
			<input type="button" class="yes" value="确认">
		</form>
	</div>
<script>
	$(".yes").click(function(){
			 $.ajax({
				url:"/HomeColumn/add.do",
				type:'POST',
				dataType:'json',
				data:{
					"columnTitle":"1111",
					"columnContent":"asdasd",
					"belongColumn":"3333dasdad"
				},
				success:function(data){
					if(data.callStatus == 'SUCCESS'){
						alert("成功");
					}
					else{
						alert("失败");
						return false;
					}
				},
				error:function(){
					alert("发生错误");
				}
			 });
		});
</script>
</body>
</html>