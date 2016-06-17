package oliver.demo.dao.mysql.po;

import java.io.Serializable;
import java.util.Date;

public class GlobalListBoxDetail implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 4765498237047132267L;
	private GlobalListBoxDetailId id;
	private Integer hVersion;
	private String codeDesc;
	private char activeFlag;
	private Integer sequence;
	private Integer key1;
	private Integer ref1;
	private Integer ref2;
	private Date entryDatetime;
	private Date deleteDatetime;
	private int entryId;

	public GlobalListBoxDetailId getId() {
		return id;
	}

	public void setId(GlobalListBoxDetailId id) {
		this.id = id;
	}

	public Integer gethVersion() {
		return hVersion;
	}

	public void sethVersion(Integer hVersion) {
		this.hVersion = hVersion;
	}

	public String getCodeDesc() {
		return codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public char getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(char activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public Integer getKey1() {
		return key1;
	}

	public void setKey1(Integer key1) {
		this.key1 = key1;
	}

	public Integer getRef1() {
		return ref1;
	}

	public void setRef1(Integer ref1) {
		this.ref1 = ref1;
	}

	public Integer getRef2() {
		return ref2;
	}

	public void setRef2(Integer ref2) {
		this.ref2 = ref2;
	}

	public Date getEntryDatetime() {
		return entryDatetime;
	}

	public void setEntryDatetime(Date entryDatetime) {
		this.entryDatetime = entryDatetime;
	}

	public Date getDeleteDatetime() {
		return deleteDatetime;
	}

	public void setDeleteDatetime(Date deleteDatetime) {
		this.deleteDatetime = deleteDatetime;
	}

	public int getEntryId() {
		return entryId;
	}

	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}

}
