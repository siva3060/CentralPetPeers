package com.hcl.pp.controllers;

@RestController
public class UserController {


	@Autowired
	UserService userService

	//user registration
	public void registerUser(String userName,String userPassword){

			userService.registerTheUser(userName,userPassword);

	}
}
