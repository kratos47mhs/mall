package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Product query parameters
 * Created by macro on 2018/4/27.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductQueryParam {
    @ApiModelProperty("Publish Status")
    private Integer publishStatus;
    @ApiModelProperty("Approval Status")
    private Integer verifyStatus;
    @ApiModelProperty("Product name fuzzy keywords")
    private String keyword;
    @ApiModelProperty("Product Serial Number")
    private String productSn;
    @ApiModelProperty("Product Category ID")
    private Long productCategoryId;
    @ApiModelProperty("Product brand ID")
    private Long brandId;
}
