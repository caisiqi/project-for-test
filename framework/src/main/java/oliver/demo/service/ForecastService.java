package oliver.demo.service;

import java.util.Map;

public interface ForecastService {

	@SuppressWarnings("rawtypes")
	public Map getFcstByProjId(Integer projId);
	
}
