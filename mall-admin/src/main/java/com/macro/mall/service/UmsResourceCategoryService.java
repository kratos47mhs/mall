package com.macro.mall.service;

import com.macro.mall.model.UmsResourceCategory;

import java.util.List;

/**
 * Background resource Category management service
 * Created by macro on 2020/2/5.
 */
public interface UmsResourceCategoryService {

    /**
     * Get all resource categories
     */
    List<UmsResourceCategory> listAll();

    /**
     * Create a resource Category
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * Modify resource Category
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * Delete resource Category
     */
    int delete(Long id);
}
