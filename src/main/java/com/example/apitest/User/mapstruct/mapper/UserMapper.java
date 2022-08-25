package com.example.apitest.User.mapstruct.mapper;

import com.example.apitest.User.User;
import com.example.apitest.User.UserPatchDto;
import com.example.apitest.User.UserPostDto;
import com.example.apitest.User.UserResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User userPostDtoToUser(UserPostDto userPostDto);
    User userPatchDtoToUser(UserPatchDto userPatchDto);
    UserResponseDto userToUserResponseDto(User user);
}
