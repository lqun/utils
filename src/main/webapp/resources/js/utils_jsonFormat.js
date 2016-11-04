var u_jsonFormat = {
    init:function(){
        u_jsonFormat.bind.button();      
    }
};
u_jsonFormat.bind = {
    button:function() {
        $("#json_format").click(function(){
            var _val = $("#target").val();
            if (typeof(_val) != 'undefined' && _val.length > 0) {
                utils.tools.submitForm("jsonFormatFrm");
            }
        });
        
        $("#clean").click(function(){
            $("#target").val("");
        });
    }
};
$(function(){
    u_jsonFormat.init();
})