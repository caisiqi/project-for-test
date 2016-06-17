package oliver.demo.common.util.sql;

import java.util.HashMap;
import java.util.Map;


/**
 * Initialize Mysql dababase(include tables and data) from sybase, <br>
 * temporarily implement some simple functions, need enhance in future
 * @author oliverc
 * @version 0.99
 */
public class Sybase2Mysql {
	
	/**
	 * <code>key</code> represent sybase column type <br>
	 * <code>value</code> represent mysql column type 
	 */
	private static Map<String, String> columnTypeMapping;
	
	static {
		columnTypeMapping = new HashMap<String, String>();
		columnTypeMapping.put("money", "double");
	}
	
	public void doSelect() {
		
	}
	
	public void doInsert() {
	
	}
	
	public void doUpdate() {
		
	}
	
	public static void main(String[] args) {
	}
	
}
