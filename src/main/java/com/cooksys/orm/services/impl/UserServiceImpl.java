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
	
	public UserServiceImpl() {
		
	}

	public UserServiceImpl(UserMapper userMapper, UserRepository userRepository) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;

	}

	@Override
	public List<UserResponseDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserResponseDto createUser(UserRequestDto userDto) {
		return userMapper.entityToDto(userRepository.saveAndFlush(userMapper.dtoToEntity(userDto)));
	}

//	 @Override
//	    public StudentResponseDto createStudent(StudentRequestDto studentDto) {
//	        return studentMapper.entityToDto(studentRepository.saveAndFlush(studentMapper.dtoToEntity(studentDto)));
//	    }
//	

}