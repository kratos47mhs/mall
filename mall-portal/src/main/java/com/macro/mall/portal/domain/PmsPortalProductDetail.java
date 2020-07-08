package com.macro.mall.portal.domain;

import com.macro.mall.model.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Portal product details
 * Created by macro on 2020/4/6.
 */
@Getter
@Setter
public class PmsPortalProductDetail{
    @ApiModelProperty("Product Information")
    private PmsProduct product;
    @ApiModelProperty("Product Brand")
    private PmsBrand brand;
    @ApiModelProperty("Product Attributes and parameters")
    private List<PmsProductAttribute> productAttributeList;
    @ApiModelProperty("Product attributes and parameter values entered manually")
    private List<PmsProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("Product sku inventory information")
    private List<PmsSkuStock> skuStockList;
    @ApiModelProperty("Product ladder price setting")
    private List<PmsProductLadder> productLadderList;
    @ApiModelProperty("Product full price reduction setting")
    private List<PmsProductFullReduction> productFullReductionList;
    @ApiModelProperty("Available coupons")
    private List<SmsCoupon> couponList;
}
