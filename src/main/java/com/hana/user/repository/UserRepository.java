package com.hana.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hana.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<UserRepository, Long> 
{
	@Query("SELECT u from UserRepository u where u.user_name=:userName")
	Optional<User> getUserByUsername(@Param("userName") String userName);
	
}
