<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%> 
<!DOCTYPE HTML>
<!-- Deprecated temporarily because this page not used -->
<!-- Oliver comment at 2016/01/14 -->
<html>
	<head>
		<c:if test="${empty hasStatic || hasStatic == false}">
			<c:set var="hasStatic" value="true" scope="request"/>
			<jsp:include page="../static/static.jsp"></jsp:include>
		</c:if>
	</head>
	<body>
		<a id="backBtn" href="#" class="easyui-linkbutton">Back</a>
		<a id="nextBtn" href="#" class="easyui-linkbutton">Next</a>
		<a id="finBtn" href="#" class="easyui-linkbutton">Finish</a>
	</body>
</html>