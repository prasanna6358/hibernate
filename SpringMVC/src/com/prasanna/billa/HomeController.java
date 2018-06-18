package com.prasanna.billa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView showPage() {
		ModelAndView mav = new ModelAndView();
		 mav.setViewName("message");
		 return mav;
	}
}
