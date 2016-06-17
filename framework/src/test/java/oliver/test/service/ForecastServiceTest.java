package oliver.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import oliver.demo.service.ForecastService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext-test-base.xml",
		"classpath*:applicationContext-datasource.xml",
		"classpath*:applicationContext-persistence.xml"})
public class ForecastServiceTest {
	
	@Autowired
	private ForecastService forecastService;
	
	@Test
	public void testGetFcstByProjId() {
		
		Integer projId = 751;
		System.out.println(JSON.toJSONString(forecastService.getFcstByProjId(projId)));
	}
	
}
