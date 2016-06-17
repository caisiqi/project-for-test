package oliver.test.dao.sybase;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import oliver.demo.dao.sybase.ConfigDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext-test-base.xml",
		"classpath*:applicationContext-datasource.xml",
		"classpath*:applicationContext-persistence.xml",})
public class ConfigDaoTest {
	
	@Autowired
	private ConfigDao configDao;
	
	@SuppressWarnings("rawtypes")
	@Test
	public void testGetFTPConfig() {
		
		Map config = configDao.getFTPConfig();
		System.out.println(JSON.toJSONString(config));
		//Assert.assertEquals("21", config.get("ftp.server.port"));
	}
	
}
