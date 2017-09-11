<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="sidebar">
            <ul class="nav">
                <li id="index"><a href="index.html">首页</a></li>
		<li><a href="#">资源管理</a></li>
		<li><a href="#">前台管理</a></li>
		<li><a href="/brands/brand.do">品牌管理</a></li>
		<li class="has-sub">
			<a href="/ServerType/queryServerTypeInit.do"><span>服务器管理</span>
			<i class="fa fa-caret-right fa-fw pull-right"></i></a>
			<ul class="sub-menu" style="display:none;">
				<li><a href="#"><i class="fa fa-circle-o fa-fw"></i>&nbsp;服务器管理</a></li>
				<li><a href="/ServerType/queryServerTypeInit.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;服务器类型管理</a></li>
				<li><a href="/servicer/queryServerInit.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;服务器属性管理</a></li>
			</ul>
		</li>
		 <li class="has-sub">
			<a href="/WorkstationType/queryAll.do"><span>工作站管理</span>
			<i class="fa fa-caret-right fa-fw pull-right"></i></a>
			<ul class="sub-menu" style="display:none;">
				<li><a href="/worksatation/queryworkstation.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;工作站管理</a></li>
				<li><a href="/WorkstationType/queryAll.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;工作站类型管理</a></li>
				<li><a href="#"><i class="fa fa-circle-o fa-fw"></i>&nbsp;工作站属性管理</a></li>
			</ul>
		</li>
			<li><a href="#">硬件库管理</a></li>
			<li><a href="#">后台管理</a></li>
			<li><a href="#">用户管理</a></li>
			<li><a href="#">反馈处理</a></li>
          </ul>
       			 </div>
<!-- leftNav end -->