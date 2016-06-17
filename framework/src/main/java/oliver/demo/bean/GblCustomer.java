package oliver.demo.bean;

import java.util.Date;

public class GblCustomer {
    private Integer gblId;

    private Integer custNo;

    private Integer parentId;

    private Integer regionNo;

    private String custName;

    private Integer custType;

    private Integer salesTerr;

    private Integer entryId;

    private Date entryDatetime;

    private Date lastUpdateDatetime;

    private Integer hVersion;

    private String uVersion;

    public Integer getGblId() {
        return gblId;
    }

    public void setGblId(Integer gblId) {
        this.gblId = gblId;
    }

    public Integer getCustNo() {
        return custNo;
    }

    public void setCustNo(Integer custNo) {
        this.custNo = custNo;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getRegionNo() {
        return regionNo;
    }

    public void setRegionNo(Integer regionNo) {
        this.regionNo = regionNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public Integer getCustType() {
        return custType;
    }

    public void setCustType(Integer custType) {
        this.custType = custType;
    }

    public Integer getSalesTerr() {
        return salesTerr;
    }

    public void setSalesTerr(Integer salesTerr) {
        this.salesTerr = salesTerr;
    }

    public Integer getEntryId() {
        return entryId;
    }

    public void setEntryId(Integer entryId) {
        this.entryId = entryId;
    }

    public Date getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(Date entryDatetime) {
        this.entryDatetime = entryDatetime;
    }

    public Date getLastUpdateDatetime() {
        return lastUpdateDatetime;
    }

    public void setLastUpdateDatetime(Date lastUpdateDatetime) {
        this.lastUpdateDatetime = lastUpdateDatetime;
    }

    public Integer gethVersion() {
        return hVersion;
    }

    public void sethVersion(Integer hVersion) {
        this.hVersion = hVersion;
    }

    public String getuVersion() {
        return uVersion;
    }

    public void setuVersion(String uVersion) {
        this.uVersion = uVersion == null ? null : uVersion.trim();
    }
}