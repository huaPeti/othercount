package com.springboot.count.usercount.service.impl;

import com.springboot.count.usercount.dao.UserCountMapper;
import com.springboot.count.usercount.po.UserCount;
import com.springboot.count.usercount.service.UserCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chen1
 * @annotation:实现
 * @create 2018-08-03 10:45
 **/
@Service
public class UserCountServiceImpl implements UserCountService {
    @Autowired
    private UserCountMapper userCountMapper;

    @Override
    public boolean save(UserCount userCount) {
        boolean saveFlag = false;
        int a = userCountMapper.save(userCount);
        if(a>0){
            saveFlag= true;
        }
        return saveFlag;
    }

    @Override
    public List<UserCount> findAll() {
        List<UserCount> userCounts = userCountMapper.selectAll();
        return userCounts;
    }

    @Override
    public boolean update(UserCount userCount) {
        boolean updateFlag = false;
        int a = userCountMapper.update(userCount);
        if(a>0){
            updateFlag= true;
        }
        return updateFlag;
    }

}

