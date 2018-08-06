package com.springboot.count.usercount.dao;

import com.springboot.count.usercount.po.UserCount;

import java.util.List;

/**
 * @author chen1
 * @annotation:mapper
 * @create 2018-08-03 10:43
 **/
public interface UserCountMapper {
    //保存
    int save(UserCount userCount);
    //查询
    List<UserCount> selectAll();
    //更新
    int update(UserCount userCount);
    //主键查询
    UserCount selectByPk(int countId);

}

