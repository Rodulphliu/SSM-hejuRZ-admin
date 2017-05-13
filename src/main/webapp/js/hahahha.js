$(function() {
	$("#checkajx").click(function(){
			var ServerType={"username":"a123456","password":"www12345"};
				$.ajax({
					url:"/ServerType/adserver.do",
					type:"post",
					contentType:'application/json',
					dataType:'json',
					data:ServerType,
					 success:function(){
					    	alert("sssss");
					    }
					})
		});
})