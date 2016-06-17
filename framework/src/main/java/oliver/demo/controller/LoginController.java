package oliver.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import oliver.demo.common.exception.ArgumentException;
import oliver.demo.exception.AuthException;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login(){
		return new ModelAndView();
	}
	
	@RequestMapping("/fail500")
	public ModelAndView fail500() throws Exception{
		throw new ArgumentException();
	}
	
	@RequestMapping("/fail403")
	public ModelAndView fail403() throws Exception{
		throw new AuthException();
	}
	
}
