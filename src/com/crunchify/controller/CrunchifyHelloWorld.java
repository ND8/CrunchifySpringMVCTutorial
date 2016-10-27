package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CrunchifyHelloWorld {

		@RequestMapping("/welcome")
		public ModelAndView helloWorld(){
			
			String message = "<br><div style='text-align:center;'>"
					+ "<h3>******* Hello World, Spring MVC Turorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
			
			return new ModelAndView("welcome", "message", message);
		}
	
		//Note that we have annotated the CrunchifyHelloWorld class with @Controller and 
		//@RequestMapping("/welcome"). When Spring scans our package, it will recognise this bean as being a Controller bean for processing requests. 
		//The @RequestMapping annotation tells Spring that this Controller should process all requests beginning with /welcome in the URL path. 
		//That includes /welcome/* and /welcome.html.
		
		//The helloWorld() method returns ModelAndView object. The ModelAndView object tries to resolve to a view named “welcome” and the data model 
		//is being passed back to the browser so we can access the data 
		//within the JSP. The logical view name will resolve to /WEB-INF/jsp/welcome.jsp . 
		//Logical name “welcome” which is return in ModelAndView object is mapped to path /WEB-INF/jsp/welcome.jsp.
		
		
		//The ModelAndView object also contains a message with key “message” and Detailed value. This is the data that we are passing to our view. 
		//Normally this will be a value object in form of java bean that will contain the data to be displayed on our view. 
		//Here we are simply passing a string.
}
