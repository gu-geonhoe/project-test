package com.example.apitest.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserResponseDto {
    private long userId;
    private String userName;
    private String email;
    private String password;
}
