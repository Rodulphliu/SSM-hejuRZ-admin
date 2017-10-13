<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>核聚瑞增后台管理系统</title>
<%@include file="../common/share_static.jsp" %>
</head>

<body>
<!--外围容器 -->
	 	<%@include file="../common/header.jsp"%>
	 	<div class="container-fluid all">
			<%@include file="../common/leftnav.jsp"%>
		<!--正文开始-->
			<div class="maincontent row">
	      			 <!--我是主要内容 start-->
            <ul class="breadcrumb">
                <li class="active">首页</li>
            </ul>
          <div class="col-sm-12">
                <div class="panel panel-success">
				  <div class="panel-heading">
				    <h3 class="panel-title">后台整体情况</h3>
				  </div>
				  <div class="panel-body">
				  	<div style="text-align: center;">
				   		<div class="col-lg-3">
				   			<p>&nbsp;&nbsp;后台消息 >></p>
				   			<h1>28</h1>
				   		</div>
				   		<div class="col-lg-3">
				   			<p>&nbsp;&nbsp;新增用户 >></p>
				   			<h1>4</h1>
				   		</div>
				   		<div class="col-lg-3">
				   			<p>&nbsp;&nbsp;用户反馈 >></p>
				   			<h1>10</h1>
				   		</div>
				   		<div class="col-lg-3">
				   			<p>&nbsp;&nbsp;总用户 >></p>
				   			<h1>32</h1>
				   		</div>
				    </div>
				  </div>
				</div>
				<div class="panel panel-default">
                    <div class="panel-heading">
                       	 最新公告<span class="badge" style="float: right; background-color:#888888">2017.6.24</span>
                    </div>
                    <div class="panel-body">
                        <p>嵌套响应式iframe</p>
                    </div>
                </div>
                <ul class="list-group">
                    <li class="list-group-item list-group-item-info">
                       	 更新日志
                    </li>
                    <li class="list-group-item">
                        <span class="badge">UI库&nbsp;2017.5.4</span>
                        <a href="ui.html?#ui-tabdrop">加入bootstrap-tab超出自动折叠插件</a>
                    </li>
                    <li class="list-group-item">
                        <span class="badge">Carousel库&nbsp;2017.9.10</span>
                        <a href="carousel.html?#carousel-fotorama">加入jquery-fotorama图片滚动库</a>
                    </li>
                    <li class="list-group-item">
                        <span class="badge">Carousel库&nbsp;2017.9.10</span>
                        <a href="carousel.html?#carousel-owlcarousel2">加入jquery-owlcarousel2图片滚动库</a>
                    </li>
                    <li class="list-group-item">
                        <span class="badge">Carousel库&nbsp;2017.9.10</span>
                        <a href="carousel.html?#carousel-owlcarousel">加入jquery-owlcarousel图片滚动库</a>
                    </li>
                    <li class="list-group-item">
                        <span class="badge">Carousel库&nbsp;2017.9.10</span>
                        <a href="carousel.html?#carousel-fullpage">加入jquery-fullpage图片滚动库</a>
                    </li>
                    <li class="list-group-item">
                        <span class="badge">UI库&nbsp;2017.9.10</span>
                        <a href="ui.html?#ui-mmenu">加入jquery-mmenu Demo</a>
                    </li>
                    <li class="list-group-item">
                        <span class="badge">Chart库&nbsp;2017.9.10</span>
                        <a href="chart.html?chart-flot">加入jquery-flot库</a>
                    </li>
                </ul>
            </div>
            <!--我是主要内容 end-->
	 </div>
	 </div>
	 <a href="#top" id="goTop"><i class="fa fa-angle-up fa-3x"></i></a>
<!-- 容器结束 -->
		<script>
		$(document).ready(function(){
			$('#index').attr('class', 'active')
		});
		</script>
</body>
</html>