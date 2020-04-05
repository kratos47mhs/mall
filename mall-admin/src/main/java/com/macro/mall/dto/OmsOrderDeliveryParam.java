package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Order shipping parameters
 * Created by macro on 2018/10/12.
 */
@Getter
@Setter
public class OmsOrderDeliveryParam {
    @ApiModelProperty("Order ID")
    private Long orderId;
    @ApiModelProperty("Delivery Company")
    private String deliveryCompany;
    @ApiModelProperty("delivery number")
    private String deliverySn;
}
