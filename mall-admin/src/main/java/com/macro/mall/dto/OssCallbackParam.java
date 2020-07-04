package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Callback parameters after successful upload of oss
 * Created by macro on 2018/5/17.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OssCallbackParam {
    @ApiModelProperty("Requested callback address")
    private String callbackUrl;
    @ApiModelProperty("The callback is the parameter passed in the request")
    private String callbackBody;
    @ApiModelProperty("The format of the parameters passed in during the callback")
    private String callbackBodyType;
}
