package oliver.demo.common.util.sql;

import java.util.Arrays;
import java.util.Map;

import oliver.demo.common.util.Utils;
import oliver.demo.common.util.sql.api.ColumnInfo;
import oliver.demo.common.util.sql.api.SQLGenerator;
import oliver.demo.common.util.sql.api.TableInfo;

public abstract class AbstractSelectGenerator implements SQLGenerator {

	protected static String DEFAULT_SPLITTER = ", ";
	
	private TableInfo tableInfo;
	
	public AbstractSelectGenerator() {}
	
	public AbstractSelectGenerator(TableInfo tableInfo) {
		setTableInfo(tableInfo);
	}
	
	@Override
	public String generateSql(Map<String, String> params) {
		String sqlTemplate = "select %s from %s %s %s";
		String sql = String.format(sqlTemplate, 
				generateColumns(),
				generateTableName(),
				generateWhere(params),
				generateOrder());
		return sql;
	}
	
	@Override
	public TableInfo getTableInfo() {
		return tableInfo;
	}
	
	public void setTableInfo(TableInfo tableInfo) {
		this.tableInfo = tableInfo;
	}
	
	public abstract String generateWhere(Map<String, String> params);
	
	public abstract String[] getColumns2Filter();
	
	/*-------------------------Protected Methods--------------------------*/
	protected String generateTableName() {
		return getTableInfo().getDBName() + "." + getTableInfo().getTableName();
	}
	
	protected String generateOrder() {
		
		StringBuffer order = new StringBuffer();
		String splitter = ", ";
		for (ColumnInfo column : getTableInfo().getPrimaryKey()) {
			order.append(column.getName());
			order.append(splitter);
		}
		
		if (order.length() > splitter.length()) {
			order.insert(0, "order by ");
			order.delete(order.length() - splitter.length(), order.length());
		}
		return order.toString();
	}
	
	protected String transferParameter (String parameter) {
		
		String praseResult = parameter;
		try {
			Integer.parseInt(praseResult);
		} catch (Exception e) {
			praseResult = "'" + parameter + "'";
		}
		return praseResult;
	}
	
	protected String generateColumns() {
		
		TableInfo tableInfo = getTableInfo();
		StringBuffer columns = new StringBuffer("*");
		if (null != tableInfo && Utils.isNotEmpty(tableInfo.getColumns())) {
			
			columns.delete(0, columns.length());
			for (ColumnInfo column : tableInfo.getColumns()) {
				if (isValidateColumn(column.getName())) {
					columns.append(column);
					columns.append(DEFAULT_SPLITTER);
				}
			}
		}
		return columns.delete(columns.length() - DEFAULT_SPLITTER.length(), columns.length()).toString();
	}
	
	/*-----------------------Private Methods----------------------*/
	private boolean isValidateColumn(String column){
		
		String[] filterColumns = getColumns2Filter();
		if (Utils.isEmpty(filterColumns)) {
			return true;
		}
		return Arrays.asList(filterColumns).contains(column);
	}
	
}
