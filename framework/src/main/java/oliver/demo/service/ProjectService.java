package oliver.demo.service;

import java.util.List;
import java.util.Map;


public interface ProjectService {
	
	public Map<?, ?> page(Map<?, ?> params);
	
	public List<Map<?, ?>> list(Map<?, ?> params);
	
	public List<Map<?, ?>> ajaxCustNo();
	
	public List<Map<?, ?>> ajaxLocNo();
	
}
