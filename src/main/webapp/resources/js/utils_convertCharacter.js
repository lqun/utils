var u_convert = {
	init:function(){
		u_convert.bind.button();
	}
};
u_convert.bind = {
	button:function(){
		$("#other_big").click(function(){
			$("#type").val("big");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm("convertFrm");
			}
		});
		
		$("#other_small").click(function(){
			$("#type").val("small");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm("convertFrm");
			}
		});
	}
};
$(function(){
	u_convert.init();
});