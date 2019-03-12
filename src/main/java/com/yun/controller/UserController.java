package com.yun.controller;

import com.yun.common.JsonBean;
import com.yun.entity.User;
import com.yun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login.do")
    public JsonBean login(String uname, String password){
        return userService.login(uname, password);
    }

    @PostMapping("adduser.do")
    public JsonBean addUser(User user){
        return userService.addUser(user);
    }
}
