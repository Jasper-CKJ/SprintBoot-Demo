package com.jasper.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author jasper
 * @date 2022-04-07 15:05
 */
@ApiModel("用户更新 DTO")
public class UserUpdateDTO {

    @ApiModelProperty(value = "用户编号", required = true, example = "1")
    private Integer id;
    @ApiModelProperty(value = "账号", required = true, example = "jasper")
    private String username;
    @ApiModelProperty(value = "密码", required = true, example = "123456")
    private String password;

    public Integer getId() {
        return id;
    }

    public UserUpdateDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserUpdateDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserUpdateDTO setPassword(String password) {
        this.password = password;
        return this;
    }

}