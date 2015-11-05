<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../common/u_head_ref.jsp" />
<title>escape编码/解码</title>
<script src="/resources/js/utils_encodeCommon.js" type="text/javascript"></script>
</head>
<body>
<!-- 头部开始 -->
<jsp:include page="../common/u_head.jsp" />
<!-- 头部结束 -->
<div class="container">
  <div class="row">
  	<div class="col-md-9 col-md-offset-1">
  	<ol class="breadcrumb">
	  <li><a href="Javascript:void(0)">编码/解码</a></li>
	  <li class="active">escape编码</li>
	</ol>
        <form id="convertFrm" class="form-horizontal" role="form" action="/encode/url">
          <input type="hidden" id="type" name="type" value="en" />
          
          <div class="form-group">
		      <label for="target" class="col-sm-1 control-label">源:</label>
		      <div class="col-sm-10">
		         <textarea class="form-control" name="target" id="target" placeholder="请输入内容" rows="9" cols="10" ></textarea>
		      </div>
   		  </div>
   		  <div class="form-group">
			 <div class="col-sm-3 col-md-offset-1">
			      <button type="button" id="encode_en" class="btn btn-info">编码</button>
			      <button type="button" id="encode_de" class="btn btn-success">解码</button>
				  <button type="button" id="clean" class="btn btn-danger">清除</button>
			</div>
		  </div>
   		  <div class="form-group">
		      <label class="col-sm-1 control-label">结果:</label>
		      <div class="col-sm-10">
		         <textarea class="form-control" name="inputResult" id="inputResult" placeholder="结果" rows="9" cols="10" ></textarea>
		      </div>
		   </div>
		</form>
     </div>
  </div>
</div>
</body>
</html>