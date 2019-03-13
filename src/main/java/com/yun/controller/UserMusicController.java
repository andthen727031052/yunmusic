package com.yun.controller;

import com.yun.common.JsonBean;
import com.yun.entity.UserMusic;
import com.yun.service.UserMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserMusicController {
    @Autowired
    private UserMusicService userMusicService;

    @RequestMapping("collect.do")
    public JsonBean collectMusic(UserMusic userMusic){
        return userMusicService.addUserMusic(userMusic);
    }


}
