package oliver.demo.dao.mysql.po;

import java.io.Serializable;

public class GlobalListBoxDetailId implements Serializable{

	private static final long serialVersionUID = -5685459876126544024L;
	private String listBoxCode;
	private String codeValue;
	private Integer cisServer;
	
	public GlobalListBoxDetailId() {
	}

	public GlobalListBoxDetailId(String listBoxCode, String codeValue, Integer cisServer) {
		this.listBoxCode = listBoxCode;
		this.codeValue = codeValue;
		this.cisServer = cisServer;
	}

	public String getListBoxCode() {
		return this.listBoxCode;
	}

	public void setListBoxCode(String listBoxCode) {
		this.listBoxCode = listBoxCode;
	}

	public String getCodeValue() {
		return this.codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public Integer getCisServer() {
		return cisServer;
	}

	public void setCisServer(Integer cisServer) {
		this.cisServer = cisServer;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GlobalListBoxDetailId))
			return false;
		GlobalListBoxDetailId castOther = (GlobalListBoxDetailId) other;

		return ((this.getListBoxCode() == castOther.getListBoxCode()) || (this
				.getListBoxCode() != null
				&& castOther.getListBoxCode() != null && this.getListBoxCode()
				.equals(castOther.getListBoxCode())))
				&& ((this.getCodeValue() == castOther.getCodeValue()) || (this
						.getCodeValue() != null
						&& castOther.getCodeValue() != null && this
						.getCodeValue().equals(castOther.getCodeValue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getListBoxCode() == null ? 0 : this.getListBoxCode()
						.hashCode());
		result = 37 * result
				+ (getCodeValue() == null ? 0 : this.getCodeValue().hashCode());
		return result;
	}
}
