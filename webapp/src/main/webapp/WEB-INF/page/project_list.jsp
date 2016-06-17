<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
</head>
<body>
<!-- search_panel -->
<div id="search_panel" style="padding:10px;display:none;">
	<table style="width:100%;">
		<tr>
			<td>Proj#</td>
			<td><input type="text" name="mfg_proj_ref_no"></input></td>
			<td>Cust#</td>
			<td>
				<select class="easyui-combobox" name="cust_no" style="width:180px;"></select>
			</td>
			<td>Planner</td>
			<td>
				<select class="easyui-combobox" name="planner" style="width:180px;"></select>
			</td>
		</tr>
		<tr>
			<td>Status</td>
			<td>
				<select class="easyui-combobox" name="status" style="width:180px;">
					<option value='' selected='selected'>----------status----------</option>
					<option value='Saved'>Saved</option>
					<option value='Submitted'>Pending on Planner</option>
					<option value='Reviewed'>Pending on PUR</option>
					<option value='PurReviewed'>Pending on PM</option>
					<option value='Approved'>Active</option>
					<option value='Rejected'>Rejected</option>
					<option value='Cancelled'>Cancelled</option>
					<option value='Closed'>Closed</option>
					<option value='Archived'>Archived</option>
				</select>
			</td>
			<td>Change Status</td>
			<td>
				<select class="easyui-combobox" name="chg_status" style="width:180px;">
					<option value='' selected='selected'>----------status----------</option>
					<option value='Saved'>Saved</option>
					<option value='Submitted'>Pending on Planner</option>
					<option value='Reviewed'>Pending on PUR</option>
					<option value='PurReviewed'>Pending on PM</option>
					<option value='Rejected'>Rejected</option>
				</select>
			</td>
			<td>Loc#</td>
			<td>
				<select class="easyui-combobox" name="loc_no" style="width:180px;"></select>
			</td>
		</tr>
		<tr>
			<td>Model</td>
			<td><input type="text" name="model"/></td>
			<td>Top Sku/Part#</td>
			<td><input type="text" name="top_sku_no"/></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td colspan="6" style="text-align:right">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="PROJ_TOOLBAR.project_search();">Search</a>
			</td>
		</tr>
	</table>
</div>
<!--// search panel -->
<table id="project_list_table" style="margin:5px;"></table>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/project_list.js"></script>
</html>