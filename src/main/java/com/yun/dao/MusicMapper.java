package com.yun.dao;

import com.yun.entity.Music;
import com.yun.vo.IndexMusicVo;
import com.yun.vo.MusicVo;

import java.util.List;

public interface MusicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Music record);

    int insertSelective(Music record);

    Music selectByPrimaryKey(Integer id);
    //通过id查找歌曲所有的相关信息
    MusicVo selectById(int id);

    int updateByPrimaryKeySelective(Music record);

    int updateByPrimaryKey(Music record);
    //根据歌单id查找包含的歌曲
    List<MusicVo> selectBySheetId(int id);

    // 随机查询歌曲
    List<IndexMusicVo> selectBySize(int size);

    // 查询新歌榜数据
    List<Music> selectNewMusic(int size);

    // 根据播放量降序查询(查询飙升榜)
    List<Music> selectHotMusic(int size);
    //根据用户id查询收藏的所有歌曲
    List<MusicVo> selectBYUid(int uid);
}