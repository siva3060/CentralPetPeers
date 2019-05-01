package com.hcl.pp.services;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserServices{
	@Autowired
	UserRepository userRepository;


	@Override
	public String login(int id) {
		
		return "sucess";
	}


	


	public void registerTheUser(String userName,String userPassword){

		userRepository.save(userName,userPassword);
	}





	@Override
	public String buyPet() {
		
		return "raja";
	}
}
