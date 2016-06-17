package oliver.demo.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import oliver.demo.dao.sybase.ProjectDao;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDao projectDao;
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map page(Map params) {
		Map result = new HashMap();
		int rows   = Integer.parseInt(params.get("rows").toString());
		int page = Integer.parseInt(params.get("page").toString());
		int listCount  = rows * ( page - 1);
		
		params.put("listCount", listCount);
		params.put("beginIndex", Collections.max(projectDao.listMax(params)));
		result.put("total", projectDao.listTotal(params));
		result.put("rows", projectDao.list(params));
		
		return result;
	}

	@Override
	public List<Map<?, ?>> ajaxCustNo() {
		return projectDao.ajaxCustNo();
	}

	@Override
	public List<Map<?, ?>> ajaxLocNo() {
		return projectDao.ajaxLocNo();
	}

	@Override
	public List<Map<?, ?>> list(Map<?, ?> params) {
		return projectDao.list(params);
	}

}
