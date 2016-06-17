package oliver.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.webflow.executor.FlowExecutor;
import org.springframework.webflow.mvc.servlet.FlowController;

@Controller
@RequestMapping("/simpleWizard")
public class ProjectWizardController extends FlowController{

	@Autowired
	@Override
	public void setFlowExecutor(FlowExecutor flowExecutor) {
		// TODO Auto-generated method stub
		super.setFlowExecutor(flowExecutor);
	}
	
}
