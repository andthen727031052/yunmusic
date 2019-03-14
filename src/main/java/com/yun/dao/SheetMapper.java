package com.yun.dao;

import com.yun.entity.Sheet;

import java.util.List;

public interface SheetMapper {
    int deleteByPrimaryKey(Integer stid);

    int insert(Sheet record);

    int insertSelective(Sheet record);

    Sheet selectById(Integer stid);

    int updateByPrimaryKeySelective(Sheet record);

    int updateByPrimaryKey(Sheet record);

    //随机查找几个歌单
    List<Sheet> selectRandCount(int count);
}