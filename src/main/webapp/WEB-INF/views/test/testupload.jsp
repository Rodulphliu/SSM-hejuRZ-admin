<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<%@ include file="../common/share_static.jsp" %>
		<script type="text/javascript" src="<%=contextPath %>/js/jqueryupload/jquery.ui.widget.js"></script>
		<script type="text/javascript" src="<%=contextPath %>/js/jqueryupload/jquery.iframe-transport.js"></script>
		<script type="text/javascript" src="<%=contextPath %>/js/jqueryupload/jquery.fileupload.js"></script>
	</head>
<body>
		<h2>ajax upload</h2>
		
		<div id="image_box">
					<input id="myfile"  name="file" type="file" onchange="showPreview(this)" style="display:none"/>
					<img id="previewImg" src="img/hu.jpg" style="width:200px; height:200px;" onclick="F_Open_dialog()"/>
		</div>
					<button type="button" id="upload">Upload</button>
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
			
			$(function (){
				 var boxDom = $('#image_box');
				 var fileDom = boxDom.find('input[type=file]');
				 	fileDom.fileupload({
			    	url: '/toupload/ajax/uploadFile.do',
			        dataType: 'json',
				        add: function (e, data) {
				            data.context = $('#upload').text('Upload')
				                .appendTo(document.body)
				                .click(function () {
				                    data.context = $('<p/>').text('Uploading...').replaceAll($(this));
				                    data.submit();
				                });
				        },
				        done: function (e, data) {
				            data.context.text('Upload finished.');
				        }
			    	});
			});
	</script>
</body>
</html>