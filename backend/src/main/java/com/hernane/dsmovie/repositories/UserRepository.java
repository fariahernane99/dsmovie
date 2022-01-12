package com.hernane.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hernane.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
