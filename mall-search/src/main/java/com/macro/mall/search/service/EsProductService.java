package com.macro.mall.search.service;

import com.macro.mall.search.domain.EsProduct;
import com.macro.mall.search.domain.EsProductRelatedInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Product Search Management Service
 * Created by macro on 2018/6/19.
 */
public interface EsProductService {
    /**
     * Import all products from the database to ES
     */
    int importAll();

    /**
     * Delete product based on id
     */
    void delete(Long id);

    /**
     * Create product based on id
     */
    EsProduct create(Long id);

    /**
     * Delete products in bulk
     */
    void delete(List<Long> ids);

    /**
     * Search for names or subtitles based on keywords
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

    /**
     * Search name or subtitle compound query based on keywords
     */
    Page<EsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize,Integer sort);

    /**
     * Recommend related products based on product id
     */
    Page<EsProduct> recommend(Long id, Integer pageNum, Integer pageSize);

    /**
     * Get related brands, categories, attributes of search terms
     */
    EsProductRelatedInfo searchRelatedInfo(String keyword);
}
