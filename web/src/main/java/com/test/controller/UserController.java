package com.test.controller;


import com.test.model.User;
import com.test.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/test")
    public String test() {

        System.out.println(userService);
        return "hello";
    }


    @PutMapping(value = "/")
    public User add(@RequestBody User user) {
        userService.add(user);
        return user;
    }

    @GetMapping(value = "/")
    public List<User> list (){
        return userService.queryAll();
    }


}