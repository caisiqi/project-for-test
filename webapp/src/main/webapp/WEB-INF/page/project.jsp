<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
	</head>
	<body>
		<div id="aa" class="easyui-accordion" style="width:100%;height:auto;">   
		    
		    <div title="MRP Project" style="padding:10px;">
		    	<jsp:include page="project_edit.jsp"/>
		    </div>   
		    
		    <div id="cust_fcst_id" title="Cust Forecast Info" style="padding:10px;">   
		        <%-- <jsp:include page="forecast.jsp"/> --%>   
		    </div>   
		    
		    <div title="PML Info" style="padding:10px;">   
		        Not completed    
		    </div>   

			<div title="Support Document" style="padding:10px;">   
		        <jsp:include page="project_support.jsp"/>    
		    </div>
		    
		    <div title="Project Summary" data-options="selected:true" style="padding:10px;height:600px;">   
		    	<jsp:include page="project_list.jsp"/>
		    </div>
		    
		</div>
	</body>
</html>