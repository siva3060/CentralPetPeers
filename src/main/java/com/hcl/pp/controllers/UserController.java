package com.hcl.pp.controllers;

<<<<<<< HEAD
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.pp.services.UserServices;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServices userService;
	@GetMapping("/login")
	public String login( int id) {
		
		return  userService.login(id);
		

@RestController
public class UserController {


	@Autowired
	UserService userService

	//user registration
	public void registerUser(String userName,String userPassword){

			userService.registerTheUser(userName,userPassword);


	}
}
