<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="sidebar">
            <ul class="nav">
                <li id="index"><a href="/common/home/index.do"><i class="fa fa-home fa-fw" aria-hidden="true"></i>首页</a></li>
		<li><a href="#"><i class="fa fa-folder-open fa-fw" aria-hidden="true"></i>资源管理</a></li>
		<li><a href="#"><i class="fa fa-building fa-fw" aria-hidden="true"></i>前台管理</a></li>
		<li><a href="/brands/brand.do"><i class="fa fa-shopping-bag fa-fw" aria-hidden="true"></i>品牌管理</a></li>
		<li class="has-sub">
			<a href="/ServerType/queryServerTypeInit.do"><i class="fa fa-server fa-fw" aria-hidden="true"></i>服务器管理
			<i id="menuicon" class="fa fa-angle-down fa-fw pull-right"></i></a>
			<ul class="sub-menu" style="display:none;">
				<li><a href="#"><i class="fa fa-circle-o fa-fw"></i>&nbsp;服务器管理</a></li>
				<li><a href="/ServerType/queryServerTypeInit.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;服务器类型管理</a></li>
				<li><a href="/servicer/queryServerInit.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;服务器属性管理</a></li>
			</ul>
		</li>
		 <li class="has-sub">
			<a href="/WorkstationType/queryAll.do"><i class="fa fa-television fa-fw" aria-hidden="true"></i>工作站管理
			<i id="menuicon" class="fa fa-angle-down fa-fw pull-right"></i></a>
			<ul class="sub-menu" style="display:none;">
				<li><a href="/worksatation/queryworkstation.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;工作站管理</a></li>
				<li><a href="/WorkstationType/queryAll.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;工作站类型管理</a></li>
				<li><a href="#"><i class="fa fa-circle-o fa-fw"></i>&nbsp;工作站属性管理</a></li>
			</ul>
		</li>
		<li class="has-sub">
			<a href="/HardwareType/hardwaretype.do"><i class="fa fa-microchip fa-fw" aria-hidden="true"></i>硬件库管理
			<i id="menuicon" class="fa fa-angle-down fa-fw pull-right"></i></a>
			<ul class="sub-menu" style="display:none;">
				<li><a href="/HardwareType/queryworkstation.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;硬件库管理</a></li>
				<li><a href="/HardwareType/hardwaretype.do"><i class="fa fa-circle-o fa-fw"></i>&nbsp;硬件类型管理</a></li>
				<li><a href="#"><i class="fa fa-circle-o fa-fw"></i>&nbsp;硬件属性管理</a></li>
			</ul>
		</li>
			<li><a href="/users/userlist.do"><i class="fa fa-users fa-fw" aria-hidden="true"></i>用户管理</a></li>
			<li><a href="#"><i class="fa fa-envelope-o fa-fw" aria-hidden="true"></i>反馈处理</a></li>
          </ul>
       			 </div>
<!-- leftNav end -->