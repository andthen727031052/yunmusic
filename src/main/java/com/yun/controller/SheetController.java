package com.yun.controller;

import com.yun.common.JsonBean;
import com.yun.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SheetController {
    @Autowired
    private SheetService sheetService;

    @RequestMapping("sheetlist.do")//获取指定数量的歌单列表
    public JsonBean randSheet(int count){
        return sheetService.randSearch(count);
    }

    @RequestMapping("sheetone.do")
    public JsonBean findSheetInfoByStid(int stid){
        return sheetService.findSheetInfoById(stid);
    }
}
