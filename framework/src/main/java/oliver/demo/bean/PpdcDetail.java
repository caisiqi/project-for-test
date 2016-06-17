package oliver.demo.bean;

import java.math.BigDecimal;
import java.util.Date;

public class PpdcDetail {
    private Integer ppdcDetailId;

    private String reqId;

    private String partNo;

    private Integer vendNo;

    private String vendName;

    private Integer poVendNo;

    private String poVendName;

    private Date ppdcSugEtaDate;

    private Integer leadTime;

    private String ppdcReasonCode;

    private String ppdcAction;

    private Integer ppdcActionQty;

    private Integer custNo;

    private String custName;

    private String model;

    private Integer locNo;

    private String locChar;

    private Integer orderNo;

    private Integer orderType;

    private Integer orderLineNo;

    private Integer openQty;

    private Date eta;

    private String etaCode;

    private Integer moq;

    private Integer econQty;

    private BigDecimal sysCost;

    private BigDecimal extCost;

    private Integer regionNo;

    private String regionName;

    private Integer iqcQty;

    private Integer rtvnQty;

    private Integer hVersion;

    private Integer entryId;

    private Date entryDatetime;

    private Integer ppdcNewCustNo;

    private Integer ppdcNewLocNo;

    private Integer ppdcNewRegionNo;

    public Integer getPpdcDetailId() {
        return ppdcDetailId;
    }

    public void setPpdcDetailId(Integer ppdcDetailId) {
        this.ppdcDetailId = ppdcDetailId;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId == null ? null : reqId.trim();
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo == null ? null : partNo.trim();
    }

    public Integer getVendNo() {
        return vendNo;
    }

    public void setVendNo(Integer vendNo) {
        this.vendNo = vendNo;
    }

    public String getVendName() {
        return vendName;
    }

    public void setVendName(String vendName) {
        this.vendName = vendName == null ? null : vendName.trim();
    }

    public Integer getPoVendNo() {
        return poVendNo;
    }

    public void setPoVendNo(Integer poVendNo) {
        this.poVendNo = poVendNo;
    }

    public String getPoVendName() {
        return poVendName;
    }

    public void setPoVendName(String poVendName) {
        this.poVendName = poVendName == null ? null : poVendName.trim();
    }

    public Date getPpdcSugEtaDate() {
        return ppdcSugEtaDate;
    }

    public void setPpdcSugEtaDate(Date ppdcSugEtaDate) {
        this.ppdcSugEtaDate = ppdcSugEtaDate;
    }

    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
    }

    public String getPpdcReasonCode() {
        return ppdcReasonCode;
    }

    public void setPpdcReasonCode(String ppdcReasonCode) {
        this.ppdcReasonCode = ppdcReasonCode == null ? null : ppdcReasonCode.trim();
    }

    public String getPpdcAction() {
        return ppdcAction;
    }

    public void setPpdcAction(String ppdcAction) {
        this.ppdcAction = ppdcAction == null ? null : ppdcAction.trim();
    }

    public Integer getPpdcActionQty() {
        return ppdcActionQty;
    }

    public void setPpdcActionQty(Integer ppdcActionQty) {
        this.ppdcActionQty = ppdcActionQty;
    }

    public Integer getCustNo() {
        return custNo;
    }

    public void setCustNo(Integer custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Integer getLocNo() {
        return locNo;
    }

    public void setLocNo(Integer locNo) {
        this.locNo = locNo;
    }

    public String getLocChar() {
        return locChar;
    }

    public void setLocChar(String locChar) {
        this.locChar = locChar == null ? null : locChar.trim();
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderLineNo() {
        return orderLineNo;
    }

    public void setOrderLineNo(Integer orderLineNo) {
        this.orderLineNo = orderLineNo;
    }

    public Integer getOpenQty() {
        return openQty;
    }

    public void setOpenQty(Integer openQty) {
        this.openQty = openQty;
    }

    public Date getEta() {
        return eta;
    }

    public void setEta(Date eta) {
        this.eta = eta;
    }

    public String getEtaCode() {
        return etaCode;
    }

    public void setEtaCode(String etaCode) {
        this.etaCode = etaCode == null ? null : etaCode.trim();
    }

    public Integer getMoq() {
        return moq;
    }

    public void setMoq(Integer moq) {
        this.moq = moq;
    }

    public Integer getEconQty() {
        return econQty;
    }

    public void setEconQty(Integer econQty) {
        this.econQty = econQty;
    }

    public BigDecimal getSysCost() {
        return sysCost;
    }

    public void setSysCost(BigDecimal sysCost) {
        this.sysCost = sysCost;
    }

    public BigDecimal getExtCost() {
        return extCost;
    }

    public void setExtCost(BigDecimal extCost) {
        this.extCost = extCost;
    }

    public Integer getRegionNo() {
        return regionNo;
    }

    public void setRegionNo(Integer regionNo) {
        this.regionNo = regionNo;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public Integer getIqcQty() {
        return iqcQty;
    }

    public void setIqcQty(Integer iqcQty) {
        this.iqcQty = iqcQty;
    }

    public Integer getRtvnQty() {
        return rtvnQty;
    }

    public void setRtvnQty(Integer rtvnQty) {
        this.rtvnQty = rtvnQty;
    }

    public Integer gethVersion() {
        return hVersion;
    }

    public void sethVersion(Integer hVersion) {
        this.hVersion = hVersion;
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

    public Integer getPpdcNewCustNo() {
        return ppdcNewCustNo;
    }

    public void setPpdcNewCustNo(Integer ppdcNewCustNo) {
        this.ppdcNewCustNo = ppdcNewCustNo;
    }

    public Integer getPpdcNewLocNo() {
        return ppdcNewLocNo;
    }

    public void setPpdcNewLocNo(Integer ppdcNewLocNo) {
        this.ppdcNewLocNo = ppdcNewLocNo;
    }

    public Integer getPpdcNewRegionNo() {
        return ppdcNewRegionNo;
    }

    public void setPpdcNewRegionNo(Integer ppdcNewRegionNo) {
        this.ppdcNewRegionNo = ppdcNewRegionNo;
    }
}