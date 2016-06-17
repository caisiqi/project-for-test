package oliver.test.service;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import oliver.demo.service.ProjectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-test-base.xml" 
		, "classpath*:applicationContext-datasource.xml"
		, "classpath*:applicationContext-persistence.xml" })
public class ProjectServiceTest {

	@Autowired
	private ProjectService projectService;
	
	//@Test
	public void testCRUD(){
		
		Mockito.mock(String.class);
		Mockito.mock(String.class, new Answer<String>() {

			@Override
			public String answer(InvocationOnMock invocation) throws Throwable {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		Mockito.spy(new Object());
		Mockito.anyList();
		
		Mockito.doReturn("").when("");
		Mockito.when("").thenAnswer(new Answer<String>() {

			@Override
			public String answer(InvocationOnMock invocation) throws Throwable {
				// TODO Auto-generated method stub
				invocation.getArguments();
				invocation.getMethod();
				invocation.getMock();
				return null;
			}
		});
		
	}
	
	@Test
	public void testPage() {
		Map params = new HashMap<>();
		params.put("rows", "10");
		params.put("page", "2");
		Map page = projectService.page(params);
		
		System.out.println(JSON.toJSONString(page));
	}
	
}
