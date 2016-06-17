package oliver.demo.dao.sybase;

import java.util.List;
import java.util.Map;

import oliver.demo.dao.sybase.po.MFGProjPlanningBom;

public interface PPBDao {
	
	@SuppressWarnings("rawtypes")
	List<MFGProjPlanningBom> find(Map params);
	
}
