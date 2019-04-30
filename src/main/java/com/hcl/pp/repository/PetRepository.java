package com.hcl.pp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.pp.Models.Pet;

public interface PetRepository extends JpaRepository<Pet,Integer> {


	@Query(value = "select * from pet where userId = petOwnerId",nativeQuery = true)
	List<Pet> findAllPets(Integer userId);
}
