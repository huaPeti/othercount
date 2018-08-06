package com.springboot.count.usercount.service;

import com.springboot.count.usercount.po.UserCount;

import java.util.List;

public interface UserCountService {
    boolean save(UserCount userCount);

    List<UserCount> findAll();

    boolean update(UserCount userCount);
}
