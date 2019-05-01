package com.hcl.pp.services;

public class PetServiceImpl {



	@Autowired
	PetRepository petRepository;


	public void addPet(String petName,int petId,int petAge){

		petRepository.save(petName,petId,petAge);

	}
}
