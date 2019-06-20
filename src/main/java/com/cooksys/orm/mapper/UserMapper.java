package com.cooksys.orm.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.cooksys.orm.dto.UserRequestDto;
import com.cooksys.orm.dto.UserResponseDto;
import com.cooksys.orm.entity.TwitterUser;


@Mapper(componentModel = "spring")
public interface UserMapper {

	TwitterUser dtoToEntity(UserRequestDto request);

	UserResponseDto entityToDto(TwitterUser user);

	List<UserResponseDto> entitiesToDtos(List<TwitterUser> users);

}
