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
				u_convertmoney.tools.submitForm();
			}
		});
		
		$("#clean").click(function(){
			$("#target").val("");
			$("#inputResult").val("");
		});
	}
};
u_convertmoney.tools = {
		submitForm:function() {
			$.ajax({
				url: $("#convertFrm").attr("action"),
				type: 'post',
				dataType: 'text',
				data: $("#convertFrm").serialize(),
				success: function (data) {
					var result = $.parseJSON(data);
					$("#inputResult").val(result);
				},
				error:function(){
				}
			});
		}
}
$(function(){
	u_convertmoney.init();
});