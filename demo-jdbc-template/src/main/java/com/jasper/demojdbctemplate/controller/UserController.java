package com.jasper.demojdbctemplate.controller;

import cn.hutool.core.lang.Dict;
import com.jasper.demojdbctemplate.entity.User;
import com.jasper.demojdbctemplate.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jasper
 * @date 2022-04-08 14:37
 */
@RestController
@Slf4j
public class UserController {
    @Autowired
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public Dict getUser(User user) {
        List<User> userList = userService.getUser(user);
        return Dict.create().set("code", 200).set("msg", "成功").set("data", userList);
    }
}