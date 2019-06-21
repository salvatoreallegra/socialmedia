package com.cooksys.orm.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.cooksys.orm.dto.TweetRequestDto;
import com.cooksys.orm.dto.TweetResponseDto;
import com.cooksys.orm.dto.UserRequestDto;
import com.cooksys.orm.dto.UserResponseDto;
import com.cooksys.orm.entity.Tweet;
import com.cooksys.orm.entity.TwitterUser;

@Mapper(componentModel = "spring")
public interface TweetMapper {

	Tweet dtoToEntity(TweetRequestDto request);

	TweetResponseDto entityToDto(Tweet tweet);

	List<TweetResponseDto> entitiesToDtos(List<Tweet> tweets);

}
