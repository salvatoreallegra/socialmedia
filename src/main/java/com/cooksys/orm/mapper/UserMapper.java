package com.cooksys.orm.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.cooksys.orm.dto.UserRequestDto;
import com.cooksys.orm.dto.UserResponseDto;
import com.cooksys.orm.entity.TwitterUser;


public class UserMapper {
	
	@Mapper(componentModel = "spring")
	public interface StudentMapper {

	    TwitterUser dtoToEntity(UserRequestDto request);

	    UserResponseDto entityToDto(TwitterUser user);

	    List<UserResponseDto> entitiesToDtos(List<TwitterUser> users);
	}


}
