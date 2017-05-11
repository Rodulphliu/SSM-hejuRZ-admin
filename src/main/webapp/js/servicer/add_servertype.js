$(function(){	
	$("#tosubmit").click(function(){
		var ServerType={};
		toastr.options = {
				"progressBar": true,
				"positionClass": "toast-bottom-right",
			};
		ServerType.typeName = $("#typeName").val();
		ServerType.typeTitle = $("#typeTitle").val();
		ServerType.typeDetails = $("#typeDetails").val();
		if($("#typeName").val()!="" && $("#typeTitle").val()!="" && $("#typeDetails").val()!=""){
			$.ajax({
				url:"/ServerType/add.do",
				type:"post",
				contentType:'application/json',
				dataType:'json',
				data:JSON.stringify(ServerType),
				 success:function(data){
				    	if(data.callStatus == 'SUCCESS'){
				    		Command: toastr["success"]("添加服务器类型成功");
				    		window.location.href="/common/home/index.do";
				    	}
				    	else{
				    		Command: toastr["error"]("添加失败，请检查表单后重试");
				    		return false;
				    	}
				    }
				})
			}
		else{
			Command: toastr["info"]("请输入完整的表单");
			return false;
		}
	});
});