package com.app.soft;

import java.util.Map;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello(@RequestParam(value = "name", required = false)  String name) {
		return "hello world "+name;
	}
	 
	 @RequestMapping(value = "/show", method = RequestMethod.POST)
		public String showPage(@RequestBody Map<String, Object> json) {
		String personName = json.get("name").toString();
		System.out.println(personName);	
		 return "hello world "+personName;
		}
	 
	 
}
