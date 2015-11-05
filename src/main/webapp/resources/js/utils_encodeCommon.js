var u_encodeCommon = {
	init:function(){
		u_encodeCommon.bind.button();
	}
};
u_encodeCommon.bind = {
	button:function(){
		$("#encode_en").click(function(){
			$("#type").val("en");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm_target("convertFrm" ,"inputResult");
			}
		});
		
		$("#encode_de").click(function(){
			$("#type").val("de");
			var _val = $("#target").val();
			if (typeof(_val) != 'undefined' && _val.length > 0) {
				utils.tools.submitForm_target("convertFrm" ,"inputResult");
			}
		});
		
		$("#clean").click(function(){
			$("#target").val("");
			$("#inputResult").val("");
		});
	}
};

$(function(){
	u_encodeCommon.init();
});
