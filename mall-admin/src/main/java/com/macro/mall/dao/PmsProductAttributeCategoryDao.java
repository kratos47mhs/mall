package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * Product Attribute Category Dao
 * Created by macro on 2018/5/24.
 */
public interface PmsProductAttributeCategoryDao {
    /**
     * Get Product Attribute Category with attributes
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
