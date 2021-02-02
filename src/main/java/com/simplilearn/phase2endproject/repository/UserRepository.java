package com.simplilearn.phase2endproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.simplilearn.phase2endproject.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	/**
	 * find the user with the specified username
	 * @param username
	 * @return the found user
	 */
	@Query("SELECT u FROM User u WHERE u.username = ?1")
	User findByUsername(String username);
}
