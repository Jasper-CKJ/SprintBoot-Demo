package com.jasper.mapstruct.bo;

import lombok.Data;

/**
 * @author jasper
 * @date 2022-04-07 14:27
 */
@Data
public class UserBO {
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
