package oliver.demo.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.webflow.core.FlowException;
import org.springframework.webflow.execution.FlowExecutionOutcome;
import org.springframework.webflow.mvc.servlet.AbstractFlowHandler;

public class ProjectWizardHandler extends AbstractFlowHandler {

	@Override
	public String handleExecutionOutcome(FlowExecutionOutcome outcome, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		return super.handleExecutionOutcome(outcome, request, response);
	}

	@Override
	public String handleException(FlowException e, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return super.handleException(e, request, response);
	}
	
	
}
