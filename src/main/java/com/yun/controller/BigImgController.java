package com.yun.controller;

import com.yun.common.JsonBean;
import com.yun.service.BigImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BigImgController {
    @Autowired
    private BigImgService bigImgService;
    @RequestMapping("lunbo.do")
    public JsonBean lunbo(){
        return bigImgService.randSearch();
    }
}
