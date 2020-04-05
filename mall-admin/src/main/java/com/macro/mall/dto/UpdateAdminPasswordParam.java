package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * Modify username and password parameters
 * Created by macro on 2019/10/9.
 */
@Getter
@Setter
public class UpdateAdminPasswordParam {
    @ApiModelProperty(value = "Username", required = true)
    @NotEmpty(message = "Username can not be empty")
    private String username;
    @ApiModelProperty(value = "Old Password", required = true)
    @NotEmpty(message = "Old password cannot be empty")
    private String oldPassword;
    @ApiModelProperty(value = "New Password", required = true)
    @NotEmpty(message = "The new password cannot be empty")
    private String newPassword;
}
