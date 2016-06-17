// 暂时没啥卵用
var PROJ_SUPPORT = {
	upload: function(){
		var form = $("#support_form");
		var input = $("<input>");
		var options = $("#project_list_table").datagrid("options");
		input.attr("name", "params");
		if(options){
			input.val(JSON.stringify(options.queryParams));
		}
		form.append(input);
		form.submit();
		input.remove();
	}
};