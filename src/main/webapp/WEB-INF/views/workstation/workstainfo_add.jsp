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
		<%@include file="../common/header.jsp"%>
		<div class="container-fluid all">
		 <%@include file="../common/leftnav.jsp" %>
		<div class="maincontent">
            <!--我是主要内容 start-->
	            <ul class="breadcrumb">
	                <li class="active">添加服务器类型</li>
	            </ul>
	     <div class="row" id="form-datepicker">
            
            <div class="col-xs-7 col-md-7" style="margin-left:20.0%;">
              	<!--style="margin-left:20.0%;"-->
              	<div class="component">
              		<!-- 内容start -->
       					<div style="margin-bottom:30px;">
								<button type="button" class="btn btn-success" onclick="window.location.href='<%=basePath %>worksatation/queryServerInit.do'">
								<span class="glyphicon glyphicon-menu-left"></span>&nbsp;返回&nbsp;
								</button>
		              	</div>
		              	<form>
              				<div class="form-horizontal">
								  <div class="form-group">
								    <label class="col-sm-2 control-label">工作站名称</label>
								    <div class="col-sm-7">
								      <input type="text" class="form-control" placeholder="请输入工作站的名称" id="worksName">
								    </div>
								  </div>
								  
								<div class="form-group">
									<label class="col-sm-2 control-label">工作站类型</label>
									<div class="col-sm-7">
								 	<select class="selectpicker form-control" data-live-search="true"  data-size="5" id="worksType">
								 		<option value="" disabled selected="selected">请选择工作站类型</option>
								 		<c:forEach items="${workstatypes}" var="w">
										  <option value="${w.wksTypecode}">${w.wksTypename}</option>
									  	</c:forEach>
									</select>
									</div>
								</div>
								 
								  <div class="form-group">
									<label class="col-sm-2 control-label">处理器</label>
									<div class="col-sm-7">
								 	<select class="selectpicker form-control" data-live-search="true"  data-size="5" id="wsProcessor">
								 	  <option value="" disabled selected="selected">请选择处理器型号</option>
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
								    <label class="col-sm-2 control-label">最大CPU数量</label>
								    <div class="col-sm-7">
								      <input type="text" class="form-control" placeholder="如“2颗”,“4颗”,“8颗”" id="cpuMixNumber">
								    </div>
								  </div>
								   <div class="form-group">
								    <label class="col-sm-2 control-label">工作站品牌</label>
								    <div class="col-sm-7">
								      <select class="selectpicker form-control" data-live-search="true" data-size="5" id="sibrandName">
								 	  <option value="" disabled selected="selected">请选择品牌</option>
									  <option>戴尔（DELL）</option>
									  <option>联想（Lenovo）</option>
									  <option>惠普（HP）</option>
									  <option>浪潮（INSPUR）</option>
									  <option>联想（ThinkServer）</option>
									  <option>联想（ThinkStation）</option>
									  <option>希捷（SEAGATE）</option>
									  <option>华为（HUAWEI）</option>
									</select>
								    </div>
								  </div>
								   <div class="form-group">
								    <label class="col-sm-2 control-label">尺寸规格</label>
								    <div class="col-sm-7">
								      <input type="text" class="form-control" placeholder="如1U、2U、3U、4U" id="siSize">
								    </div>
								  </div>
								  
								  <div class="form-group">
								    <label class="col-sm-2 control-label">硬盘容量</label>
								    <div class="col-sm-7">
								      <input type="text" class="form-control" placeholder="如“1T-2T”，“8T以上”" id="sihardamount">
								    </div>
								  </div>
								  
								  <div class="form-group">
								    <label class="col-sm-2 control-label">操作系统</label>
								    <div class="col-sm-7">
								      <select class="selectpicker form-control" data-live-search="true" data-size="5" id="sioperSystem">
								 	  <option value="" disabled selected="selected">请选择服务器操作系统</option>
									  <option>Microsoft Windows10</option>
									  <option>Microsoft Windows7</option>
									  <option>Liunx Ubuntu</option>
									  <option>Linux CentOS</option>
									  <option>WINNT 4.0</option>
									  <option>Netware</option>
									</select>
								    </div>
								  </div>
								  
								  <div class="form-group">
								    <label class="col-sm-2 control-label">内存容量</label>
								    <div class="col-sm-7">
								      <input type="text" class="form-control" placeholder="如“8GB”、“16GB”、“32GB”" id="siCPURAM">
								    </div>
								  </div>
								  
								  <div class="form-group">
								    <label class="col-sm-2 control-label">产品特性简述</label>
								    <div class="col-sm-7">
								      <input type="text" class="form-control" placeholder="简单的描述产品的特点和功能" id="productdesc">
								    </div>
								  </div>
							
								  <div class="form-group">
								    <label class="col-sm-2 control-label">详细描述</label>
								    <div class="col-sm-7">
								    <textarea class="form-control" rows="3" style="resize:none" placeholder="详细的描述产品的特点和功能" id="siDetails"></textarea>
								    </div>
								  </div>
								  
								  <div class="form-group">
								    <div class="col-sm-offset-2 col-sm-10">
								      <button type="submit" id="submit" class="btn btn-default">确定添加</button>
								    </div>
								  </div>
							</div>
              				</form>	
              		<!-- 内容end -->
              	</div>
              </div>
             </div>	
			</div>
		</div>
</body>
<script src="<%=contextPath %>/js/admin/workstation/add_workstations.js"></script>
</html>