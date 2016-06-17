package oliver.demo.dao.sybase;

import java.util.List;
import java.util.Map;

public interface ProjectDao {

	Map<?, ?> findById(Integer projId);
	
	Map<?, ?> findByNo(String projNo);
	
	List<Map<?, ?>> list(Map<?, ?> params);

	List<Integer> listMax(Map<?, ?> params);
	
	int listTotal(Map<?, ?> params);
	
	void save(Map<?, ?> project);
	
	void update(Map<?, ?> project);
	
	List<Map<?, ?>> ajaxCustNo();

	List<Map<?, ?>> ajaxLocNo();
}
