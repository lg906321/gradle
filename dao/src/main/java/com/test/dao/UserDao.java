package com.test.dao;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.test.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserDao {

    private final Map<Integer, User> cache = Maps.newConcurrentMap();
    private final AtomicInteger gengerId = new AtomicInteger();

    public int add(User user) {
        int userId = gengerId.getAndIncrement();
        user.setUserId(userId);
        cache.put(userId, user);
        return 1;
    }

    public List<User> queryAll() {
        return Lists.newArrayList(cache.values());
    }

}