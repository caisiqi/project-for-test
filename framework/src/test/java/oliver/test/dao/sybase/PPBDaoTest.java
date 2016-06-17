package oliver.test.dao.sybase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import oliver.demo.dao.sybase.PPBDao;
import oliver.demo.dao.sybase.po.MFGProjPlanningBom;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext-test-base.xml",
		"classpath*:applicationContext-datasource.xml",
		"classpath*:applicationContext-persistence.xml"})
public class PPBDaoTest{

	@Autowired
	private PPBDao dao;
	
	@BeforeClass
	public static void prepare(){
//		do nothing
	}
	
	@AfterClass
	public static void cleanup(){
//		do nothing
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testFind(){
		Map params = new HashMap();
		params.put("treeId", 24681);
		List<MFGProjPlanningBom> list = dao.find(params);
		System.out.println(String.format("List size %d", list.size()));
		System.out.println(JSON.toJSONString(list));
	}
	
}
