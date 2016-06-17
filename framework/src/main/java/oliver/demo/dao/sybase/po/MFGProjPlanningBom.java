package oliver.demo.dao.sybase.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MFGProjPlanningBom {
	
	private Integer treeId;
	private Integer topSkuNo;
	private Integer mfgProjId;
	private Integer parentId;
	private MRPPartMaster part;
	private String lineNo;
	private String preBuild;
	private Integer compQty;
	private Integer expandedBomQty;
	private String pr;
	// new column from pml
	private String status;
	private Integer allocModel;
	private Integer altPartPriority;
	private Float altPartPercentage;
	private String altPartGroup;
	
	private Date entryDate;
	private ManagerLightWeight entryUser;
	private Date updateDate;
	private ManagerLightWeight updateUser;
	private MFGProjPlanningBom parent;
	private String lifeCycle;
	private Double sparePercentage;
	private Integer spareQty = 0;
	private List<MFGProjPlanningBom> children = new ArrayList<MFGProjPlanningBom>();
	
	public Integer getTreeId() {
		return treeId;
	}
	
	public void setTreeId(Integer treeId) {
		this.treeId = treeId;
	}
	
	public Integer getTopSkuNo() {
		return topSkuNo;
	}
	
	public void setTopSkuNo(Integer topSkuNo) {
		this.topSkuNo = topSkuNo;
	}
	
	public Integer getMfgProjId() {
		return mfgProjId;
	}
	
	public void setMfgProjId(Integer mfgProjId) {
		this.mfgProjId = mfgProjId;
	}
	
	public Integer getParentId() {
		return parentId;
	}
	
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	public MRPPartMaster getPart() {
		return part;
	}
	
	public void setPart(MRPPartMaster part) {
		this.part = part;
	}
	
	public String getLineNo() {
		return lineNo;
	}
	
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
	
	public String getPreBuild() {
		return preBuild;
	}
	
	public void setPreBuild(String preBuild) {
		this.preBuild = preBuild;
	}
	
	public Integer getCompQty() {
		return compQty;
	}
	
	public void setCompQty(Integer compQty) {
		this.compQty = compQty;
	}
	
	public Integer getExpandedBomQty() {
		return expandedBomQty;
	}
	
	public void setExpandedBomQty(Integer expandedBomQty) {
		this.expandedBomQty = expandedBomQty;
	}
	
	public String getPr() {
		return pr;
	}
	
	public void setPr(String pr) {
		this.pr = pr;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Integer getAllocModel() {
		return allocModel;
	}
	
	public void setAllocModel(Integer allocModel) {
		this.allocModel = allocModel;
	}
	
	public Integer getAltPartPriority() {
		return altPartPriority;
	}
	
	public void setAltPartPriority(Integer altPartPriority) {
		this.altPartPriority = altPartPriority;
	}
	
	public Float getAltPartPercentage() {
		return altPartPercentage;
	}
	
	public void setAltPartPercentage(Float altPartPercentage) {
		this.altPartPercentage = altPartPercentage;
	}
	
	public String getAltPartGroup() {
		return altPartGroup;
	}
	
	public void setAltPartGroup(String altPartGroup) {
		this.altPartGroup = altPartGroup;
	}
	
	public Date getEntryDate() {
		return entryDate;
	}
	
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	
	public ManagerLightWeight getEntryUser() {
		return entryUser;
	}
	
	public void setEntryUser(ManagerLightWeight entryUser) {
		this.entryUser = entryUser;
	}
	
	public Date getUpdateDate() {
		return updateDate;
	}
	
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public ManagerLightWeight getUpdateUser() {
		return updateUser;
	}
	
	public void setUpdateUser(ManagerLightWeight updateUser) {
		this.updateUser = updateUser;
	}
	
	public MFGProjPlanningBom getParent() {
		return parent;
	}
	
	public void setParent(MFGProjPlanningBom parent) {
		this.parent = parent;
	}
	
	public List<MFGProjPlanningBom> getChildren() {
		return children;
	}
	
	public void setChildren(List<MFGProjPlanningBom> children) {
		this.children = children;
	}
	
	public String getLifeCycle() {
		return lifeCycle;
	}

	public void setLifeCycle(String lifeCycle) {
		this.lifeCycle = lifeCycle;
	}

	public Double getSparePercentage() {
		return sparePercentage;
	}

	public void setSparePercentage(Double sparePercentage) {
		this.sparePercentage = sparePercentage;
	}

	public Integer getSpareQty() {
		return spareQty;
	}

	public void setSpareQty(Integer spareQty) {
		this.spareQty = spareQty;
	}
	
	
	
}
