package com.in28minutes.res.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller> This makes a controller that handles REST Request
@RestController
public class HelloWorldController {

	//GET
	//URI - /hello world
	//method - "Hello World
	//@RequestMapping(method=RequestMethod.GET, path="/hello-world") 
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {		
		return new HelloWorldBean("Hello World - Luis");
	}
	
	//hello-world/path-variable/in28minutes
	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {		
		return new HelloWorldBean(String.format("Hello World , %s", name));
	}
	
}
