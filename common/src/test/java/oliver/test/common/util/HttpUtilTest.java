package oliver.test.common.util;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import oliver.demo.common.util.HttpHelper;

public class HttpUtilTest {

	//@Test
	public void testGetJSON(){
		String url = "http://testhyve-bom-api.hyvesolutions.org/eng_bom_api/synnex/get_bom?bom_attribute=planning_bom&part_revision_id=25695";
		String json = JSON.toJSONString(HttpHelper.getJSON(url));
		System.out.println(json);
	}
	
}
