/*
	COMMON HJRZ-JS-ADMIN
	RUDOLPHLIU
	2017-09-12
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
        imageUpload: function(box){
        	 var boxDom = box;
			 var fileDom = boxDom.find('input[type=file]');
			 	fileDom.fileupload({
		    	url: '/toupload/ajax/uploadFile.do',
		        dataType: 'json',
			        add: function (e, data) {
			            data.context = $('#submit').text('Upload')
			                .appendTo(document.body)
			                .click(function (){
			                    data.context = $('<p/>').text('Uploading...').replaceAll($(this));
			                    data.submit();
			                });
			        },
			        done: function (e, data) {
			            data.context.text('Upload finished.');
			        }
		    });
        },
	}
	return common;
})();

