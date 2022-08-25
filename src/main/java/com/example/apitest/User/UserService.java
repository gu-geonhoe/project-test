package com.example.apitest.User;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    public User createUser(User user){

        User createdUser = user;
        return createdUser;
    }
    public User updateUser(User user) {
        User updateUser = user;
        return updateUser;
    }

    public User findUser(long userId) {
      User user = new User(1L,"김코딩","kcd@gamil.com","123");
      return user;
    }

    public List<User> findUsers() {
        List<User> users = List.of(
                new User(1, "hgd@gmail.com", "홍길동", "5678"),
                new User(2, "lml@gmail.com", "이몽룡", "2222")

        );
        return users;
    }

    public void deleteUser(long userId) {

    }
}