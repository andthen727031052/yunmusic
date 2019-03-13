package com.yun.controller;

import com.yun.common.JsonBean;
import com.yun.service.SingerService;
import com.yun.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/singer")
@RestController
@CrossOrigin
public class SingerController {

    @Autowired
    private SingerService singerService;

    @RequestMapping("/findbysize.do")
    public JsonBean findSingerBySize(int size){
        return JsonUtils.createJsonBean(1, singerService.findSingerBySize(size));
    }
}
