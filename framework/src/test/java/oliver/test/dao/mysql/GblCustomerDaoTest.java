package oliver.test.dao.mysql;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import oliver.demo.bean.GblCustomer;
import oliver.demo.common.util.Common;
import oliver.demo.dao.mysql.GblCustomerDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-test-base.xml",
		"classpath*:applicationContext-datasource.xml",
		"classpath*:applicationContext-persistence.xml",
		"classpath*:applicationContext-datasource-atomikos.xml",
		"classpath*:applicationContext-jms.xml" })
public class GblCustomerDaoTest {

	@Autowired
	private GblCustomerDao gblCustomerDao;
	
	@Test
	public void testSelectAllGblCustomer() {
		List<GblCustomer> allGblCustomer = gblCustomerDao.selectAllGblCustomer();
		if (Common.isNotEmpty(allGblCustomer)) {
			System.out.println("allGblCustomer size: " + allGblCustomer.size());
			System.out.println(JSON.toJSONString(allGblCustomer.subList(0, 1)));
			return;
		}
		System.out.println("allGblCustomer size: 0");
	}
}
