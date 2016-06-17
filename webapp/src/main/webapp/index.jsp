<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<jsp:include page="/WEB-INF/static/bootstrap_static.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
		  <h2>Welcome to Demo project.</h2>
		  <ul class="nav nav-pills nav-stacked">
		  	<%-- <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/page/layout">Project Demo</a></li>--%>
			<li role="presentation"><a href="${pageContext.request.contextPath}/page/layout">Project Demo</a></li>
			<li role="presentation"><a href="${pageContext.request.contextPath}/page/planning_bom_list">Planning BOM</a></li>
			<li role="presentation"><a href="${pageContext.request.contextPath}/newProject">Project Flow</a></li>
			<!-- PageController cannot handle the path include directory -->
			<%-- <li role="presentation"><a href="${pageContext.request.contextPath}/page/demo/websocket">WebSocket</a></li> --%>
			<li role="presentation"><a href="${pageContext.request.contextPath}/page/websocket">WebSocket</a></li>
			<li role="presentation"><a href="#">Home</a></li>
		  </ul>
		  <p><a class="btn btn-primary btn-lg" href="#" role="button">Start</a></p>
		</div>		
	</div>
</body>
</html>
