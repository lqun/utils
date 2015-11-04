var u_convert = {
	init:function(){
		u_convert.bind.button();
	}
};
u_convert.bind = {
	button:function(){
		$("#other_big").click(function(){
			$("#type").val("big");
			utils.tools.submitForm("convertFrm");
		});
		
		$("#other_small").click(function(){
			$("#type").val("small");
			utils.tools.submitForm("convertFrm");
		});
	}
};
$(function(){
	u_convert.init();
});