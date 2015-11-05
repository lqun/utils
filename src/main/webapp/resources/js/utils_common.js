var utils = {
	init:function(){
		utils.bind.json();
		utils.bind.encryption();
		utils.bind.code();
		utils.bind.convert();
		utils.bind.other();
		utils.bind.about();
	}
};
utils.bind = {
	json:function(){
		$("a[id^='json']").click(function(){
			
		});
	},
	encryption:function(){
		$("a[id^='encryption']").click(function(){
			
		});
	},
	code:function(){
		$("a[id^='encode']").click(function(){
			
		});
	},
	convert:function(){
		$("a[id^='convert']").click(function(){
			var _this = $(this);
			var _id = _this.attr("id");
			if (_id == 'convert_0') {// 字母大小写转换
				window.location.href="/convert/convertPage?type=1";
			} else if (_id == "convert_1") {// 人民币大小写转换
				window.location.href="/convert/convertPage?type=2";
			}
		});
	},
	other:function(){
		$("a[id^='oth']").click(function(){
			var _this = $(this);
			var _id = _this.attr("id");
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