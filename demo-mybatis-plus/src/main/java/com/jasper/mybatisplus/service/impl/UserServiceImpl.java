package com.jasper.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jasper.mybatisplus.entity.User;
import com.jasper.mybatisplus.mapper.UserMapper;
import com.jasper.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author jasper
 * @date 2022-04-11 14:13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
