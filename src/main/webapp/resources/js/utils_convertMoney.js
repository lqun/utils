var u_convertmoney = {
	init:function(){
		u_convertmoney.bind.button();
	}
};
u_convertmoney.bind = {
	button:function(){
		$("#convert_big").click(function(){
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm_target("convertFrm", "inputResult");
			}
		});
		
		$("#clean").click(function(){
			$("#target").val("");
			$("#inputResult").val("");
		});
	}
};

$(function(){
	u_convertmoney.init();
});
