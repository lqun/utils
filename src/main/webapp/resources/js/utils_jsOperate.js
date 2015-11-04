var u_operate = {
	init:function(){
		u_operate.bind.button();
	}
};
u_operate.bind = {
	button:function(){
		$("#other_encryption").click(function(){
			$("#type").val("encryption");
			utils.tools.submitForm("jsoperateFrm");
		});
		
		$("#other_decrypt").click(function(){
			$("#type").val("decrypt");
			utils.tools.submitForm("jsoperateFrm");
		});
	}
};
$(function(){
	u_operate.init();
});