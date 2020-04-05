package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * User login parameters
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class UmsAdminParam {
    @ApiModelProperty(value = "Username", required = true)
    @NotEmpty(message = "Username can not be empty")
    private String username;
    @ApiModelProperty(value = "Password", required = true)
    @NotEmpty(message = "Password can not be empty")
    private String password;
    @ApiModelProperty(value = "Profile Picture")
    private String icon;
    @ApiModelProperty(value = "Email")
    @Email(message = "Email format is illegal")
    private String email;
    @ApiModelProperty(value = "User's Nickname")
    private String nickName;
    @ApiModelProperty(value = "Note")
    private String note;
}
