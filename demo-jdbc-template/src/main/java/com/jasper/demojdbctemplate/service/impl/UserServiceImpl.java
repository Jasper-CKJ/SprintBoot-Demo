package com.jasper.demojdbctemplate.service.impl;

import com.jasper.demojdbctemplate.dao.UserDao;
import com.jasper.demojdbctemplate.entity.User;
import com.jasper.demojdbctemplate.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * User Service Implement
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-10-15 13:53
 */
@Service
public class UserServiceImpl implements IUserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 获取用户列表
     *
     * @param user 用户实体
     * @return 用户列表
     */
    @Override
    public List<User> getUser(User user) {
        return userDao.findByExample(user);
    }
}
