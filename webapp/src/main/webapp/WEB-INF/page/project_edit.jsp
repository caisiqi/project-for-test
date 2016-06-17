<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
</head>
<body>

<div class="easyui-panel" style="padding:10px;background:#fafafa;" >
	<table style="width:100%;">
		<tr>
			<td><label>Project #</label></td>
			<td><input type="text" name="mfg_proj_ref_no" class="easyui-validatebox" data-options="required:true"/></td>
			<td><label>Cust #</label></td>
			<td>
				<select class="easyui-combobox" name="cust_no" style="width:280px;">
				</select>
			</td>
		</tr>
		<tr>
			<td><label>Production Start Date</label></td>
			<td><input type="text" name="start_date" class="easyui-datetimebox" data-options="required:true"/></td>
			<td><label>Production End Date</label></td>
			<td><input type="text" name="end_date" class="easyui-datetimebox" data-options="required:true"/></td>
		</tr>
		<tr>
			<td><label>TopSku/Part #</label></td>
			<td><input type="text" name="top_sku_no" class="easyui-validatebox" data-options="required:true"/></td>
			<td><label>Loc #</label></td>
			<td>
				<select class="easyui-combobox" name="loc_no" style="width:280px;">
				</select>
			</td>
		</tr>
		<tr>
			<td><label>Prod Build Time</label></td>
			<td><input type="text" name="mfg_proj_ref_no" class="easyui-validatebox" data-options="required:true"/></td>
			<td><label>Project Type</label></td>
			<td>
				<select class="easyui-combobox" name="project_type" style="width:280px;">
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="4" style="text-align:right">
		       	<a id="projectSaveBtn" class="easyui-linkbutton" data-options="iconCls:'icon-save'">Save</a>
		    </td>
		</tr>
	</table>
</div>

</body>
</html>