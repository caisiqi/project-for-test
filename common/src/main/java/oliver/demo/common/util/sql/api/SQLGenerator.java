package oliver.demo.common.util.sql.api;

import java.util.Map;

public interface SQLGenerator {
	
	String generateSql(Map<String, String> params);
	
	TableInfo getTableInfo();
	
}
