package com.cooksys.orm.services.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cooksys.orm.dto.UserRequestDto;
import com.cooksys.orm.dto.UserResponseDto;
import com.cooksys.orm.mapper.UserMapper;
import com.cooksys.orm.repository.UserRepository;
//import com.cooksys.orm.repository.ContextRepository;
//import com.cooksys.orm.repository.CredentialRepository;
//import com.cooksys.orm.repository.HashTagRepository;
////import com.cooksys.orm.repository.ProfileRepository;
//import com.cooksys.orm.repository.TweetRepository;
//import com.cooksys.orm.repository.UserRepository;
import com.cooksys.orm.services.UserService;


@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	private UserMapper userMapper;

//	public UserServiceImpl() {
//		
//	}

	public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;

	}

	@Override
	public List<UserResponseDto> getAllUsers() {
		return userMapper.entitiesToDtos(userRepository.findAll());
	}

	@Override
	public UserResponseDto createUser(UserRequestDto userDto) {

		return userMapper.entityToDto(userRepository.saveAndFlush(userMapper.dtoToEntity(userDto)));
	}

	@Override
	public UserResponseDto getUserByName(String name) {
		
		return userMapper.entityToDto(userRepository.findByName(name));
	}
	@Override
	public UserResponseDto userNameExists(String name) {
		
		return userMapper.entityToDto(userRepository.findByName(name));
	}
	
}
