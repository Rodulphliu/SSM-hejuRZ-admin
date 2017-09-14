			
	        $("#myfile").change(function(){
	                var file = this.files[0];
	                var reader = new FileReader();
	                reader.readAsDataURL(file);
	                reader.onload = function(e){
	                    $("#previewImg").attr("src", e.target.result);
	                };
	         });
	         
	        function F_Open_dialog() 
		    { 
		       $("#myfile").click(); 
		    }
	        	
	        Common.imageAutoUpload("#image_box");
	        
	        $(function(){
	        	$("#submit").click(function(){
				var Brand = {};
				Brand.brandName = $("#brandName").val();
				Brand.brandImgPath = $("#filename").val();
				Brand.brandIntroduction = $("#brandIntroduction").val();
					$.ajax({
						url:"/brands/addbrandinfo.do",
					    type:'post',
					    contentType:'application/json',
					    dataType:'json',
					    data:JSON.stringify(Brand),
					    success:function(data){
					    	if(data.callStatus == 'SUCCESS'){
					    			alert("success");
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
							alert("ERROR");
						}
					})
	        	});
	        })