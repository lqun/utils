var utils = {
	init:function(){
		utils.bind.json();
		utils.bind.xml();
		utils.bind.other();
		utils.bind.about();
	}
};
utils.bind = {
	json:function(){
		$("a[id^='json']").each(function(){
			
		});
	},
	xml:function(){
		$("a[id^='xml']").each(function(){
			
		});
	},
	other:function(){
		$("a[id^='oth']").click(function(){
			var _this = $(this);
			var _id = _this.attr("id");
			if (_id == 'oth_0') {// 字母大小写转换
				window.location.href="/other/convertPage?type=1";
			} else if (_id == "oth_1") {// js加密、解密
				window.location.href="/other/convertPage?type=2";
			}
		});
	},
	about:function(){
		$("#about_our").click(function(){
			
		});
	}
};
utils.tools={
	submitForm:function(formId) {
		$.ajax({
			url: $("#"+formId).attr("action"),
            type: 'post',
            dataType: 'text',
            data: $("#"+formId).serialize(),
            success: function (data) {
            	var result = $.parseJSON(data);
            	$("#target").val(result);
            },
            error:function(){
            }
		});
	}
};
$(function(){
	utils.init();
});