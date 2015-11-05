var u_convertchar = {
	init:function(){
		u_convert.bind.button();
	}
};
u_convertchar.bind = {
	button:function(){
		$("#convert_big").click(function(){
			$("#type").val("big");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm("convertFrm");
			}
		});
		
		$("#convert_small").click(function(){
			$("#type").val("small");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm("convertFrm");
			}
		});
	}
};
$(function(){
	u_convertchar.init();
});