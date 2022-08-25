package com.example.apitest.User;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UserPatchDto {
    @NotBlank(message = "공백 불가")
    private long userId;
    @NotBlank(message = "공백 불가")
    private String userName;
    @NotBlank(message = "공백 불가")
    private String password;
}
