package oliver.demo.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

public class MyWebArgumentResolver implements WebArgumentResolver {

	@Override
	public Object resolveArgument(MethodParameter methodParameter, NativeWebRequest webRequest) throws Exception {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		Iterator<String> it = webRequest.getParameterNames();
		while (it.hasNext()) {
			String key = it.next();
			map.put(key, webRequest.getParameter(key));
		}
		return map;
	}

}
