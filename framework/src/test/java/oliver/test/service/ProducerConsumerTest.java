package oliver.test.service;

import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import oliver.demo.service.ProducerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-test-base.xml",
		"classpath*:applicationContext-datasource.xml",
		"classpath*:applicationContext-persistence.xml",
		"classpath*:applicationContext-jms.xml"})
public class ProducerConsumerTest {

	@Autowired
	private ProducerService producerService;
	
	@Autowired
	@Qualifier("queueDestination")
	private Destination destination;

	@Test
	public void testSend() {
		for (int i = 0; i < 2; i++) {
			producerService.sendMessage(destination, "你好，生产者！这是消息：" + (i + 1));
		}
	}

}
