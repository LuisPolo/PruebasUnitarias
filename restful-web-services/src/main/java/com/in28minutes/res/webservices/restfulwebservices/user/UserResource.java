package com.in28minutes.res.webservices.restfulwebservices.user;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

@RestController
public class UserResource {

	//Get/users
	//retrieveAllUserResource
	@Autowired
	private UserDaoService service;
	
	@GetMapping(path="/users")
	public List<User> listofUsers(){		
		//return new UserDaoService().findAll();
		return service.findAll();
	}

	
	//Get/users{id}
	//retrieveUser(int ID)
	@GetMapping(path="/user-by-id/{id}")
	public User getUserbyId(@PathVariable Integer id) 
	{
		return service.findOne(id);		
	}
	
	//HATEOAS Hypermedia as the engine of the application state
	@GetMapping(path="/users/{id}")
	public Resource<User>  retreivedUser(@PathVariable Integer id) 
	{
		//service.findOne(id);
		
		User user = service.findOne(id);
		if (user==null)
			throw new UserNotFoundException("id-"+id);
		
		//all users", SERVER_PATH + "/users"
		//retrieve ALL users
		Resource<User> resource = new Resource<User>(user);
		
		//enable us to create links from methods
		//ControllerLinkBuilder.linkTo(controller)
		 ControllerLinkBuilder linkto = linkTo(methodOn(this.getClass()).listofUsers());
		resource.add(linkto.withRel("all-users"));
		
		 //HATEOAS
		
		
			return resource;
	}
	
	@DeleteMapping(path="/usersDelete/{id}")
	public void deleteUser(@PathVariable Integer id) 
	{
		//service.findOne(id);		
		User user = service.deleteById(id);		
		
		if (user==null)
			throw new UserNotFoundException("id-"+id);		
			
	}
		
	
	//inpout - details of the users
	//output - CREATED and return the created URI
	//Proper response when someone create something
	//responseEntity is what we use to return a created a status
	//Request Body maps the objetc send in the URL to the object that is the parameter of the method
	@PostMapping (path = "/usersCreate")
	public  ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
			User savedUser =	service.save(user);				
			//CREATED
			// /user/{id} savedUser.getId()
			/*
			 * ServletUriComponentsBuilder
			.fromCurrentRequest()
			Estos dos me devuelven usersCreate			 * */			
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
				
				return ResponseEntity.created(location).build();
				
	}
	
	@PostMapping (path = "/usersPrueba")
	public  void createUserPrueba(@RequestBody User user) {
			User savedUser =	service.save(user);
								
	}
	
	
}
