package com.yun.dao;

import com.yun.entity.BigImg;

import java.util.List;

public interface BigImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BigImg record);

    int insertSelective(BigImg record);

    BigImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BigImg record);

    int updateByPrimaryKey(BigImg record);
    //轮播图随机推荐
    List<BigImg> selectRand();
}