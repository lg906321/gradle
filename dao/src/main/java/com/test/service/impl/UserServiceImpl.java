package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.model.User;
import com.test.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;


    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }
}