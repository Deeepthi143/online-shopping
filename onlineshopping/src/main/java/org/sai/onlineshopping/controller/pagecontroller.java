package org.sai.onlineshopping.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pagecontroller {
	
	@RequestMapping(value = {"/","/index","/home"})	
	
		public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Online Shopping Home Page");
		return mv;
				
	}
		



}
