package com.hcl.pp.services;

public class UserServiceImpl {


	@Autowired
	UserRepository userRepository;



	public void registerTheUser(String userName,String userPassword){

		userRepository.save(userName,userPassword);
	}
}
