package com.macro.mall.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Attribute information corresponding to product Category
 * Created by macro on 2018/5/23.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ProductAttrInfo {
    @ApiModelProperty("商品属性ID")
    private Long attributeId;
    @ApiModelProperty("商品属性分类ID")
    private Long attributeCategoryId;
}
