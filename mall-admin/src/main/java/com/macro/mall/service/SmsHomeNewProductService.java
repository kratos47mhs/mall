package com.macro.mall.service;

import com.macro.mall.model.SmsHomeNewProduct;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Home New Product Management Service
 * Created by macro on 2018/11/6.
 */
public interface SmsHomeNewProductService {
    /**
     * Add homepage recommendation
     */
    @Transactional
    int create(List<SmsHomeNewProduct> homeNewProductList);

    /**
     * Modify recommendation ranking
     */
    int updateSort(Long id, Integer sort);

    /**
     * Delete recommendations in bulk
     */
    int delete(List<Long> ids);

    /**
     * Update recommendation status
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * Paging query recommendation
     */
    List<SmsHomeNewProduct> list(String productName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
