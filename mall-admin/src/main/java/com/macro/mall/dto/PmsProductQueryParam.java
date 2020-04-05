package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * Product query parameters
 * Created by macro on 2018/4/27.
 */
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

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}
