package oliver.demo.service;

import java.util.List;
import java.util.Map;

import oliver.demo.dao.sybase.po.MFGProjPlanningBom;
import oliver.demo.service.vo.PPB;

public interface PPBService {

	@SuppressWarnings("rawtypes")
	List<MFGProjPlanningBom> find(Map params);

	@SuppressWarnings("rawtypes")
	Map compare(List<PPB> list0, List<PPB> list1);
	
}
