package com.cooksys.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooksys.orm.entity.TwitterUser;

@Repository
public interface UserRepository extends JpaRepository<TwitterUser,Integer> {
	
}
