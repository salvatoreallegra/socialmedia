package com.cooksys.orm.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.orm.dto.TweetRequestDto;
import com.cooksys.orm.dto.TweetResponseDto;
import com.cooksys.orm.dto.UserRequestDto;
import com.cooksys.orm.dto.UserResponseDto;
import com.cooksys.orm.services.TweetService;
import com.cooksys.orm.services.UserService;

@RestController
@RequestMapping(path = "/tweets")
public class TweetController {

	private TweetService tweetService;

	@PostMapping
	public TweetResponseDto createTweet(@RequestBody TweetRequestDto tweetDto) {
		return tweetService.createTweet(tweetDto);
	}
}
