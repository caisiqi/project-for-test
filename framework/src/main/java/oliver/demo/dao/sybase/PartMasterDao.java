package oliver.demo.dao.sybase;

import java.util.Map;

public interface PartMasterDao {
	
	@SuppressWarnings("rawtypes")
	Map findByPartNo(String partNo);
	
	@SuppressWarnings("rawtypes")
	void update(Map params);
}
