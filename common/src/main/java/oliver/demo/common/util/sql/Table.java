package oliver.demo.common.util.sql;

import oliver.demo.common.util.sql.api.ColumnInfo;
import oliver.demo.common.util.sql.api.TableInfo;

public class Table implements TableInfo {
	
	private String dbName;
	
	private String tableName;
	
	private ColumnInfo[] columns;
	
	private ColumnInfo[] primaryKey;
	
	private ColumnInfo autoIncrement;
	
	
	public void setDBName(String dbName) {
		this.dbName = dbName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public void setColumns(ColumnInfo[] columns) {
		this.columns = columns;
	}

	public void setPrimaryKey(ColumnInfo[] primaryKey) {
		this.primaryKey = primaryKey;
	}

	public void setAutoIncrement(ColumnInfo autoIncrement) {
		this.autoIncrement = autoIncrement;
	}

	@Override
	public String getDBName() {
		return dbName;
	}

	@Override
	public String getTableName() {
		return tableName;
	}

	@Override
	public ColumnInfo[] getColumns() {
		return columns;
	}

	@Override
	public ColumnInfo[] getPrimaryKey() {
		return primaryKey;
	}

	@Override
	public ColumnInfo getAutoIncrement() {
		return autoIncrement;
	}

}
