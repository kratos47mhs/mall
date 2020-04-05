package com.macro.mall.service;

import com.macro.mall.dto.PmsProductAttributeCategoryItem;
import com.macro.mall.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * Product attribute category
 * Created by macro on 2018/4/26.
 */
public interface PmsProductAttributeCategoryService {
    /**
     * Create attribute category
     */
    int create(String name);

    /**
     * Modify attribute category
     */
    int update(Long id, String name);

    /**
     * Delete attribute category
     */
    int delete(Long id);

    /**
     * Get attribute category details
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * Paged query attribute category
     */
    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    /**
     * Get attribute category with attributes
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
