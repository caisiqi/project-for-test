package oliver.test.dao.mysql;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import oliver.demo.bean.PpdcDetailExample;
import oliver.demo.dao.mysql.PPDCDetailDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-test-base.xml" 
		, "classpath*:applicationContext-datasource.xml"
		, "classpath*:applicationContext-datasource-atomikos.xml"
		, "classpath*:applicationContext-persistence.xml" })
public class PPDCDetailDaoTest {

	@Autowired
	private PPDCDetailDao ppdcDetailDao;
	
	@Test
	@SuppressWarnings("rawtypes")
	public void testSearchPartLevel() {
		List<Map> list = ppdcDetailDao.searchPartLevel(null);
		System.out.println("ppdc_detail size " + list.size());
		if (null != list && !list.isEmpty()) {
			System.out.println(JSON.toJSONString(list.subList(0, 100)));
		}
		else {
			System.out.println("result is empty!");
		}
	}
	
	@Test
	public void testCountByExample() {
		PpdcDetailExample example = new PpdcDetailExample();
		example.or().andRegionNoIn(Arrays.asList(10000, 10001));
		int count = ppdcDetailDao.countByExample(example);
		System.out.println("condition restricted ppdc_detail size " + count);
	}
	
}
