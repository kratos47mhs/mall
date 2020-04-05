package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * User login parameters
 * Created by macro on 2018/4/26.
 */
public class UmsAdminLoginParam {
    @ApiModelProperty(value = "Username", required = true)
    @NotEmpty(message = "Username can not be empty")
    private String username;
    @ApiModelProperty(value = "Password", required = true)
    @NotEmpty(message = "Password can not be empty")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
