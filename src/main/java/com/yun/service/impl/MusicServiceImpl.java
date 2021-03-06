package com.yun.service.impl;

import com.yun.common.JsonBean;
import com.yun.dao.MusicMapper;
import com.yun.service.MusicService;
import com.yun.util.JsonUtils;
import com.yun.vo.MusicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicMapper musicDao;


    @Override
    public JsonBean findById(int id) {
        return JsonUtils.createJsonBean(1,musicDao.selectById(id));
    }

    @Override
    public JsonBean findBySize(int size) {
        return JsonUtils.createJsonBean(1, musicDao.selectBySize(size));
    }

    @Override
    public JsonBean findNewMusicBySize(int size) {
        return JsonUtils.createJsonBean(1, musicDao.selectNewMusic(size));
    }

    @Override
    public JsonBean findHotMusicBySize(int size) {
        return JsonUtils.createJsonBean(1, musicDao.selectHotMusic(size));
    }

    @Override
    public JsonBean findMusicBySheet(int id) {
        return JsonUtils.createJsonBean(1,musicDao.selectBySheetId(id));
    }

    @Override
    public JsonBean findByUser(int uid) {
        return JsonUtils.createJsonBean(1,musicDao.selectBYUid(uid));
    }

    @Override
    public JsonBean search(String name) {
        List<MusicVo> list = musicDao.selectByMusicName(name);
        if (list.size() != 0){
            return JsonUtils.createJsonBean(1, list);
        }else{
            return JsonUtils.createJsonBean(0, "没有搜索到，换个关键字试试吧");
        }

    }
}
