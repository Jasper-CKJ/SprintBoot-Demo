package com.jasper.swagger.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author jasper
 * @date 2022-04-07 15:05
 */
@ApiModel("用户 VO")
public class UserVO {

    @ApiModelProperty(value = "用户编号", required = true, example = "1")
    private Integer id;
    @ApiModelProperty(value = "账号", required = true, example = "Jasper")
    private String username;

    public Integer getId() {
        return id;
    }

    public UserVO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserVO setUsername(String username) {
        this.username = username;
        return this;
    }

}