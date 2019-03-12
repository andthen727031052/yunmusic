package com.yun.service;

import com.yun.common.JsonBean;
import com.yun.entity.User;

public interface UserService {

    // 登录
    JsonBean login(String name, String password);

    // 注册
    JsonBean addUser(User user);
}
