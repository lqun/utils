var utils = {
	init:function(){
		utils.bind.json();
		utils.bind.xml();
		utils.bind.other();
		utils.bind.about();
	}
};
utils.bind = {
	json:function(){
		$("a[id^='json']").each(function(){
			
		});
	},
	xml:function(){
		$("a[id^='xml']").each(function(){
			
		});
	},
	other:function(){
		$("a[id^='oth']").click(function(){
			var _this = $(this);
			var _id = _this.attr("id");
			if (_id == 'oth_0') {
				window.location.href="/other/convertPage";
			}
		});
	},
	about:function(){
		$("#about_our").click(function(){
			
		});
	}
};
$(function(){
	utils.init();
});