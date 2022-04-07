package com.jasper.mapstruct.dataobject;

import lombok.Data;

/**
 * @author jasper
 * @date 2022-04-07 14:30
 */
@Data
public class UserDO {

    /**
     * 用户编号
     **/
    private Integer id;
    /**
     * 用户名
     **/
    private String username;
    /**
     * 密码
     **/
    private String password;
}