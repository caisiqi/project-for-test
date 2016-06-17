<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>List Planning Bom</title>
	<jsp:include page="../static/static.jsp"></jsp:include>
</head>
<body>
<!-- <div id="search-dialog" class="easyui-dialog" title="Search" style="width:600px;height:300px;"   
        data-options="iconCls:'icon-save',resizable:true,modal:true">
	<table>
		<tr>
			<td><label></label></td>
			<td></td>
			<td><label></label></td>
			<td></td>
		</tr>
		<tr>
			<td colspan="4"></td>
		</tr>
	</table>
</div> -->
<table id="datagrid" style="padding:5px;"></table>
</body>
<script type="text/javascript">
$("#datagrid").treegrid({
	//url:'${pageContext.request.contextPath}/ppb/list',
	url:'',
	contentTye:"application/json",
	fit:true,
	fitColumns:true,
	/*idField:'treeId',    
    treeField:'treeId',
	columns:[[{field:'treeId',title:'Tree ID',width:100,align:'center'},
	          {field:'part',title:'Part #',width:100,align:'center',
				  formatter:function(value, row, index){
					  return value.partNo
				  }
			  },
	          {field:'mfgProjId',title:'Project ID',width:100,align:'center'},
	          {field:'lineNo',title:'Line #',width:100,align:'center'},
	          {field:'spareQty',title:'Spare QTY',width:100,align:'center',
	        	  formatter:function(value, row, index){
	        		  var id = 'spareQty_' + row.treeId;
	        		  return '<input style="width:100%;" id="' + id + '" value="' + value + '"/>';
	        	  }
	          },
	          {field:'allocModel',title:'AllocModel',width:100,align:'center'},
	          {field:'altPartPriority',title:'AltPartPriority',width:100,align:'center'},
	          {field:'altPartPercentage',title:'AltPartPercentage',width:100,align:'center'},
	          {field:'altPartGroup',title:'AltPartGroup',width:100,align:'center'},
	          {field:'lifeCycle',title:'LifeCycle',width:100,align:'center'}
	]], */
	columns: [[
               {title:'一组',colspan:3},
               {field:'opt',title:'Operation',width:100,align:'center', rowspan:2,
                   formatter:function(value,rec){
                       return '<span style="color:red">Edit Delete</span>';
                   }
               },
               {title:'二组',colspan:3}
           ],[ 
               {field:'name',title:'Name',width:120,rowspan:1},
               {field:'addr',title:'Address',width:220,rowspan:1,sortable:true,
                   sorter:function(a,b){
                       return (a>b?1:-1);
                   }
               },
               {field:'col4',title:'Col41',width:150,rowspan:1},
                   {field:'name1',title:'Name1',width:120,rowspan:1},
               {field:'addr1',title:'Address1',width:220,rowspan:1,sortable:true,
                   sorter:function(a,b){
                       return (a>b?1:-1);
                   }
               },
               {field:'col41',title:'Col411',width:150,rowspan:1}
           ]],
	onLoadSuccess:function(data){
		$("input[id^='spareQty_']").numberspinner({    
		    min: 0,    
		    max: 9999,    
		    editable: false   
		});
	}
});
</script>
</html>