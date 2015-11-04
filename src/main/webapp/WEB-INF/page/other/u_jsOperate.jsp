<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../common/u_head_ref.jsp" />
<title>大小写在线转换</title>
<script src="/resources/js/utils_convertCharacter.js" type="text/javascript"></script>
</head>
<body>
<!-- 头部开始 -->
<jsp:include page="../common/u_head.jsp" />
<!-- 头部结束 -->
<div class="container">
  <div class="row">
  	<div class="col-md-9 col-md-offset-1">
  	<ol class="breadcrumb">
	  <li><a href="Javascript:void(0)">其它工具</a></li>
	  <li class="active">js加密/解密</li>
	</ol>
        <form id="jsoperateFrm" role="form" action="/other/jsoperate">
          <input type="hidden" id="type" name="type" value="encryption" />
		  <div class="form-group">
		    <label for="name">请输入您要转换的内容:</label>
		    <textarea id="target" name="target" class="form-control" rows="15" cols="10"></textarea>
		  </div>
		</form>
		<button type="button" id="other_encryption" class="btn btn-success">js加密</button>
		<button type="button" id="other_decrypt" class="btn btn-info">js解密</button>
     </div>
  </div>
</div>
</body>
</html>