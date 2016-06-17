package oliver.demo.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oliver.demo.dao.sybase.ForecastDao;

@Service
public class ForecastServiceImpl implements ForecastService {
	
	@Autowired
	private ForecastDao forecastDao;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map getFcstByProjId(Integer projId) {
		List<Map> list = forecastDao.getFcstByProjId(projId);
		Map result = new TreeMap<>();
		for(Map map : list){
			String key = map.get("fcst_date").toString();
			result.put(key, map);
		}
		return result;
	}

}
