<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../common/u_head_ref.jsp" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="/resources/js/utils_jsonFormat.js" type="text/javascript"></script>
<title>json格式化</title>
</head>
<body>
<!-- 头部开始 -->
<jsp:include page="../common/u_head.jsp" />
<!-- 头部结束 -->
<div class="container">
  <div class="row">
  	<div class="col-md-9 col-md-offset-1">
  	<ol class="breadcrumb">
	  <li><a href="Javascript:void(0)">json相关</a></li>
	  <li class="active">json格式化</li>
	</ol>
        <form id="jsonFormatFrm" role="form" action="/json/format">
		  <div class="form-group">
		    <label for="name">请输入您要格式化的内容:</label>
		    <textarea id="target" name="jsonStr" class="form-control" rows="30" cols="10" placeholder="请输入要格式化的json字符串"></textarea>
		  </div>
		</form>
		<button type="button" id="json_format" class="btn btn-success">格式化</button>
		<button type="button" id="clean" class="btn btn-danger">清除</button>
     </div>
  </div>
</div>
</body>
</html>