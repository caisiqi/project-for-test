package oliver.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import oliver.demo.service.ForecastService;

@Controller
@RequestMapping("/forecast")
public class ForecastController {

	@Autowired
	private ForecastService forecastService;
	
	@SuppressWarnings("rawtypes")
	@RequestMapping({"/show"})
	//public ModelAndView show(@PathVariable Integer projId){
	public ModelAndView show(@RequestParam String projIds){	
		// 临时设置成固定值
		// 解决传入的projId没有查询出数据时，使用projId=751代替
		// 后续解决projId查询结果为空时，跳转到默认页面
		Integer[] ids = JSON.parseObject(projIds, Integer[].class);
		Integer projId = 751;
		Map rawData = forecastService.getFcstByProjId(projId);
		return new ModelAndView("page/forecast")
				.addObject("xAxis", JSON.toJSONString(getXAxis(rawData)))
				.addObject("series", JSON.toJSONString(getSeries(rawData)));
	}
	
	// bug起因是因为mybatis返回的map的一个hashmap的实例，造成了返回的数据乱序
	// 页面显示的排序有问题，考虑有空解决
	// Added by Oliver
	// 2015/12/01
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Object[] getXAxis(Map rawData) {
		if (null == rawData || rawData.size() == 0) {
			return null;
		}
		return rawData.keySet().toArray(new Object[rawData.size()]);
	}
	
	// 页面显示的排序有问题，考虑有空解决
	// Added by Oliver
	// 2015/12/01
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List<Map> getSeries(Map rawData) {
		List<Map> series = new ArrayList<Map>();
		Map mrpFcst = new HashMap();
		List data = new ArrayList();
		mrpFcst.put("name", "MRP");
		mrpFcst.put("data", data);
		series.add(mrpFcst);
		
		Iterator it = rawData.values().iterator();
		while (it.hasNext()) {
			Map map = (Map) it.next();
			data.add(map.get("fcst_qty"));
		}
		
		return series;
	}
	
}
