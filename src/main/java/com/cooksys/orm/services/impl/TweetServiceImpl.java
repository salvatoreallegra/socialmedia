package com.cooksys.orm.services.impl;

import org.springframework.stereotype.Service;

import com.cooksys.orm.dto.TweetRequestDto;
import com.cooksys.orm.dto.TweetResponseDto;
import com.cooksys.orm.dto.UserRequestDto;
import com.cooksys.orm.dto.UserResponseDto;
import com.cooksys.orm.mapper.TweetMapper;
import com.cooksys.orm.mapper.UserMapper;
import com.cooksys.orm.repository.TweetRepository;
import com.cooksys.orm.repository.UserRepository;
import com.cooksys.orm.services.TweetService;

@Service
public class TweetServiceImpl implements TweetService {

	private TweetRepository tweetRepository;
	private TweetMapper tweetMapper;

	@Override
	public TweetResponseDto createTweet(TweetRequestDto tweetDto) {

		return tweetMapper.entityToDto(tweetRepository.saveAndFlush(tweetMapper.dtoToEntity(tweetDto)));

	}

}
