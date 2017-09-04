$(function(){
			$("#submit").click(function(){
					var WorkStationModel = {};
					WorkStationModel.worksName = $("#worksName").val();
					WorkStationModel.worksType = $("#worksType").val();
					WorkStationModel.wsProcessor = $("#wsProcessor option:selected").text();
					WorkStationModel.cpuMixNumber = $("#cpuMixNumber").val();
					WorkStationModel.wsbrandName = $("#wsbrandName option:selected").text();
					WorkStationModel.wsSize = $("#wsSize").val();
					WorkStationModel.wshardamout = $("#wshardamout").val();
					WorkStationModel.wsoperSystem = $("#wsoperSystem option:selected").text();
					WorkStationModel.wsCPURAM = $("#wsCPURAM").val();
					WorkStationModel.productdesc = $("#productdesc").val();
					WorkStationModel.wsDetails = $("#wsDetails").val();
					
					if( $("#worksName").val()!="" && $("#worksType").val()!="" && $("#wsProcessor").val()!=""){
						$.ajax({
							url:"/worksatation/addWorkStationinfo.do",
						    type:'post',
						    contentType:'application/json',
						    dataType:'json',
						    async:false,
						    data:JSON.stringify(WorkStationModel),
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