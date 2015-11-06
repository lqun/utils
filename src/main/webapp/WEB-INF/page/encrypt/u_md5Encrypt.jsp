<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../common/u_head_ref.jsp" />
<title>MD5在线加密</title>
<script src="/resources/js/utils_encryptCommon.js" type="text/javascript"></script>
</head>
<body>
<!-- 头部开始 -->
<jsp:include page="../common/u_head.jsp" />
<!-- 头部结束 -->
<div class="container">
  <div class="row">
  	<div class="col-md-9 col-md-offset-1">
  	<ol class="breadcrumb">
	  <li><a href="Javascript:void(0)">加密/解密</a></li>
	  <li class="active">MD5加密</li>
	</ol>
        <form id="encryptFrm" role="form" action="/encrypt/md5Encryption">
		  <div class="form-group">
		    <label for="name">请输入您要加密的内容:</label>
		    <textarea id="target" name="target" class="form-control" rows="9" cols="10" placeholder="要加密的内容"></textarea>
		  </div>
		</form>
		<button type="button" id="convert_big" class="btn btn-success">加密</button>
		<button type="button" id="clean" class="btn btn-danger">清除</button>
		<div class="form-group">
		    <label for="name">MD5加密后的内容:</label>
		    <textarea name="target" id="result" class="form-control" rows="9" cols="10" placeholder="MD5加密结果"></textarea>
		 </div>
     </div>
  </div>
</div>
</body>
</html>