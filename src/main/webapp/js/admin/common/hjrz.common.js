/*
*此文件定义公用的函数
*/
var Common = (function(){
	var common = {
		/*验证手机号*/
		checkPhone:function(val){
			var reg=/^1[358]\d{9}/;
		    if(!reg.test(val)){
		      return false;
		    }
		    return true;
		},
		/*验证邮箱*/
		checkEmail:function(val){
			var reg=/^\w+\.?@[a-z0-9]+\.(com|cn|net|com.cn|org|edu)$/;
		    if(!reg.test(val)){
		      return false;
		    }
		    return true;
		},
		/*验证网址*/
		checkUrl:function(val){
			var reg=/^http(s)?:\/\/(www\.)?[a-z0-9]+\.(com|cn|net|com.cn|org|edu)\/?([a-z0-9]+)*\/?([a-z0-9]+\.[a-z]+)?$/;
		    if(!reg.test(val)){
		      return false;
		    }
		    return true;
		},
		/*验证密码*/
		checkPwd:function(val){
			var reg=/^\w{8,20}$/;
		    if(!reg.test(val)){
		      return false;
		    }
		    return true;
		},
		
        table:function(){
        	/*全选/全不选*/
	        $('input[name="b"]').click(function(){
	           if($(this).is(':checked')){
	              $('input[name="a"]').prop('checked',true);
	           }else{
	              $('input[name="a"]').prop('checked',false);
	           }
	        })
	        /*点击其中一个取消全选*/
	        $('input[name="a"]').click(function(){
	        	$('input[name="b"]').prop('checked',false);
	        })
        },
 
        /*
         * 上传图片组件
        */ 
        imageUpload: function(formname){
        	var data = new FormData(formname[0]); 
			$.ajax({
			      url: "/toupload/ajax/uploadFile.do",
			      type: "POST",
			      data : data, 
			      dataType : 'JSON',
			      cache : false,
			      processData : false,
			      contentType : false,
			      success: function (data) {
			        alert(data.message);
			      }
			    });
        },
	}
	return common;
})();

