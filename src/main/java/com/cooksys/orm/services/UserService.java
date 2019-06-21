package com.cooksys.orm.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.orm.dto.UserRequestDto;
import com.cooksys.orm.dto.UserResponseDto;
import com.cooksys.orm.entity.TwitterUser;

public interface UserService {

	List<UserResponseDto> getAllUsers();

	UserResponseDto createUser(UserRequestDto userDto);

	UserResponseDto getUserByName(String name);

	UserResponseDto userNameExists(String name);

	UserResponseDto userNameAvailable(String userName);

}
