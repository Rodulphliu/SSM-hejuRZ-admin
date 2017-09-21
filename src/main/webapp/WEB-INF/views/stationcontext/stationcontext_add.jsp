<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加服务器类型</title>
<%@include file="../common/share_static.jsp"%>
<link rel="stylesheet" type="text/css"
	href="<%=contextPath%>/css/bootstrap.select/bootstrap-select.min.css" />
<script type="text/javascript"
	src="<%=contextPath%>/js/bootstrap.select/bootstrap-select.min.js"></script>
</head>
<body>
	<%@include file="../common/header.jsp"%>
	<div class="container-fluid all">
		<%@include file="../common/leftnav.jsp"%>
		<div class="maincontent">
			<!--我是主要内容 start-->
			<ul class="breadcrumb">
				<li class="active">添加站内内容</li>
			</ul>
			<div class="row" id="form-datepicker">

				<div class="col-xs-7 col-md-7" style="margin-left: 20.0%;">
					<!--style="margin-left:20.0%;"-->
					<div class="component">
						<!-- 内容start -->
						<div class="panel panel-default">
							<div class="panel-body">
								<form class="form-horizontal" role="form">
									<fieldset>
										<legend>内容</legend>
										<div class="form-group">
											<label class="col-sm-2 control-label" for="ds_host">内容标题</label>
											<div class="col-sm-4">
												<input class="form-control" id="ds_host" type="text"
													placeholder="内容标题" />
											</div>
											<label class="col-sm-2 control-label" for="ds_name">主要内容</label>
											<div class="col-sm-4">
												<select class="selectpicker form-control"
													data-live-search="true" data-size="5" id="siProcessor">
													<option value="" disabled selected="selected">请选择目标位置</option>
													<option>Intel Xeon(至强) E3</option>
													<option>Intel Xeon(至强) E5</option>
													<option>Intel Xeon(至强) E7</option>
													<option>Intel Core(酷睿) I3</option>
													<option>Intel Core(酷睿) I5</option>
													<option>Intel Core(酷睿) E7</option>
												</select>
											</div>
										</div>

										<div class="form-group">
											<label class="col-sm-2 control-label" for="ds_username">主要内容</label>
											<div class="col-sm-4">
												<textarea class="form-control" rows="3" style="resize: none"></textarea>
											</div>
											<label class="col-sm-2 control-label" for="ds_password">超链接地址</label>
											<div class="col-sm-4">
												<input class="form-control" id="ds_password" type="password"
													placeholder="123456" />
											</div>
										</div>
									</fieldset>
									<fieldset>
										<legend>相关图片</legend>
										<div class="form-group">
											<label for="disabledSelect" class="col-sm-2 control-label">相关图片</label>
											<div class="col-sm-10">
												<img src="/images/common/noimage.png"
													style="height: 170px; width: 270px">
											</div>
										</div>
									</fieldset>

									<fieldset>
										<legend>字段名</legend>
										<div class="form-group">
											<div class="col-sm-10">
												<button type="submit" class="btn btn-default col-sm-3">Sign
													in</button>
											</div>
										</div>
									</fieldset>
								</form>
							</div>
						</div>
						<!-- 内容end -->
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>