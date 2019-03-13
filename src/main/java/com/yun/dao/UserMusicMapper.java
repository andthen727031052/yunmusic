package com.yun.dao;

import com.yun.entity.UserMusic;
import org.apache.ibatis.annotations.Param;

public interface UserMusicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserMusic record);

    int insertSelective(UserMusic record);

    UserMusic selectByPrimaryKey(Integer id);
    //通过用户id和歌曲id查找关系
    UserMusic selectByInfo(@Param("uid") int uid, @Param("mid") int mid);

    int updateByPrimaryKeySelective(UserMusic record);

    int updateByPrimaryKey(UserMusic record);
}