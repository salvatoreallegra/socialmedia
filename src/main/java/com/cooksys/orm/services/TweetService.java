package com.cooksys.orm.services;

import com.cooksys.orm.dto.TweetRequestDto;
import com.cooksys.orm.dto.TweetResponseDto;
import com.cooksys.orm.dto.UserRequestDto;
import com.cooksys.orm.dto.UserResponseDto;

public interface TweetService {

	TweetResponseDto createTweet(TweetRequestDto tweetDto);

}
