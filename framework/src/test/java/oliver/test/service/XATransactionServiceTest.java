package oliver.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import oliver.demo.service.XATransactionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-test-base.xml" 
		, "classpath*:applicationContext-datasource-atomikos.xml"
		, "classpath*:applicationContext-datasource.xml"
		, "classpath*:applicationContext-persistence.xml" })
public class XATransactionServiceTest {

	@Autowired
	private XATransactionService xaTransactionService;
	
	@Test
	public void testFetchGlobalThenRemovePPDC() throws Exception {
		xaTransactionService.fetchGlobalThenRemovePPDC();
	}
	
}
