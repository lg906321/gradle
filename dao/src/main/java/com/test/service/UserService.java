package com.test.service;

import com.test.model.User;

import java.util.List;

public interface UserService {


    int add(User user);

    List<User> queryAll();

}
