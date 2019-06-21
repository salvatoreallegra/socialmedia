package com.cooksys.orm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cooksys.orm.dto.UserResponseDto;
import com.cooksys.orm.entity.TwitterUser;

@Repository
public interface UserRepository extends JpaRepository<TwitterUser, Integer> {

	@Query(value = "SELECT * FROM twitter_user WHERE credential_user_name = ?1", nativeQuery = true)
	TwitterUser findByName(String name);

}
