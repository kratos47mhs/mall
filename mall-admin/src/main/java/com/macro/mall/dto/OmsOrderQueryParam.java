package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Order query parameters
 * Created by macro on 2018/10/11.
 */
@Getter
@Setter
public class OmsOrderQueryParam {
    @ApiModelProperty(value = "Order number")
    private String orderSn;
    @ApiModelProperty(value = "Receiver name / number")
    private String receiverKeyword;
    @ApiModelProperty(value = "Order status: 0-> pending payment; 1-> pending delivery; 2-> shipped; 3-> completed; 4-> closed; 5-> invalid order")
    private Integer status;
    @ApiModelProperty(value = "Order type: 0-> normal order; 1-> second order")
    private Integer orderType;
    @ApiModelProperty(value = "Order source: 0-> PC order; 1-> app order")
    private Integer sourceType;
    @ApiModelProperty(value = "Order submission time")
    private String createTime;
}
