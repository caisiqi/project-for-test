package oliver.demo.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class MapArgumentResolver implements HandlerMethodArgumentResolver {
	
	private Log logger = LogFactory.getLog(getClass().getName());
	
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		// TODO Auto-generated method stub
		boolean support = Map.class.isAssignableFrom(parameter.getParameterType());
		logger.debug(String.format("parameter{name:%s, type:%s, support:%s}", parameter.getParameterName(),
				parameter.getParameterType(), String.valueOf(support)));

		return support;
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
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
