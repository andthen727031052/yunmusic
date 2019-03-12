package com.yun.service;

import com.yun.common.JsonBean;

public interface MusicService {

    JsonBean findById(int id);

    JsonBean findBySize(int size);

    JsonBean findHotMusicBySize(int size);
    JsonBean findNewMusicBySize(int szie);

    JsonBean findMusicBySheet(int id);
}
