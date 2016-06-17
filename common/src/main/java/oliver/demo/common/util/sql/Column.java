package oliver.demo.common.util.sql;

import oliver.demo.common.util.sql.api.ColumnInfo;

public class Column implements ColumnInfo {

	private String name;
	
	private String type;
	
	private Integer length;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public Integer getLength() {
		return length;
	}

}
