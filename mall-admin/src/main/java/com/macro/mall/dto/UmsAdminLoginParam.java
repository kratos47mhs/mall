package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

/**
 * User login parameters
 * Created by macro on 2018/4/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsAdminLoginParam {
    @ApiModelProperty(value = "Username", required = true)
    @NotEmpty(message = "Username can not be empty")
    private String username;
    @ApiModelProperty(value = "Password", required = true)
    @NotEmpty(message = "Password can not be empty")
    private String password;
}
