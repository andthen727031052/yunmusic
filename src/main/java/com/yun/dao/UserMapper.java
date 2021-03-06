package com.yun.dao;

import com.yun.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    // 根据用户名查询用户
    User selectByName(String name);

    // 根据用户ID查询用户数据
    User selectByUid(Integer uid);
}