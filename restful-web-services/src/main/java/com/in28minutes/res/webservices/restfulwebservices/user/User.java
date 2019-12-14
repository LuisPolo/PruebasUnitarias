package com.in28minutes.res.webservices.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {
	
	private Integer id;
	
	@Size(min=2, message = "Name has to have 2 character at least")
	private String name;
	
	@Past
	private Date birthDate;
	
	protected User() {}
	
	public User(Integer id, String name, Date date) {
		super();
			this.id = id;
			this.name = name;
			this.birthDate = date;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthName) {
		this.birthDate = birthName;
	}
	
	

}
