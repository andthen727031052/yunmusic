package com.yun.service.impl;

import com.yun.common.JsonBean;
import com.yun.dao.SheetMapper;
import com.yun.service.SheetService;
import com.yun.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SheetServiceImpl implements SheetService {
    @Autowired
    private SheetMapper sheetDao;
    @Override
    public JsonBean randSearch(int count) {
        return JsonUtils.createJsonBean(1,sheetDao.selectRandCount(count));
    }

    @Override
    public JsonBean findSheetInfoById(int stid) {
        return JsonUtils.createJsonBean(1, sheetDao.selectById(stid));
    }
}
