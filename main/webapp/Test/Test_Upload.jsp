<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试上传功能</title>
</head>
<body>
	<form name="form" action="/check_Accout/Check_MainController/upload" enctype="multipart/form-data" method="post">
		上传原始账单：<input type="file" name="fileA"><br/>
		上传出纳记录:<input type="file" name="fileB"><br>
		<input type="submit" value="提交">
	</form><br>
</body>
</html>