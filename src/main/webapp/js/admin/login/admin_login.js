var admin_login = (function () {
    var index = {
        // 登录函数
        login:function(){
            var self = this;
            // 按钮正在登录
            $("#login").html('正在登录..');
            var admname = $.trim($("#username").val());
            var admpassword = $.trim($("#upassword").val());
            var loginForm = {
            		admname:admname,
            		admpassword:admpassword
            };
            $.ajax({
                url: '/logininit.hjrz',
                type:'post',
			    contentType:'application/json',
			    dataType:'json',
			    async:false,
                data: JSON.stringify(loginForm),
                success:function(data){
                    if(data.callStatus == "SUCCESS"){
                        $("#login").html('登录成功');
                        self.loginSuccess(data);
                    }else{
                        $("#login").html('登 录');
                        alert(data.message);
                    }
                },
                error:function(){
                	alert("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }
            });
        },
        // 登录成功
        loginSuccess:function(data){
        	window.location.href='/common/home/index.hjrz';      
        },
        // 初始化页面的函数
        initPage:function(){
            var self = this;
            //绑定表单验证
            $("#login").click(function(){
            	self.login();
            });
        }
    }
    return index;
})();

$(document).ready(function(){
	admin_login.initPage();
});