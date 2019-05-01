package com.hcl.pp.controllers;

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

	@Autowired
	PerService petService;
	
	@GetMapping("/login")
	public String login( int id) {
		
		return  userService.login(id);
		
	}


	// Hiii my name is charan

	public void newpets(){
		System.out.PrintLn();
	}
	//user registration
	public void registerUser(String userName,String userPassword){

			userService.registerTheUser(userName,userPassword);


	}
	public String  buyPet() {
		return "string";
	}

	
	//get pet details
	public list<pets> getPetDetails(int petId){

		return petRepository.findAllByPetId(petId);
	}



	//adding a pet to repository
	public class addPet(Sting petName,int petId,int petAge){

		petService.addThePet(petName,petId,petAge);

	}


}
