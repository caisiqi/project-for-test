package oliver.test.dao.sybase;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import oliver.demo.dao.sybase.ProjectDao;
import oliver.test.dao.DBUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext-test-base.xml",
		"classpath*:applicationContext-datasource.xml",
		"classpath*:applicationContext-persistence.xml"})
public class ProjectDaoTest{

	@Autowired
	private ProjectDao projectDao;
	
	//使用@BeforeClass注解的方法必须是public static方法
	@org.junit.BeforeClass
	public static void prepare(){
		//Deprecated
		//DataSource dataSource = (DataSource) context.getBean("dataSource");
		try {
			Connection connection = DBUtil.getConnection();
			PreparedStatement ps0 = connection.prepareStatement(DBUtil.getSQL("delete.project.by.projno"));
			ps0.setString(1, "JUNIT_TEST");
			ps0.execute();
			
			PreparedStatement ps1 = connection.prepareStatement(DBUtil.getSQL("insert.project"));
			ps1.setString(1, "JUNIT_TEST");
			ps1.setInt(2, 554401);
			ps1.setInt(3, -1);
			ps1.setDate(4, new Date(System.currentTimeMillis()));
			ps1.setDate(5, new Date(System.currentTimeMillis()));
			ps1.setDate(6, new Date(System.currentTimeMillis() + 86400*30));
			ps1.execute();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	//使用@AfterClass注解的方法必须是public static方法
	@org.junit.AfterClass
	public static void cleanup(){
		//DataSource dataSource = (DataSource) context.getBean("dataSource");
		try {
			PreparedStatement ps = DBUtil.getConnection().prepareStatement(DBUtil.getSQL("delete.project.by.projno"));
			ps.setString(1, "JUNIT_TEST");
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	/*
	The Test annotation supports two optional parameters. The first, expected, declares that a test method should throw an exception. If it doesn't throw an exception or if it throws a different exception than the one declared, the test fails. For example, the following test succeeds:
    @Test(expected=IndexOutOfBoundsException.class) public void outOfBounds() {
       new ArrayList<Object>().get(1);
    } 
    @Test(timeout=1000*10)
    public void outOfTime(){
    	Thread.sleep(1000*11);
    }
	*/
	@Test
	@SuppressWarnings("rawtypes")
	public void testFindById(){
		Integer projId = 3980;
		Map project = projectDao.findById(projId);
		System.out.println(JSON.toJSONString(project));
		Assert.assertEquals("QCTEST 1", project.get("mfg_proj_ref_no"));
		Assert.assertEquals(554401, project.get("cust_no"));
	}
	
	@Test
	@SuppressWarnings("rawtypes")
	public void testFindByNo(){
		String projNo = "QCTEST 1";
		Map project = projectDao.findByNo(projNo);
		System.out.println(JSON.toJSONString(project));
		Assert.assertEquals(3980, project.get("mfg_proj_id"));
	}
	
}
