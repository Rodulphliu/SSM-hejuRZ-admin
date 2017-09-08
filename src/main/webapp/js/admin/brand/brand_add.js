			function Form_reset()
       		{
       			$("#brandName").val("");
       			$("#previewImg").attr("src","image/noimage.png");
       		}
       	
			$("#brandlogo").change(function(){
	                var file = this.files[0];
	                var reader = new FileReader();
	                reader.readAsDataURL(file);
	                reader.onload = function(e){
	                    $("#previewImg").attr("src", e.target.result);
	                };
	         });
	         
	        function F_Open_dialog() 
		    { 
		       $("#brandlogo").click(); 
		    } 
	        
	        $("#submit").click(function(){
	        		var Brand = {};
	        		Brand.brandName = $("#brandName").val();
	        		Brand.brandIntroduction = $(".note-editable").html();
	        		Brand.brandlogo = $("#brandlogo").val();
	        			$.ajax({
							 url:"/brands/add.do",
						    type:'post',
						    contentType:"application/json;charset=UTF-8",
						    dataType:'json',
						    data:JSON.stringify(Brand),
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
								alert("error");
							}
						});
	        });