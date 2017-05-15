$(document).ready(function() {
	toastr.options = {
			"progressBar": true,
			"positionClass": "toast-bottom-right",
		};
	
	//当添加完成返回页面时
	if("${exchangeData.callStatus}" == 'SUCCESS')
	{
		Command: toastr["success"]("添加服务器类型成功");
	}
	if("${exchangeData.callStatus}" == 'FAIL')
	{
		Command: toastr["error"]("添加失败，请联系管理员");
	}
	
	
	//绑定表单验证
	 $("#subform").click(function(){
		 if($("#typeName").val()=="" || $("#typeTitle").val()=="" || $("#typeDetails").val()==""){
			 Command: toastr["info"]("请输入完整的表单");
			 return false;
		 }
	 })
})