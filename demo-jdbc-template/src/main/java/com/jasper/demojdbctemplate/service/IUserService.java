package com.jasper.demojdbctemplate.service;

import com.jasper.demojdbctemplate.entity.User;

import java.util.List;

/**
 * <p>
 * User Service
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-10-15 13:51
 */
public interface IUserService {

    /**
     * 获取用户列表
     *
     * @param user 用户实体
     * @return 用户列表
     */
    List<User> getUser(User user);

}
