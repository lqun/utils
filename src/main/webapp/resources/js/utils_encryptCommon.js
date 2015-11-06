var u_encryptcommon = {
	init:function(){
		u_encryptcommon.bind.button();
	}
};
u_encryptcommon.bind = {
	button:function(){
		$("#convert_big").click(function(){
			$("#type").val("big");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm_target("encryptFrm", "result");
			}
		});
		
		$("#convert_small").click(function(){
			$("#type").val("small");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm_target("encryptFrm", "result");
			}
		});
		
		$("#clean").click(function(){
			$("#target").val("");
			$("#result").val("");
		});
	}
};
$(function(){
	u_encryptcommon.init();
});