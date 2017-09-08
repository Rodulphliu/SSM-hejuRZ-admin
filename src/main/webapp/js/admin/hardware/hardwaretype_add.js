			function Form_reset()
       		{
       			$("#brandName").val("");
       			$("#previewImg").attr("src","image/noimage.png");
       		}
			
			$("#hardWareImage").change(function(){
                var file = this.files[0];
                var reader = new FileReader();
                reader.readAsDataURL(file);
                reader.onload = function(e){
                    $("#previewImg").attr("src", e.target.result);
                };
         });
			
			 function F_Open_dialog() 
			{ 
			       $("#hardWareImage").click(); 
			} 
			 
			 
			 $("#submit").click(function(){
	        		var Hardwaretype = {};
	        		Hardwaretype.hardtypeName = $("#brandName").val();
	        		Hardwaretype.hardtypeIntroduction = $(".note-editable").html();
	        			$.ajax({
							 url:"/HardwareType/addinit.do",
						    type:'post',
						    contentType:"application/json;charset=UTF-8",
						    dataType:'json',
						    data:JSON.stringify(Hardwaretype),
						    success:function(data){
						    	if(data.callStatus == 'SUCCESS'){
						    			alert("success");
//										$(location).attr('href', '/ServerType/queryServerTypeInit.do');
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
								alert("error");
							}
						});
	        });