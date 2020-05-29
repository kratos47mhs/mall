package com.macro.mall.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Request return parameters
 * Created by macro on 2018/10/17.
 */
@Getter
@Setter
public class OmsOrderReturnApplyParam {
    @ApiModelProperty("Order id")
    private Long orderId;
    @ApiModelProperty("Returned Product id")
    private Long productId;
    @ApiModelProperty("Order serial number")
    private String orderSn;
    @ApiModelProperty("Member username")
    private String memberUsername;
    @ApiModelProperty("Returnee's name")
    private String returnName;
    @ApiModelProperty("Returnee phone")
    private String returnPhone;
    @ApiModelProperty("product picture")
    private String productPic;
    @ApiModelProperty("product name")
    private String productName;
    @ApiModelProperty("product brand")
    private String productBrand;
    @ApiModelProperty("Merchandise sales attributes: color: red; size: xl;")
    private String productAttr;
    @ApiModelProperty("Quantity returned")
    private Integer productCount;
    @ApiModelProperty("Product price")
    private BigDecimal productPrice;
    @ApiModelProperty("The actual unit price of the product")
    private BigDecimal productRealPrice;
    @ApiModelProperty("Reason")
    private String reason;
    @ApiModelProperty("Description")
    private String description;
    @ApiModelProperty("Certificate pictures, separated by commas")
    private String proofPics;

}
