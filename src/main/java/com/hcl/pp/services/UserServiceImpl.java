package com.hcl.pp.services;

public class UserServiceImpl implements UserServices{

	@Override
	public String login(int id) {
		
		return "sucess";
	}


	@Autowired
	UserRepository userRepository;



	public void registerTheUser(String userName,String userPassword){

		userRepository.save(userName,userPassword);
	}
}
