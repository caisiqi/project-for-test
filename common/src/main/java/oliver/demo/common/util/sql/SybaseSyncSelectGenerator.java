package oliver.demo.common.util.sql;

import java.util.Map;

import oliver.demo.common.util.sql.api.ColumnInfo;

public class SybaseSyncSelectGenerator extends AbstractSelectGenerator {

	private String[] columns2Filter;
	
	@Override
	public String generateWhere(Map<String, String> params) {
		
		ColumnInfo[] columns = getTableInfo().getPrimaryKey();
		StringBuffer where = new StringBuffer();
		where.append(" where ");
		if (null != columns && columns.length > 0) {
			String columnName = columns[0].getName();
			where.append(columnName).append(" > ").append(transferParameter(params.get(columnName)));
			for (int i = 0; i < columns.length - 1; i++) {
				where.append(" or (");
				for (int j = 0; j < columns.length - i; j++) {
					columnName = columns[j].getName();
					where.append(columnName).append(" = ").append(transferParameter(params.get(columnName)));
					where.append(" and ");
				}
				where.delete(where.length() - " where".length(), where.length());
				where.replace(where.lastIndexOf("="), where.lastIndexOf("=") + 1, ">");
				where.append(") ");
			}
		}
		return where.length() == 5 ? "" : where.toString();
	}

	@Override
	public String[] getColumns2Filter() {
		return columns2Filter;
	}
	
	public void setColumns2Filter(String[] columns2Filter) {
		this.columns2Filter = columns2Filter;
	}
	
}
