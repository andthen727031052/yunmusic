package com.yun.service.impl;

import com.yun.common.JsonBean;
import com.yun.dao.UserMusicMapper;
import com.yun.entity.UserMusic;
import com.yun.service.UserMusicService;
import com.yun.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMusicServiceImpl implements UserMusicService {
    @Autowired
    private UserMusicMapper userMusicDao;
    @Override
    public JsonBean addUserMusic(UserMusic userMusic) {
        return JsonUtils.createJsonBean(userMusicDao.insertSelective(userMusic)>0?1:0,null);
    }
}
