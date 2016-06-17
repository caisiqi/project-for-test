package oliver.test.dao.sybase;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import oliver.demo.dao.sybase.PartMasterDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-test-base.xml" 
		, "classpath*:applicationContext-datasource.xml"
		, "classpath*:applicationContext-persistence.xml" })
public class PartMasterDaoTest {

	@Autowired
	private PartMasterDao partMasterDao;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testUpdate(){
		Map params = new HashMap();
		params.put("part_no", "APC-MX3000");
		params.put("po_cost", 1);
		partMasterDao.update(params);
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void testFindByPartNo(){
		Map partMaster = partMasterDao.findByPartNo("APC-MX3000");
		System.out.println(JSON.toJSONString(partMaster));
	}
	
}
