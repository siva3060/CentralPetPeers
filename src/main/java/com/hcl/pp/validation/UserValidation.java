

@service
public class UserValidate{

	@Autowired
	UserRepository userRepository;



	//validate the user
	//1. weather the user exist or not
	public void doesUserExist(@RequestBody UserValidationRequest userValidationRequest){

		//get record from the database
		User user = userRepository.findByUserId(userValidationRequest.getUserName());

		if(user 

		
		
		//end of the method doesUserExist
	}
}
