package oliver.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import oliver.demo.dao.sybase.po.MFGProjPlanningBom;
import oliver.demo.service.PPBService;

@Controller
@RequestMapping("/ppb")
public class PPBController {
	
	@Autowired
	private PPBService ppbService;
	
	/*@RequestMapping("showList")
	public ModelAndView showList(){
		return new ModelAndView("list_planning_bom");
	}*/
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/list")
	@ResponseBody
	public List<MFGProjPlanningBom> list(){
		
		//for test
		Map params = new HashMap();
		params.put("treeId", 24681);
		
		return ppbService.find(params);
	}
	
	
	
}
