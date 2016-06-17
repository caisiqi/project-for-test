package oliver.demo.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import oliver.demo.common.util.Common;
import oliver.demo.dao.mysql.GlobalListBoxDetailDao;
import oliver.demo.dao.mysql.PPDCDetailDao;

@Service
public class XATransactionServiceImpl implements XATransactionService{

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private PPDCDetailDao ppdcDetailDao;
	
	@Autowired
	private GlobalListBoxDetailDao globalListBoxDetailDao;
	
	
	/**
	 * Deliberately throw an Exception to check distributed transaction works well
	 * @exception
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void fetchGlobalThenRemovePPDC() throws Exception{
		
		Map globalListBoxDetail = new HashMap();
		globalListBoxDetail.put("CisServer", 10000);
		globalListBoxDetail.put("list_box_code", "PPDC");
		globalListBoxDetail.put("code_value", "CODE_VALUE");
		globalListBoxDetail.put("code_desc", "CODE_VALUE_DESCRIPTION");
		globalListBoxDetail.put("activeFlag", "Y");
		globalListBoxDetail.put("sequence", 1);
		globalListBoxDetail.put("key1", 0);
		globalListBoxDetail.put("ref1", 0);
		globalListBoxDetail.put("ref2", 0);
		globalListBoxDetail.put("entry_datetime", new Date());
		globalListBoxDetail.put("entry_id", 759);
		globalListBoxDetail.put("delete_datetime", null);
		globalListBoxDetail.put("delete_id", null);
		globalListBoxDetail.put("update_datetime", null);
		globalListBoxDetail.put("h_version", 1);
		globalListBoxDetail.put("schedule_date", null);
		
		// 可以为空
		Map searchPPDCParams = new HashMap();
		
		List<Map> ppdcList = ppdcDetailDao.searchPartLevel(searchPPDCParams);
		logger.debug(String.format("ppdcList size: %s", Common.isEmpty(ppdcList) ? 0 : ppdcList.size()));
		
		String targetPartNo = "ACT-AMS-B16";
		boolean needThrowAnException = true;
		
		if (Common.isNotEmpty(ppdcList)) {
			for (Map ppdcDetail : ppdcList) {
				if (Common.isNotEmpty(ppdcDetail) 
						&& targetPartNo.equals(ppdcDetail.get("part_no"))) {
					
					logger.debug(String.format("find part_no %s and region_name is %s, do delete operation", targetPartNo, ppdcDetail.get("region_name")));
					Map deletePPDC = new HashMap();
					deletePPDC.put("region_name", ppdcDetail.get("region_name"));
					deletePPDC.put("part_no", targetPartNo);
					ppdcDetailDao.delete(deletePPDC);
					
					if (needThrowAnException) {
						throw new Exception("throw an exception");
					}
					break;
				}
			}
		}
		
		globalListBoxDetailDao.insert(globalListBoxDetail);
	
	}

}
