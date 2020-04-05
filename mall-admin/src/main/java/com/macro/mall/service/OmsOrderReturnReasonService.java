package com.macro.mall.service;

import com.macro.mall.model.OmsOrderReturnReason;

import java.util.List;

/**
 * Order Reason Management Service
 * Created by macro on 2018/10/17.
 */
public interface OmsOrderReturnReasonService {
    /**
     * Add order reason
     */
    int create(OmsOrderReturnReason returnReason);

    /**
     * Modify the return reason
     */
    int update(Long id, OmsOrderReturnReason returnReason);

    /**
     * Bulk delete return reasons
     */
    int delete(List<Long> ids);

    /**
     * Get Return Reasons by Page
     */
    List<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum);

    /**
     * Bulk modify the return reason status
     */
    int updateStatus(List<Long> ids, Integer status);

    /**
     * Get detailed information about a single return reason
     */
    OmsOrderReturnReason getItem(Long id);
}
