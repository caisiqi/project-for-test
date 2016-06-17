<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<jsp:include page="../static/static.jsp"></jsp:include>
		<script type="text/javascript">
			var pageContext = {};
			pageContext.contextPath = '${pageContext.request.contextPath}';
		</script>
	</head>
	<body>
		<div class="easyui-tabs" style="width:100%;height:atuo;" data-options="fit:true,">
			
			<div title="MRP Project">
				<div style="padding:10px;">
					<jsp:include page="project.jsp"></jsp:include>
				</div>
			</div>
			
			<div title="MRP Allocation">
				This is the MRP Allocation content.
			</div>
			
			<div title="MRP PO/MT Req">
				This is the MRP PO/MT Req content.
			</div>
			
			<div title="MRP Change Req">
				This is the MRP Change Req content.
			</div>
			
			<div title="FCST vs. Prod. Plan">
				This is the FCST vs. Prod. Plan content.
			</div>
		
			<div title="Open PO/MT">
				This is the Open PO/MT content.
			</div>
		</div>
	</body>
</html>