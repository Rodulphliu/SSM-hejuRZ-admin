var admin_login = (function () {
    var index = {
        // 登录函数
        login:function(){
            var self = this;
            // 按钮正在登录
            $("#login").val('正在登录');
            var user_name = $.trim($("#username").val());
            var user_pass = $.trim($("#upassword").val());
            var ajax_data = {
            		admname:user_name,
            		admpassword:user_pass
            }
            $.ajax({
                url: '/login/logininit.do',
                type: 'post',
                dataType: 'json',
                contentType:"application/json",
                data: JSON.stringify(ajax_data),
                success:function(data){
                    if(data.callStatus == "SUCCESS"){
                        $("#login").html('<button class="btn btn-default">登录成功...</button>');
                        window.location.href='/common/home/index.do';      
                    }else{
                        $("#login").html('登 录');
                        alert("NOnono");
                    }
                },
                error:function(){
            		alert("ERROR");
            	}
            });
        },

    }
    return index;
})();

$(function(){
	$("#submit").click(function(){
		if($("#username").val()!=null && $("#upassword").val()!=null){
			admin_login.login();
		}
	});
});
			