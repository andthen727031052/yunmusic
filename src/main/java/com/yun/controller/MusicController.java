package com.yun.controller;

import com.yun.common.JsonBean;
import com.yun.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/music")
@RestController
@CrossOrigin
public class MusicController {

    @Autowired
    private MusicService musicService;

    @RequestMapping("/findmusic.do")
    public JsonBean findMusicById(int id){
        return musicService.findById(id);
    }

    @RequestMapping("/findmusicsize.do")
    public JsonBean findMusicBySize(int size){
        return musicService.findBySize(size);
    }

    @RequestMapping("/findnewmusic.do")
    public JsonBean findNewMUsicBySize(int size){
        return musicService.findNewMusicBySize(size);
    }

    @RequestMapping("/listonesheet.do")
    public JsonBean findBySheet(int id){
        return musicService.findMusicBySheet(id);
    }

    @RequestMapping("/findhotmusic.do")
    public JsonBean findHotMusicBySize(int size){
        return musicService.findHotMusicBySize(size);
    }

    @RequestMapping("findmusicbyuid.do")
    public JsonBean findMusicByUid(int uid){
        return musicService.findByUser(uid);
    }
}
