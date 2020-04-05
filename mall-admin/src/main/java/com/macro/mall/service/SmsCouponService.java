package com.macro.mall.service;

import com.macro.mall.dto.SmsCouponParam;
import com.macro.mall.model.SmsCoupon;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Coupon Management Service
 * Created by macro on 2018/8/28.
 */
public interface SmsCouponService {
    /**
     * Add coupon
     */
    @Transactional
    int create(SmsCouponParam couponParam);

    /**
     * Delete coupon based on coupon id
     */
    @Transactional
    int delete(Long id);

    /**
     * Update coupon information based on coupon id
     */
    @Transactional
    int update(Long id, SmsCouponParam couponParam);

    /**
     * Get a list of coupons by page
     */
    List<SmsCoupon> list(String name, Integer type, Integer pageSize, Integer pageNum);

    /**
     * Get coupon details
     *
     * @param id Coupon table id
     */
    SmsCouponParam getItem(Long id);
}
