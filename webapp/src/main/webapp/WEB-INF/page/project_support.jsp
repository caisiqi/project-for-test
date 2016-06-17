<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
</head>
<body>

<div class="easyui-panel" style="padding:10px;background:#fafafa;" >
	<form id="support_form" target="support_iframe" method="post" action="${pageContext.request.contextPath}/project/uploadSupport" enctype="multipart/form-data">
		<table style="width:100%;">
			<tr>
				<td><label>Upload File</label></td>
				<td><input type="file" id="support_file" name="support_file" style="width:200px;" class="easyui-validatebox" data-options="required:true"/></td>
			</tr>
			<tr>
				<td><label>Comment</label></td>
				<td>
					<textarea name="support_comment" style="width:200px;"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:right">
			       	<%-- <a class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="PROJ_SUPPORT.upload($('#support_file','${pageContext.request.contextPath}/project/uploadSupport');">Save</a> --%>
			       	<!-- <a class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="$('#support_form').submit();">Save</a> -->
			       	<a class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="PROJ_SUPPORT.upload();">Save</a>
			    </td>
			</tr>
		</table>
	</form>
	<iframe id="support_iframe" name="support_iframe" style="display:none;"></iframe>
</div>

<!-- <table id=""></table> -->

</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/project_support.js"></script>
</html>