package com.yun.service.impl;

import com.yun.common.JsonBean;
import com.yun.dao.SingerMapper;
import com.yun.service.SingerService;
import com.yun.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerDao;

    @Override
    public JsonBean findSingerBySize(int size) {
        return JsonUtils.createJsonBean(1, singerDao.selectBySize(size));
    }
}
