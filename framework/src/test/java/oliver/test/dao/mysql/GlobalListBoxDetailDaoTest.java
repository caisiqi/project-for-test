package oliver.test.dao.mysql;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import oliver.demo.dao.mysql.GlobalListBoxDetailDao;
import oliver.demo.dao.mysql.po.GlobalListBoxDetail;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-test-base.xml" 
		, "classpath*:applicationContext-datasource.xml"
		, "classpath*:applicationContext-persistence.xml" })
public class GlobalListBoxDetailDaoTest {
	
	@Autowired
	private GlobalListBoxDetailDao globalListBoxDetailDao;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testFind() {
		Map params = new HashMap();
		params.put("cisServer", 4);
		params.put("listBoxCode", "otol");
		List<GlobalListBoxDetail> list = globalListBoxDetailDao.find(params);
	
		System.out.println("list.size(): " + list.size());
		if(null != list && !list.isEmpty()) {
			System.out.println(JSON.toJSONString(list));
		}
	}
	
}
