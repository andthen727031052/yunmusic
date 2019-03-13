package com.yun.service.impl;

import com.yun.common.JsonBean;
import com.yun.dao.UserMapper;
import com.yun.entity.User;
import com.yun.service.UserService;
import com.yun.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public JsonBean login(String name, String password) {
        if ((name != null) && (!name.equals("")) && (password != null) && (!password.equals(""))){
            User user = userDao.selectByName(name);
            if (user != null){
                String passwordT = user.getPassword();
                if (passwordT.equals(password)){
                    return JsonUtils.createJsonBean(1, "登录成功");
                }else {
                    return JsonUtils.createJsonBean(0, "用户名或密码错误");
                }
            }else{
                return JsonUtils.createJsonBean(0, "用户名或密码错误");
            }
        }
        return JsonUtils.createJsonBean(0, "用户名和密码不能为空");
    }

    @Override
    public JsonBean addUser(User user) {
        if ((user.getUname() != null) && (!user.getUname().equals("")) && (user.getPassword() != null) && (!user.getPassword().equals(""))) {
            try {
                User user1 = userDao.selectByName(user.getUname());
                if (user1 == null){
                    int num = userDao.insert(user);
                    if (num > 0){
                        return JsonUtils.createJsonBean(0, "注册成功");
                    }else {
                        return JsonUtils.createJsonBean(0, "注册失败");
                    }
                }
                return JsonUtils.createJsonBean(0, "用户名已存在，请重试");
            } catch (Exception e) {
                e.printStackTrace();
                return JsonUtils.createJsonBean(0, "注册失败");
            }
        }
        return JsonUtils.createJsonBean(0, "用户名和密码不能为空");
    }

    @Override
    public JsonBean updateUser(User user) {
        return JsonUtils.createJsonBean(userDao.updateByPrimaryKeySelective(user)>0?1:0,null);
    }
}
