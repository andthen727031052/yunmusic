package com.yun.service.impl;

import com.yun.common.JsonBean;
import com.yun.dao.BigImgMapper;
import com.yun.service.BigImgService;
import com.yun.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BigImgServiceImpl implements BigImgService {
    @Autowired
    private BigImgMapper bigImgDao;


    @Override
    public JsonBean randSearch() {
        return JsonUtils.createJsonBean(1,bigImgDao.selectRand());
    }
}
