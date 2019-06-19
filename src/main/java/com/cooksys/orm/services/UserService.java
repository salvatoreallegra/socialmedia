package com.cooksys.orm.services;

import java.util.List;

import com.cooksys.orm.dto.UserRequestDto;
import com.cooksys.orm.dto.UserResponseDto;



public interface UserService {
	
	    List<UserResponseDto> getAllUsers();

	    UserResponseDto createUser(UserRequestDto userDto);
//
//	    UserResponseDto readCourse(Integer id);
//
//	    UserResponseDto updateCourse(Integer id, UserRequestDto courseDto);
//
//	    UserResponseDto deleteCourse(Integer id);

		


}
