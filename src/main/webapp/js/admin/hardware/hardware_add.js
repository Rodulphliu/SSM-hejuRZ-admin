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
				var hardwareForm = {};
				hardwareForm.hardwareName = $("#hardwareName").val();
				hardwareForm.brandCode = $("#brandCode").val();
				hardwareForm.hardwareType = $("#hardwareType").val();
				hardwareForm.hardwareImgpath = $("#filename").val();
				hardwareForm.hardwareinfoDetail = $("#hardwareinfoDetail").val();
					$.ajax({
						url:"/HardWare/addHardwareInit.do",
					    type:'post',
					    contentType:'application/json',
					    dataType:'json',
					    data:JSON.stringify(hardwareForm),
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