package oliver.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oliver.demo.dao.sybase.PPBDao;
import oliver.demo.dao.sybase.po.MFGProjPlanningBom;
import oliver.demo.service.vo.PPB;

@Service
public class PPBServiceImpl implements PPBService {

	@Autowired
	private PPBDao ppbDao;

	@SuppressWarnings("rawtypes")
	@Override
	public List<MFGProjPlanningBom> find(Map params){
		return ppbDao.find(params);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Map compare(List<PPB> list0, List<PPB> list1) {
		// not completed so return null
		return null;
	}
}
