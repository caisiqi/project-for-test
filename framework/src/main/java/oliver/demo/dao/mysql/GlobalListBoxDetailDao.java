package oliver.demo.dao.mysql;

import java.util.List;
import java.util.Map;

import oliver.demo.annotation.MysqlGlobal;
import oliver.demo.dao.mysql.po.GlobalListBoxDetail;

@MysqlGlobal
public interface GlobalListBoxDetailDao {

	@SuppressWarnings("rawtypes")
	List<GlobalListBoxDetail> find(Map params);
	
	@SuppressWarnings("rawtypes")
	void insert(Map params);
	
	@SuppressWarnings("rawtypes")
	void delete(Map params);
}
