package com.macro.mall.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Parameters passed in when generating the order
 * Created by macro on 2018/8/30.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderParam {
    @ApiModelProperty("Delivery address ID")
    private Long memberReceiveAddressId;
    @ApiModelProperty("Coupon ID")
    private Long couponId;
    @ApiModelProperty("Integration used")
    private Integer useIntegration;
    @ApiModelProperty("payment method")
    private Integer payType;
    @ApiModelProperty("Product ID of the selected shopping cart")
    private List<Long> cartIds;
}
