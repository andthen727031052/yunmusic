package com.yun.service;

import com.yun.common.JsonBean;
import com.yun.entity.User;

import javax.servlet.http.HttpSession;

public interface UserService {

    // 登录
    JsonBean login(String name, String password, HttpSession session);

    // 注册
    JsonBean addUser(User user);

    // 根据ID查询用户数据
    JsonBean findUserInfoByUid(Integer uid);
}
