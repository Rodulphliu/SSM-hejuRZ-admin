$(function(){
			$("#submit").click(function(){
					var ServicerModel = {};
					ServicerModel.serverName = $("#serverName").val();
					ServicerModel.serverType = $("#serverType").val();
					ServicerModel.siProcessor = $("#siProcessor option:selected").text();
					ServicerModel.cpuMixNumber = $("#cpuMixNumber").val();
					ServicerModel.sibrandName = $("#sibrandName option:selected").text();
					ServicerModel.siSize = $("#siSize").val();
					ServicerModel.sihardamount = $("#sihardamount").val();
					ServicerModel.sioperSystem = $("#sioperSystem option:selected").text();
					ServicerModel.siCPURAM = $("#siCPURAM").val();
					ServicerModel.productdesc = $("#productdesc").val();
					ServicerModel.siDetails = $("#siDetails").val();
					
					if( $("#serverName").val()!="" && $("#serverType").val()!="" && $("#siProcessor").val()!=""){
						$.ajax({
							url:"/servicer/addservicer.hjrz",
						    type:'post',
						    contentType:'application/json',
						    dataType:'json',
						    async:false,
						    data:JSON.stringify(ServicerModel),
						    success:function(data){
						    	if(data.callStatus == 'SUCCESS'){
						    			alert("success");
										$(location).attr('href', '/ServerType/queryServerTypeInit.hjrz');
						    	}
						    	else{l
						    			toastr.options = {
											"progressBar": true,
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									"positionClass": "toast-bottom-right",
										};
										Command: toastr["error"]("录入失败","失败")
						    	}
					   	 	},
							error:function(){
								toastr.options = {
										"progressBar": true,
										"positionClass": "toast-bottom-right",
									};
									Command: toastr["error"]("失败啦","1111")
									return false;
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