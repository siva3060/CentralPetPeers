

@service
public class UserValidate{

	@Autowired
	UserRepository userRepository;



	//validate the user
	//1. weather the user exist or not
	public boolean  doesUserExist(string userName){

		//get record from the database
		User user = userRepository.findUserByName(userValidationRequest.getUserName());

		if(user == Null){
			return false;	
		}else{
			return true;
		}
		
		//end of the method doesUserExist
	}


	//validate user and password
	public boolean isValidUser(@RequestBody UserValidationRequest userValidationRequest){

		//make sure user is there
		//if user exist match password
		//and return true

		User validateUser = userRepository.findUserByName(userValidateionRequest);
		if(doesUserExist(userValidationRequest.getUserName())){
		
			if(userValidationRequest.getUserPassword() == validateUser.getUserPassword()){
				return true;
			}else{
				return false;
			}
		}
	}
}
