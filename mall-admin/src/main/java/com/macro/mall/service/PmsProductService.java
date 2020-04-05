package com.macro.mall.service;

import com.macro.mall.dto.PmsProductParam;
import com.macro.mall.dto.PmsProductQueryParam;
import com.macro.mall.dto.PmsProductResult;
import com.macro.mall.model.PmsProduct;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Product Management Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductService {
    /**
     * Create product
     */
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int create(PmsProductParam productParam);

    /**
     * Get update information based on product number
     */
    PmsProductResult getUpdateInfo(Long id);

    /**
     * Update product
     */
    @Transactional
    int update(Long id, PmsProductParam productParam);

    /**
     * Query Products by Page
     */
    List<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum);

    /**
     * Bulk edit review status
     *
     * @param ids          Product id
     * @param verifyStatus Approval Status
     * @param detail       Audit details
     */
    @Transactional
    int updateVerifyStatus(List<Long> ids, Integer verifyStatus, String detail);

    /**
     * Bulk edit product listing status
     */
    int updatePublishStatus(List<Long> ids, Integer publishStatus);

    /**
     * Modify product recommendation status in bulk
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * Batch modify new product status
     */
    int updateNewStatus(List<Long> ids, Integer newStatus);

    /**
     * Delete products in bulk
     */
    int updateDeleteStatus(List<Long> ids, Integer deleteStatus);

    /**
     * Fuzzy query based on product name or article number
     */
    List<PmsProduct> list(String keyword);
}
