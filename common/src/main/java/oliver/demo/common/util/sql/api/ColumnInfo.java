package oliver.demo.common.util.sql.api;

public interface ColumnInfo {

	/**
	 * get column name 
	 */
	String getName();
	
	/**
	 * get column type 
	 */
	String getType();
	
	/**
	 * get column length 
	 */
	Integer getLength();
	
}
