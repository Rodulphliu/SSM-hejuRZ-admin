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