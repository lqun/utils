var u_convertun = {
	init:function(){
		u_convertun.bind.button();
	}
};
u_convertun.bind = {
	button:function(){
		$("#convert_un").click(function(){
			$("#type").val("un");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm("convertFrm");
			}
		});
		
		$("#convert_ch").click(function(){
			$("#type").val("ch");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm("convertFrm");
			}
		});
		
		$("#clean").click(function(){
			$("#target").val("");
		});
	}
};

$(function(){
	u_convertun.init();
});
