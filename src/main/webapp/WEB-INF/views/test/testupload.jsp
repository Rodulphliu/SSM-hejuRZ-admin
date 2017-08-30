<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<%@ include file="../common/common.jsp" %>
 	<script type="text/javascript" src="<%=contextPath %>/js/jquery/jquery-3.1.1.min.js"></script>
</head>
<body>
		<h2>ajax upload</h2>
			<form id="uploadForm">
				<input type="file" name="uploadFileId" onchange="showPreview(this)">
				<img id="previewImg" style="width: 200px;height: 200px;"/>
				<input type="button" id="upload" value="上传" onclick="ajaxFileUpload()">
				<span class="tofileupload">..</span>
			</form>
	<script>
			$("#myfile").change(function(){
		        var file = this.files[0];
		        var reader = new FileReader();
		        reader.readAsDataURL(file);
		        reader.onload = function(e){
		            $("#previewImg").attr("src", e.target.result);
		        };
		    });
			
		function ajaxFileUpload(){
			var formData = new FormData($("#uploadForm")[0]);  
		     $.ajax({
		          url: '/toupload/ajax/uploadFile.do' ,  
		          type: 'POST',  
		          data: formData,
		          async: false,  
		          cache: false,
		          contentType: false,  
		          processData: false,  
		          success: function (data) {
		        	  if(data.callStatus == "SUCCESS"){
		        		  alert(data.message);  
		        	  }
		         	 }
		     	});  
		     }
	</script>
</body>
</html>