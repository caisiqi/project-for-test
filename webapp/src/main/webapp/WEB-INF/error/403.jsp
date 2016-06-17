<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<jsp:include page="../static/bootstrap_static.jsp"></jsp:include>
	</head>
	<body>
		
		<div class="container">
			<div class="jumbotron">
			  <h1>Error 403</h1>
			  <p>${ex}</p>
			  <p><a class="btn btn-primary btn-lg" href="#" role="button">Report error</a></p>
			</div>		
		</div>
		
	</body>
</html>