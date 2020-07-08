package com.macro.mall.portal.service;

import com.macro.mall.model.PmsProduct;
import com.macro.mall.portal.domain.PmsPortalProductDetail;
import com.macro.mall.portal.domain.PmsProductCategoryNode;

import java.util.List;

/**
 * Portal product management service
 * Created by macro on 2020/4/6.
 */
public interface PmsPortalProductService {
    /**
     * Comprehensive product search
     */
    List<PmsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * Get all product categories in a tree structure
     */
    List<PmsProductCategoryNode> categoryTreeList();

    /**
     * Get product details at the Portal
     */
    PmsPortalProductDetail detail(Long id);
}
