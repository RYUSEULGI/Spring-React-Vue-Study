<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Fileupload Form Multi</title>
		<style>
			a{text-decoration:none}
		</style>
	</head>
	<body style="text-align:center">
		<h1>파일업로드(멀티)</h1>
		<form action="/file/multiForm.do"  method="post" enctype="multipart/form-data">
		 <div>
		   <input type='file' name='files'>
		 </div>
		 <div>
		   <input type='file' name='files'>
		 </div>
		 <div>
		   <input type='file' name='files'>
		 </div>
		 <div>
		   <input type='file' name='files'>
		 </div>
		 <div>
		   <input type='file' name='files'>
		 </div>
		 <div>
		   <input type='submit'>
		 </div>   
		</form>
	</body>
</html>