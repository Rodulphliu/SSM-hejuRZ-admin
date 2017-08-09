$(function(){
			$("#submit").click(function(){
					var ServerType = {};
					ServerType.typeName = $("#typeName").val();
					ServerType.typeTitle = $("#typeTitle").val();
					ServerType.typeDetails = $("#typeDetails").val();
					if( $("#typeName").val()!="" && $("#typeTitle").val()!="" && $("#typeDetails").val()!=""){
						$.ajax({
							 url:"/ServerType/addservertype.do",
						    type:'post',
						    contentType:'application/json',
						    dataType:'json',
						    data:JSON.stringify(ServerType),
						    success:function(data){
						    	if(data.callStatus == 'SUCCESS'){
						    			alert("success");
										$(location).attr('href', '/ServerType/queryServerTypeInit.do');
						    	}
						    	else{
						    			toastr.options = {
											"progressBar": true,
											"positionClass": "toast-bottom-right",
										};
										Command: toastr["error"]("录入失败","失败")
										return false;
						    	}
					   	 	},
							error:function(){
								
							}
						})
					}
					else{
						toastr.options = {
								"progressBar":true,
								"preventDuplicates":true,
								"positionClass": "toast-bottom-right",
						};
						Command: toastr["warning"]("请输入完整的表单","提示")
						return false;
					}
			});
})