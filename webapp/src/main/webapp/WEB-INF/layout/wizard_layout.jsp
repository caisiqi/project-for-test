<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%> 
<!DOCTYPE HTML>
<html>
	<head>
		<title><tiles:insertAttribute name="title"/></title>
		<c:if test="${empty hasStatic || hasStatic == false}">
			<c:set var="hasStatic" value="true" scope="request"/>
			<jsp:include page="../static/static.jsp"></jsp:include>
		</c:if>
	</head>
	<body>
		<div id="wizardWindow" class="easyui-panel" title="<titles:insertAttribute name='title'/>" style="width:800px;height:400px;padding:5px;"   
        	data-options="noheader:true,fit:true">   
			<div id="wizardLayout" class="easyui-layout" style="width:100%;height:100%;">   
			    <div data-options="region:'center'" style="padding:5px;">
					<tiles:insertAttribute name="content"/>			    
			    </div>
			    <div data-options="region:'south',split:true" style="height:80px;text-align:right;vertical-align:middle;">
			    	<%-- <tiles:insertAttribute name="footer"/> --%>
					<a id="backBtn" href="${flowExecutionUrl}&_eventId=<tiles:insertAttribute name='backEventId'/>" class="easyui-linkbutton">Back</a>
					<a id="nextBtn" href="${flowExecutionUrl}&_eventId=<tiles:insertAttribute name='nextEventId'/>" class="easyui-linkbutton">Next</a>
					<a id="finBtn" href="${flowExecutionUrl}&_eventId=<tiles:insertAttribute name='finEventId'/>" class="easyui-linkbutton">Finish</a>
			    </div>   
			</div> 
		</div>  
	</body>
</html>