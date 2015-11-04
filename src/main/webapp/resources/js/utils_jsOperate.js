var u_operate = {
	init:function(){
		u_operate.bind.button();
	}
};
u_operate.bind = {
	button:function(){
		$("#other_encryption").click(function(){
			$("#type").val("encryption");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm("jsoperateFrm");
			}
		});
		
		$("#other_decrypt").click(function(){
			$("#type").val("decrypt");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm("jsoperateFrm");
			}
		});
	}
};
$(function(){
	u_operate.init();
});