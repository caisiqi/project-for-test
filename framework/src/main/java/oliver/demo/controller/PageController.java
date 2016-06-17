package oliver.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * 转发请求到jsp页面 
 */
@Controller
public class PageController {

	Log logger = LogFactory.getLog(getClass().getName());
	
	@RequestMapping("/page/{pageName}")
	public ModelAndView getPage(@PathVariable String pageName){
		
		logger.debug(String.format(">>>>>> enter PageController.page() method return ModelAndView(%s)", "page" + pageName)); 
		return new ModelAndView("page/" + pageName);
	}
	
}
