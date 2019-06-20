package com.cooksys.orm.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.orm.dto.UserRequestDto;
import com.cooksys.orm.dto.UserResponseDto;
import com.cooksys.orm.mapper.UserMapper;
//import com.cooksys.orm.repository.ContextRepository;
//import com.cooksys.orm.repository.CredentialRepository;
//import com.cooksys.orm.repository.HashTagRepository;
////import com.cooksys.orm.repository.ProfileRepository;
//import com.cooksys.orm.repository.TweetRepository;
//import com.cooksys.orm.repository.UserRepository;
import com.cooksys.orm.services.UserService;



@Service("UserService")
public class UserServiceImpl implements UserService{
	
//	private UserRepository userRepository;
//	//private ProfileRepository profileRepository;
//	private TweetRepository tweetRepository;
//	//private ContextRepository contextRepository;
//	private HashTagRepository hashTagRepository;
//	//private CredentialRepository credentialsRepository;
//	
	
	UserMapper userMapper = new UserMapper();

	@Override
	public List<UserResponseDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserResponseDto createUser(UserRequestDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	 @Override
//	    public StudentResponseDto createStudent(StudentRequestDto studentDto) {
//	        return studentMapper.entityToDto(studentRepository.saveAndFlush(studentMapper.dtoToEntity(studentDto)));
//	    }
//	
	

}
