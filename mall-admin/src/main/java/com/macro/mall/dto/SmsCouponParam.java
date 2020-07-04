package com.macro.mall.dto;

import com.macro.mall.model.SmsCoupon;
import com.macro.mall.model.SmsCouponProductCategoryRelation;
import com.macro.mall.model.SmsCouponProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Coupon information package, including bound Products and bound Categories
 * Created by macro on 2018/8/28.
 */
public class SmsCouponParam extends SmsCoupon {
    //Coupon-bound products
    @Getter
    @Setter
    @ApiModelProperty("Coupon-bound products")
    private List<SmsCouponProductRelation> productRelationList;
    //Coupon-bound product category
    @Getter
    @Setter
    @ApiModelProperty("Coupon-bound product categories")
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;
}
