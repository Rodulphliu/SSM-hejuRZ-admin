<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<%@ include file="../common/share_static.jsp" %>
 	<script type="text/javascript" src="<%=contextPath %>/js/jquery/jquery-3.1.1.min.js"></script>
 	<script type="text/javascript" src="<%=contextPath %>/js/jquery.fileupload/jquery.fileupload.js"></script>
 	<script type="text/javascript" src="<%=contextPath %>/js/jquery.fileupload/jquery.fileupload-ui.js"></script>
 	<script type="text/javascript" src="<%=contextPath %>/js/jquery.fileupload/jquery.iframe-transport.js"></script>
 	<script type="text/javascript" src="<%=contextPath %>/js/admin/common/hjrz.common.js"></script>
</head>
<body>
		<h2>ajax upload</h2>
			<div class="brand_file_box">
				<label class="w_filebox">
					<input id="myfile"  name="uploadFileId" type="file" onchange="showPreview(this)" style="display:none"/>
					<img id="previewImg" src="img/hu.jpg" style="width:200px; height:200px;" onclick="F_Open_dialog()"/>
				</label>
			
					<input type="button" id="upload" value="上传" onclick="ajaxFileUpload()"/>
					<br/>
					<img src="/upload/YlZBNW5QZGRrV2wrU0w0eithaXNxVE1xNHdZWG0rRTd3T29wbzZlb2NxZkJQNUNkamc2UE9BPT020170906152606667.jpg" style="width:200px; height:200px;">
			</div>
	<script>
			$("#myfile").change(function(){
		        var file = this.files[0];
		        var reader = new FileReader();
		        reader.readAsDataURL(file);
		        reader.onload = function(e){
		            $("#previewImg").attr("src", e.target.result);
		        };
		 });
 
			function F_Open_dialog() 
			{ 
			   $("#myfile").click(); 
			} 
			
			function ajaxFileUpload(){
				Common.imageUpload(".brand_file_box");
		     }
	</script>
</body>
</html>