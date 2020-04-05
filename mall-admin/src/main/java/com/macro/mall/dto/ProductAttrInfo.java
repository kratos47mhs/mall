package com.macro.mall.dto;


/**
 * Attribute information corresponding to product Category
 * Created by macro on 2018/5/23.
 */
public class ProductAttrInfo {
    private Long attributeId;
    private Long attributeCategoryId;

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public Long getAttributeCategoryId() {
        return attributeCategoryId;
    }

    public void setAttributeCategoryId(Long attributeCategoryId) {
        this.attributeCategoryId = attributeCategoryId;
    }
}
