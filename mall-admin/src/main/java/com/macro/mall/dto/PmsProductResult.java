package com.macro.mall.dto;

/**
 * Query the result returned when a single product is modified
 * Created by macro on 2018/4/26.
 */
public class PmsProductResult extends PmsProductParam {
    //The parent id of the selected category of the product
    private Long cateParentId;

    public Long getCateParentId() {
        return cateParentId;
    }

    public void setCateParentId(Long cateParentId) {
        this.cateParentId = cateParentId;
    }
}
