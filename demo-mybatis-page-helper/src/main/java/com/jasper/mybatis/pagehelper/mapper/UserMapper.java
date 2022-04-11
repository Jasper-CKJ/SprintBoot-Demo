package com.jasper.mybatis.pagehelper.mapper;

import com.jasper.mybatis.pagehelper.entity.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author jasper
 * @date 2022-04-11 11:41
 */
@Component
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
}

