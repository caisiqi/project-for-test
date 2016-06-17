package oliver.demo.plugin;

import org.apache.ibatis.plugin.Interceptor;

public interface PagePlugin extends Interceptor {

	public int pageTotal();
	
}
