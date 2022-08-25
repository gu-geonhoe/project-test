package com.example.apitest.User;


import com.sun.jdi.request.StepRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private long userId;
    private String userName;
    private String email;
    private String password;



}
