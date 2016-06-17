var PROJ_UTIL = {
	/**
	 * 用于序列化DOM元素的工具方法
	 * Oliver add at 2015/11/25 
	 */
	domSerialize: function(dom){
		var obj = {};
		if(dom){
			dom.each(function(){
				obj[$(this).attr("name")] = $(this).val();
			});
		}
		return obj;
	}
};

var PROJ_TOOLBAR = {
	/**
	 * 弹出project的搜索框
	 * Oliver add at 2015/11/25 
	 */
	popup_search: function(){
		$("#search_panel").dialog({
			width:840,
			height:180,
			title:"Search Project",
			resizable:true
		});
		$("#search_panel").show();
	},
	/**
	 * 搜索project
	 */
	project_search: function(){
		$('#project_list_table').datagrid('reload',PROJ_UTIL.domSerialize($("#search_panel").find("select,input")));
		$('#search_panel').dialog('close');
	},
	/**
	 * 弹出project编辑框 
	 */
	popup_edit: function(){
		// Not completed
	},
	/**
	 * 下载excel文件
	 * Oliver add at 2015/11/25
	 * @Deprecated
	 * Oliver modified at 2015/11/30
	 */
	download: function(){
		var _form = $("<form>");
		var options = $("#project_list_table").datagrid("options");
		var input0 = $("<input>");
		var input1 = $("<input>");
		input0.attr("name", "columns");
		input1.attr("name", "params");
		if(options){
			input0.val(JSON.stringify(options.columns));
			input1.val(JSON.stringify(options.queryParams));
		}
		_form.append(input0);
		_form.append(input1);
		_form.appendTo($("body"));
		_form.attr({
			"action":CONTEXT.contextPath + "/project/download",
			"method":"post"
		});
		_form.submit();
		_form.remove();
	},
	forecast: function(){
		var rows = $("#project_list_table").datagrid('getSelections');
		if(!rows || rows.length == 0){
			alert('Please choose a project first!');
			return;
		}
		
		//var url = CONTEXT.contextPath + '/forecast/show/' + rows[0].mfg_proj_id;
		//$("#cust_fcst_id").load(url);
		//$("#aa").accordion('select', 'Cust Forecast Info');
		
		var projIds = [];
		for(var i = 0; i < rows.length; i++){
			projIds.push(rows[i].mfg_proj_id);
		}
		var url = CONTEXT.contextPath + '/forecast/show/';
		$("#aa").accordion('select', 'Cust Forecast Info');
		$.ajax({
			type:"POST",
			url: url,
			data: "projIds=" + JSON.stringify(projIds),
			success: function(data){
				$("#cust_fcst_id").html(data);
			}
		});
	}
};

/**
 * 加载project信息
 * Oliver add at 2015/11/15 
 */
$("#project_list_table").datagrid({
	url:CONTEXT.contextPath + '/project/page',
	contentTye:"application/json",
	fit:true,
	fitColumns:true,
	pagination:true,
	pageSize:20,
	pageNumber:1,
	pageList:[10, 20, 30], 
	columns:[[{field:'cust_no',title:'Customer',width:100,align:'center'},
	          {field:'mfg_proj_ref_no',title:'Project #',width:100,align:'center'},
	          {field:'loc_no',title:'Loc #',width:100,align:'center'},
	          {field:'start_date',title:'Prod start',width:100,align:'center',
	        	  formatter: function(value,row,index){
	        		  return new Date(value).toLocaleDateString();
	        	  }
	          },
	          {field:'end_date',title:'Prod end',width:100,align:'center',
	        	  formatter: function(value,row,index){
	        		  return new Date(value).toLocaleDateString();
	        	  }
	          },
	          {field:'part_no',title:'Top sku',width:100,align:'center'},
	          {field:'model',title:'Model',width:100,align:'center'},
	          {field:'sys_type',title:'Sys Type',width:100,align:'center'},
	          {field:'status',title:'Status/Action',width:100,align:'center'},
	          {field:'chg_status',title:'Change Status',width:100,align:'center'}
	]],
	toolbar:[{
		iconCls: 'icon-search',
		handler: function(){PROJ_TOOLBAR.popup_search();},
		text: 'Search'
	},'-',{
		iconCls: 'icon-add',
		text: 'Add',
		handler: function(){
			alert('编辑按钮');
		}
	},'-',{
		iconCls: 'icon-remove',
		handler: function(){alert('编辑按钮')},
		text: 'Remove'
	},'-',{
		iconCls: 'icon-edit',
		text: 'Edit',
		handler: function(){
			alert('编辑按钮');
		}
	},'-',{
		iconCls: 'icon-help',
		handler: function(){alert('帮助按钮')},
		text: 'Help'
	},'-',{
		iconCls: 'icon-save',
		handler: function(){PROJ_TOOLBAR.download();},
		text: 'Download'
	},'-',{
		iconCls: 'icon-tip',
		handler: function(){PROJ_TOOLBAR.forecast();},
		text: 'Forecast'
	}],
	queryParams:PROJ_UTIL.domSerialize($("#search_panel").find("select,input"))
});

/**
 * 加载custNo
 * Oliver add at 2015/11/25 
 */
$("select[name='cust_no']").combobox({    
    url:CONTEXT.contextPath + '/project/ajaxCustNo',    
    valueField:'cust_no',    
    textField:'cust_name'   
});

/**
 * 加载locNo
 * Oliver add at 2015/11/25 
 */
$("select[name='loc_no']").combobox({
	url:CONTEXT.contextPath + '/project/ajaxLocNo',
	valueField:'loc_no',
	textField:'loc_char',
	formatter: function(row){
		var opts = $(this).combobox('options');
		return row[opts.valueField] + '-' + row[opts.textField];
	}
});