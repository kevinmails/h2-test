package com.imcbb.service;

import com.imcbb.dao.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;


    @Test
    void addUser() {


        userService.addUser(User.builder().userName("kevin").id(1).build());

    }

    @Test
    void getUser() {
        userService.getUser(1);
    }
}