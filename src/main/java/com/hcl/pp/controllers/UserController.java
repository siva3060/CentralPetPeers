package com.hcl.pp.controllers;




public class UserController {


	@Autowired
	PetRepository petRepository;


	//get all pets
	public List getAllPetsOfUser(@PathId int userId){


		return petRepository.findAllPets();

	}

}
