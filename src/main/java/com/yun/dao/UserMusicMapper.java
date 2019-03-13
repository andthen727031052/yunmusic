package com.yun.dao;

import com.yun.entity.UserMusic;

public interface UserMusicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserMusic record);

    int insertSelective(UserMusic record);

    UserMusic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserMusic record);

    int updateByPrimaryKey(UserMusic record);
}