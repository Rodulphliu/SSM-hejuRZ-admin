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
				var Hardwaretype = {};
				Hardwaretype.hardtypeName = $("#hardWareTypeName").val();
				Hardwaretype.hardtypeImgPath = $("#filename").val();
				Hardwaretype.hardtypeIntroduction = $("#brandIntroduction").val();
					$.ajax({
						url:"/HardwareType/hardwareaddinit.do",
					    type:'post',
					    contentType:'application/json',
					    dataType:'json',
					    data:JSON.stringify(Hardwaretype),
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