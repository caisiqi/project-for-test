package oliver.demo.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;

import oliver.demo.common.util.Utils;
import oliver.demo.common.util.ExcelHelper;
import oliver.demo.common.util.FtpHelper;
import oliver.demo.service.ProjectService;


@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@SuppressWarnings({ "rawtypes" })
	@RequestMapping("/page")
	@ResponseBody
	public Map page(@RequestParam Map params, HttpServletRequest request, HttpServletResponse response) {
		
		/*Map<String, String> params = new HashMap<>();
		params = request.getParameterMap().entrySet().parallelStream()
				.filter( e-> null != e.getValue() && e.getValue().length > 0 && Utils.isNotBlank(e.getValue()[0]))
				.collect(Collectors.toMap(k-> k.getKey(), v-> v.getValue()[0]));*/
		
		return projectService.page(params);
	}
	
	@RequestMapping("/save")
	public void save(@RequestParam Map<String, String> params){
		System.out.println("Project info" + params);
	}
	
	@RequestMapping("/download")
	public void download(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<String> headerList = new ArrayList<String>();
		List<String> keyList = new ArrayList<String>();
		String columnsStr = request.getParameter("columns");
		String paramsStr = request.getParameter("params");
		String filename = "Project_" + new SimpleDateFormat("YYYY_MM_dd").format(new Date());
		
		if (Utils.isNotBlank(columnsStr)) {
			// 临时实现，今后考虑实现复杂的表格头
			// Add by Oliver at 2015/11/25
			List<?> outer = JSON.parseArray(columnsStr, List.class);
			List<?> inner = (List<?>) outer.get(0);
			for(Object object : inner){
				Map<?, ?> map = (Map<?, ?>) object;
				headerList.add(map.get("title").toString());
				keyList.add(map.get("field").toString());
			}
		}
		
		Map<?, ?> params = Utils.isNotBlank(paramsStr) ? JSON.parseObject(paramsStr, Map.class) : new HashMap<>();
		params = params.entrySet().parallelStream()
				.filter(e-> null != e.getValue() && !"".equals(e.getValue().toString().trim()))
				.collect(Collectors.toMap(k-> k.getKey(), v-> v.getValue()));
		
		List<Map<?, ?>> list = projectService.list(params);
		
		String[] headers = headerList.toArray(new String[headerList.size()]);
		HSSFWorkbook workbook = new HSSFWorkbook();
		Sheet sheet0 = workbook.createSheet();
		ExcelHelper.setHeader(workbook, sheet0, headers);
		
		for (int i = 0; i < list.size(); i++) {
			Map<?, ?> rawRow = list.get(i);
			if( i % 2 == 0){
				ExcelHelper.setEvenRow(workbook, sheet0, map2Array(rawRow, keyList));
				continue;
			}
			ExcelHelper.setOddRow(workbook, sheet0, map2Array(rawRow, keyList));
		}
		
		response.setHeader("Content-disposition", String.format("attachment;filename=%s.xls", filename));
		response.setContentType("application/x-msexcel; charset=UTF-8");
		workbook.write(response.getOutputStream());
	}
	
	@RequestMapping("/uploadSupport")
	public void uploadSupport(@RequestParam("support_file") MultipartFile file,
			@RequestParam("support_comment") String comment,
			HttpServletResponse response) throws Exception{
		
		if (null != file) {
			// Temporary implement
			// 临时实现，上传文件到本地ftp服务器并且不记录comment
			FTPClient client = FtpHelper.getLocalClient();
			if(client.isAvailable()){
				client.storeFile(file.getOriginalFilename(), file.getInputStream());
			}
			response.getWriter().write("<script type=\"text/javascript\">alert('上传成功！');</script>");
			return;
		}
		response.getWriter().write("<script type=\"text/javascript\">alert('上传失败！');</script>");
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping("/ajaxCustNo")
	@ResponseBody
	public List ajaxCustNo() {
		return projectService.ajaxCustNo();
	}


	@SuppressWarnings("rawtypes")
	@RequestMapping("/ajaxLocNo")
	@ResponseBody
	public List ajaxLocNo() {
		return projectService.ajaxLocNo();
	}

	/**
	 *  临时实现从map对象转数组对象
	 *  @param map
	 *  希望处理的map对象
	 *  @param keyList
	 *  希望保留的key列表
	 */
	// 考虑使用java8替代并更新上面的javadoc
	// Added by Oliver 2015/12/01
	@SuppressWarnings("rawtypes")
	private String[] map2Array(Map map, List keyList) {
		String[] arr = new String[keyList.size()];
		for (int i = 0; i < keyList.size(); i++) {
			String val = map.get(keyList.get(i)) == null ? "" : map.get(keyList.get(i)).toString();
			arr[i] = val;
		}
		return arr;
	}
	
}
