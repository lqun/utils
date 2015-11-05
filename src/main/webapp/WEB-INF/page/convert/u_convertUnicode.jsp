<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../common/u_head_ref.jsp" />
<title>Unicode中文互转</title>
<script src="/resources/js/utils_convertUnicode.js" type="text/javascript"></script>
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
	  <li class="active">Unicode中文互转</li>
	</ol>
	 <form id="convertFrm" role="form" action="/convert/convertUnicode">
          <input type="hidden" id="type" name="type" value="un" />
		  <div class="form-group">
		    <label for="name">请输入您要转换的内容:</label>
		    <textarea id="target" name="target" class="form-control" rows="15" cols="10"></textarea>
		  </div>
	  </form>
      <button type="button" id="convert_un" class="btn btn-info">Unicode</button>
      <button type="button" id="convert_ch" class="btn btn-success">中文</button>
	  <button type="button" id="clean" class="btn btn-danger">清除</button>
     </div>
  </div>
</div>
</body>
</html>