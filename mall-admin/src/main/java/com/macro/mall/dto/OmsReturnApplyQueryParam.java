package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Order Return Apply Query parameters
 * Created by macro on 2018/10/18.
 */
@Getter
@Setter
public class OmsReturnApplyQueryParam {
    @ApiModelProperty("Service ticket number")
    private Long id;
    @ApiModelProperty(value = "Receiver name / number")
    private String receiverKeyword;
    @ApiModelProperty(value = "Application status: 0-> pending; 1-> return of goods; 2-> completed; 3-> rejected")
    private Integer status;
    @ApiModelProperty(value = "application time")
    private String createTime;
    @ApiModelProperty(value = "Handler")
    private String handleMan;
    @ApiModelProperty(value = "Processing time")
    private String handleTime;
}
