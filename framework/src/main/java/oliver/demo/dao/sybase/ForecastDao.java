package oliver.demo.dao.sybase;

import java.util.List;
import java.util.Map;

public interface ForecastDao {
	
	@SuppressWarnings("rawtypes")
	List<Map> getFcstByProjId(Integer projId);
}
