package oliver.demo.service.vo;

import java.util.ArrayList;
import java.util.List;

import oliver.demo.common.util.Utils;
import oliver.demo.dao.sybase.po.MFGProjPlanningBom;

public class PPB {
	
	public static final int PART_CHECK_STATUS_SUCCESS = 0;
	public static final int PART_CHECK_STATUS_NO_EXTST = 1;
	public static final int PART_CHECK_STATUS_NO_ACTIVE = 2;
	public static final int PART_CHECK_STATUS_NO_MATCH_CUST = 3;

	private Integer id;
	private Integer treeId;
	private Integer topSkuNo;
	private Integer mfgProjId;
	private Integer parentId = -1;
	private String lineNo;
	private String groupName;
	private String preBuild;
	private Integer compQty;
	private Integer expandedBomQty;
	private String pr;
	
	/**for js add, delete*/
	private String status;
	
	/**new column from pml*/
	private String pmlStatus;
	
	private Integer allocModel;
	private Integer altPartPriority;
	private Float altPartPercentage;
	private String altPartGroup;
	private Double sparePercentage;
	private int spareQty;
	private String isProductPart;

	private PPB parent;
	private List<PPB> children = new ArrayList<PPB>();

	private Boolean isTop;
	private Integer level;
	private Boolean isEnd;
	private Boolean hasChild;
	private Boolean hasShortage;

	private String lifeCycle;

	private Integer partCheckStatus = PART_CHECK_STATUS_SUCCESS;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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

	public String getPmlStatus() {
		return pmlStatus;
	}

	public void setPmlStatus(String pmlStatus) {
		this.pmlStatus = pmlStatus;
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

	public Double getSparePercentage() {
		return sparePercentage;
	}

	public void setSparePercentage(Double sparePercentage) {
		this.sparePercentage = sparePercentage;
	}

	public int getSpareQty() {
		return spareQty;
	}

	public void setSpareQty(int spareQty) {
		this.spareQty = spareQty;
	}

	public String getIsProductPart() {
		return isProductPart;
	}

	public void setIsProductPart(String isProductPart) {
		this.isProductPart = isProductPart;
	}

	public PPB getParent() {
		return parent;
	}

	public void setParent(PPB parent) {
		this.parent = parent;
	}

	public List<PPB> getChildren() {
		return children;
	}

	public void setChildren(List<PPB> children) {
		this.children = children;
	}

	public Boolean getIsTop() {
		return isTop;
	}

	public void setIsTop(Boolean isTop) {
		this.isTop = isTop;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Boolean getIsEnd() {
		return isEnd;
	}

	public void setIsEnd(Boolean isEnd) {
		this.isEnd = isEnd;
	}

	public Boolean getHasChild() {
		return hasChild;
	}

	public void setHasChild(Boolean hasChild) {
		this.hasChild = hasChild;
	}

	public Boolean getHasShortage() {
		return hasShortage;
	}

	public void setHasShortage(Boolean hasShortage) {
		this.hasShortage = hasShortage;
	}

	public String getLifeCycle() {
		return lifeCycle;
	}

	public void setLifeCycle(String lifeCycle) {
		this.lifeCycle = lifeCycle;
	}

	public Integer getPartCheckStatus() {
		return partCheckStatus;
	}

	public void setPartCheckStatus(Integer partCheckStatus) {
		this.partCheckStatus = partCheckStatus;
	}
	
	public PPB(){}
	
	public PPB(MFGProjPlanningBom bom){
		this.treeId = bom.getTreeId();
		this.topSkuNo = bom.getTopSkuNo();
		this.mfgProjId = bom.getMfgProjId();
		this.parentId = bom.getParentId();
		this.lineNo = bom.getLineNo();
        this.lifeCycle = bom.getLifeCycle();
		this.spareQty = bom.getSpareQty();
		this.sparePercentage = bom.getSparePercentage();
		if(bom.getPreBuild() == null){
            this.preBuild = "N";
        }else{
            this.preBuild = bom.getPreBuild();
        }

		this.compQty = bom.getCompQty();
		this.expandedBomQty = bom.getExpandedBomQty();
		if (bom.getPr() == null) {
			this.pr = "Y";
		} else {
			this.pr = bom.getPr();
		}
		this.pmlStatus = bom.getStatus();
		if (Utils.isBlank(bom.getAltPartGroup())) {
			this.allocModel = null;
			this.altPartPriority = null;
			this.altPartPercentage = null;
			this.altPartGroup = null;
		} else {
			this.allocModel = bom.getAllocModel();
			this.altPartPriority = bom.getAltPartPriority();
			this.altPartPercentage = bom.getAltPartPercentage();
			this.altPartGroup = bom.getAltPartGroup();
		}
	}
	
	public static List<PPB> convert(List<MFGProjPlanningBom> boms){
		List<PPB> ppbs = new ArrayList<PPB>();
		if(Utils.isNotEmpty(boms)){
			for(MFGProjPlanningBom bom : boms){
				ppbs.add(new PPB(bom));
			}
		}
		return ppbs;
	}
	
}
