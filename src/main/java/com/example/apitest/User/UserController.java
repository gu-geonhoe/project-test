package com.example.apitest.User;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")  //유저 관련 모든 페이지
public class UserController {
private final UserService userService;
private final UserMapper mapper;

    public UserController(UserService userService, UserMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @PostMapping("/logout")  //로그아웃
    public ResponseEntity logOut(){

        return null;
    }

    @PostMapping("/signup")  //회원 가입
    public ResponseEntity signup(@Valid @RequestBody UserPostDto userPostDto){
        User user = mapper.UserPostDtoToUser(userPostDto);

        User response = userService.createUser(user);
        return new ResponseEntity<>(mapper.UserResponseDtoToUser(response), HttpStatus.CREATED);

    }

    @GetMapping("/{user-id}")//회원 정보 조회
    public ResponseEntity userInfo(@PathVariable("user-id") long userId){

        User response = userService.findUser(userId);


        return new ResponseEntity<>(mapper.UserResponseDtoToUser(response), HttpStatus.OK);
    }

    @PatchMapping("/edit/{user-id}")  //회원 정보 수정
    public ResponseEntity userEdit(@PathVariable("user-id")long userId, @Valid @RequestBody UserPatchDto userPatchDto){
        userPatchDto.setUserId(userId);


        User response = userService.updateUser(mapper.UserPatchDtoToUser(userPatchDto));
        return new ResponseEntity<>(mapper.UserResponseDtoToUser(response), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{user-id}")  //회원 삭제
    public ResponseEntity userDelete(@PathVariable("user-id") long userId){

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
