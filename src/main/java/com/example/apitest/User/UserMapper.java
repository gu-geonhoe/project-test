package com.example.apitest.User;

import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User UserPostDtoToUser(UserPostDto userPostDto){
        return new User(0L,userPostDto.getUserName(), userPostDto.getEmail(), userPostDto.getPassword());
    }

    public User UserPatchDtoToUser(UserPatchDto userPatchDto){
        return new User(userPatchDto.getUserId(), userPatchDto.getUserName(),null, userPatchDto.getPassword());
    }

    public UserResponseDto UserResponseDtoToUser(User user){
        return new UserResponseDto(user.getUserId(),user.getUserName(),user.getEmail(),user.getPassword());
    }
}
