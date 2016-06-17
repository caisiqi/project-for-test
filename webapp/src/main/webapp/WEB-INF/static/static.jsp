<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- easyui with highcharts -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/themes/default/easyui.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/themes/icon.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/highcharts.js"></script>
<script type="text/javascript">
/*set variant CONTEXT*/
var CONTEXT = {
	contextPath:"${pageContext.request.contextPath}"
};
</script>
<style>
td, th, div {
	font-size: 11px; font-family: Arial, Helvetica, sans-serif;
}
th{
	font-weight: bold;
}
</style>