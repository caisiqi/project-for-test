package oliver.demo.common.util.sql.api;

/**
 * @version 0.99
 */
public interface TableInfo {

	/**
	 * get dbname that will use 
	 */
	String getDBName();
	
	/**
	 * get table name 
	 */
	String getTableName();
	
	/**
	 * get column names
	 */
	ColumnInfo[] getColumns();
	
	/**
	 * get primary key 
	 */
	ColumnInfo[] getPrimaryKey();
	
	/**
	 * get auto_increment 
	 */
	ColumnInfo getAutoIncrement();

}
