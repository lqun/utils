<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../common/u_head_ref.jsp" />
<title>大小写在线转换</title>
<script src="/resources/js/utils_convertMoney.js" type="text/javascript"></script>
</head>
<body>
<!-- 头部开始 -->
<jsp:include page="../common/u_head.jsp" />
<!-- 头部结束 -->
<div class="container">
  <div class="row">
  	<div class="col-md-9 col-md-offset-1">
  	<ol class="breadcrumb">
	  <li><a href="Javascript:void(0)">转换工具</a></li>
	  <li class="active">RMB大小写转换</li>
	</ol>
        <form id="convertFrm" class="form-horizontal" role="form" action="/convert/convertMoney">
          <input type="hidden" id="type" name="type" value="big" />
          
          <div class="form-group">
		      <label for="target" class="col-sm-1 control-label">金额:</label>
		      <div class="col-sm-10">
		         <input type="text" class="form-control" name="target" id="target" placeholder="请输入数字金额" onkeyup="this.value=this.value.replace(/[^0-9.-]/g,'')">
		      </div>
   		  </div>
   		  <div class="form-group">
			 <div class="col-sm-2 col-md-offset-1">
			      <button type="button" id="convert_big" class="btn btn-success">转换</button>
				  <button type="button" id="clean" class="btn btn-danger">清除</button>
			</div>
		  </div>
   		  <div class="form-group">
		      <label class="col-sm-1 control-label">结果:</label>
		      <div class="col-sm-10">
		         <input class="form-control" id="inputResult" type="text" placeholder="转换后的结果" disabled>
		      </div>
		   </div>
		</form>
     </div>
  </div>
</div>
</body>
</html>