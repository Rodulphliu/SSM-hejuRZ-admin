$(function(){
			$("#submit").click(function(){
					var WorkStationModel = {};
					WorkStationModel.worksName = $("#worksName").val();
					WorkStationModel.worksType = $("#worksType").val();
					WorkStationModel.wsProcessor = $("#wsProcessor option:selected").text();
					WorkStationModel.cpuMixNumber = $("#cpuMixNumber").val();
					WorkStationModel.sibrandName = $("#sibrandName option:selected").text();
					WorkStationModel.siSize = $("#siSize").val();
					WorkStationModel.sihardamount = $("#sihardamout").val();
					WorkStationModel.sioperSystem = $("#sioperSystem option:selected").text();
					WorkStationModel.siCPURAM = $("#siCPURAM").val();
					WorkStationModel.productdesc = $("#productdesc").val();
					WorkStationModel.siDetails = $("#siDetails").val();
					
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