package com.cooksys.orm.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.orm.dto.UserRequestDto;
import com.cooksys.orm.dto.UserResponseDto;
import com.cooksys.orm.entity.TwitterUser;
import com.cooksys.orm.services.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public List<UserResponseDto> getAllCourses() {
		return userService.getAllUsers();
	}

	@PostMapping
	public UserResponseDto createUser(@RequestBody UserRequestDto userDto) {
		return userService.createUser(userDto);
	}

	@GetMapping("/@{name}")
	public UserResponseDto getUserByName(@PathVariable String name) {
		return userService.getUserByName(name);
	}
	@GetMapping("/validate/username/available/@{userName}")
	public boolean userNameExists(@PathVariable String userName) {
		
		UserResponseDto nameExists = userService.userNameExists(userName);
		if(nameExists == null) {
			return false;
		}
		else {
			return true;
		}
			
		
	}

}
