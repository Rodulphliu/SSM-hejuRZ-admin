<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 头部开始 -->
<nav class="navbar navbar-default navbar-fixed-top adminnavbar">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle show pull-left" data-target="sidebar">
                    <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
                </button>
                <a  href="index.html">
                <img src="<%=request.getContextPath() %>/images/common/hejurz-background system logo.png" style="height:35px;width:220px;margin-top:8px"/>
                </a>
            </div>
             <div id="navbar" class="collapse navbar-collapse">
             		<ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                           aria-expanded="false"><i class="fa fa-user fa-fw"></i>&nbsp;小王&nbsp;<span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="top-right1.html">top-right1.html</a></li>
                            <li class="divider"></li>
                            <li><a href="top-right2.html">top-right2.html</a></li>
                            <li class="divider"></li>
                            <li><a href="top-right3.html"><i class="fa fa-sign-out fa-fw"></i>&nbsp;top-right3.html</a></li>
                        </ul>
                    </li>
                </ul>
             </div>
        </div>
</nav>
<!-- 头部结束 -->