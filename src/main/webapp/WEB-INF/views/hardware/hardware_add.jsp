<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>添加服务器类型</title>
		<%@include file="../common/share_static.jsp" %>
		<style type="text/css">
		.basic-grey {
		margin-left:auto;
		margin-right:auto;
		max-width: 500px;
		background: #F7F7F7;
		padding: 25px 15px 25px 10px;
		font: 12px Georgia, "Times New Roman", Times, serif;
		color: #888;
		text-shadow: 1px 1px 1px #FFF;
		border:1px solid #E4E4E4;
		}
		.basic-grey h1 {
		font-size: 25px;
		padding: 0px 0px 10px 40px;
		display: block;
		border-bottom:1px solid #E4E4E4;
		margin: -10px -15px 30px -10px;;
		color: #888;
		}
		.basic-grey h1>span {
		display: block;
		font-size: 11px;
		}
		.basic-grey label {
		display: block;
		margin: 0px;
		}
		.basic-grey label>span {
		float: left;
		width: 20%;
		text-align: right;
		padding-right: 10px;
		margin-top: 10px;
		color: #888;
		}
		.basic-grey input[type="text"], .basic-grey input[type="email"], .basic-grey textarea, .basic-grey select {
		border: 1px solid #DADADA;
		color: #888;
		height: 30px;
		margin-bottom: 16px;
		margin-right: 6px;
		margin-top: 2px;
		outline: 0 none;
		padding: 3px 3px 3px 5px;
		width: 70%;
		font-size: 12px;
		line-height:15px;
		box-shadow: inset 0px 1px 4px #ECECEC;
		-moz-box-shadow: inset 0px 1px 4px #ECECEC;
		-webkit-box-shadow: inset 0px 1px 4px #ECECEC;
		}
		.basic-grey textarea{
		padding: 5px 3px 3px 5px;
		}
		.basic-grey select {
		background: #FFF url('down-arrow.png') no-repeat right;
		background: #FFF url('down-arrow.png') no-repeat right);
		appearance:none;
		-webkit-appearance:none;
		-moz-appearance: none;
		text-indent: 0.01px;
		text-overflow: '';
		width: 70%;
		height: 35px;
		line-height: 25px;
		}
		.basic-grey textarea{
		height:100px;
		}
		.basic-grey .button {
		background: #4A71C0;
		border: none;
		color: #FFF;
		box-shadow: 1px 1px 5px #B6B6B6;
		border-radius: 3px;
		text-shadow: 1px 1px 1px #4B6FB7;
		cursor: pointer;
		}
		.basic-grey .button:hover {
		background: #143B89
		}
		</style>
		<script type="text/javascript" src="<%=contextPath %>/js/admin/common/hjrz.common.js"></script>
		<script type="text/javascript" src="<%=contextPath %>/js/jqueryupload/jquery.ui.widget.js"></script>
		<script type="text/javascript" src="<%=contextPath %>/js/jqueryupload/jquery.iframe-transport.js"></script>
		<script type="text/javascript" src="<%=contextPath %>/js/jqueryupload/jquery.fileupload.js"></script>
</head>
<body>
		<%@include file="../common/header.jsp"%>
		<div class="container-fluid all">
		 <%@include file="../common/leftnav.jsp" %>
		<div class="maincontent">
            <!--我是主要内容 start-->
	            <ul class="breadcrumb">
	                <li class="active">添加硬件类型</li>
	            </ul>
            <div class="col-xs-7 col-md-7" style="margin-left:20.0%;">
              	<!--style="margin-left:20.0%;"-->
              	<div class="component">  
              <form class="basic-grey">
				<h1>添加硬件
				<span>请在此表中填入硬件相关信息并点击添加</span>
				</h1>
				<label>
				<span>硬件名称:</span>
				<input id="hardwareName" type="text" placeholder="请输入硬件名称" />
				</label>
				
				<label>
				<span>品牌名称 :</span>
				<select id="brandCode">
				<c:forEach items="${brands}" var="b">
					<option value="${b.brandCode}">${b.brandName}</option>
				</c:forEach>
				</select>
				</label>
				
				
				<label>
				<span>硬件样例图:</span>
					<div id="image_box">
						 <input id="myfile" type="file" name="file" onchange="showPreview(this)" style="display:none"/>
						  	<img id="previewImg" src="<%=basePath %>/images/common/noimage.png" style="width:168px;height:128px;border-radius:10px;" onclick="F_Open_dialog()"/>
						<input type="hidden" id="filename" name="filename"/>
					</div>
				</label>
				
				<label>
				<span>硬件类型 :</span>
				<select id="hardwareType">
				<c:forEach items="${hardwaretypes}" var="hwt">
					<option value="${hwt.hardtypeCode}">${hwt.hardtypeName}</option>
				</c:forEach>
				</select>
				</label>
				
				<label>
					<span>硬件详细信息:</span>
					<textarea id="hardwareinfoDetail" placeholder="硬件相关数据信息" style="resize: none;"></textarea>
				</label>
				
				<label>
				<span>&nbsp;</span>
					<input id="submit" type="button" class="button" value="确认添加" />
				</label>
				</form>
              	</div>
              </div>
			</div>
		</div>
</body>
<script type="text/javascript" src="<%=contextPath %>/js/admin/hardware/hardware_add.js"></script>
</html>0