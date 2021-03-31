package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//Simple Method
	//URI - /helloworld
	//GET 
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld") //SI PONGO http://localhost:8080/helloworld EN EL EXPLORADOR ME APARECE EL STRING DE ABAJO
	@GetMapping("/helloworld1") //SI PONGO http://localhost:8080/helloworld1 EN EL EXPLORADOR ME APARECE EL STRING DE ABAJO
	public String HelloWorld(){
		
		return "Hello World";
	}

	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		
		return new UserDetails("Maria", "Schmidt", "Argentina");
		
	}
}
