package com.macro.mall.portal.service;

import com.macro.mall.model.SmsCouponHistory;
import com.macro.mall.portal.domain.CartPromotionItem;
import com.macro.mall.portal.domain.SmsCouponHistoryDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User Coupon Management Service
 * Created by macro on 2018/8/29.
 */
public interface UmsMemberCouponService {
    /**
     * Members add coupons
     */
    @Transactional
    void add(Long couponId);

    /**
     * Get a list of coupons
     * @param useStatus Coupon usage status
     */
    List<SmsCouponHistory> list(Integer useStatus);

    /**
     * Get available coupons based on shopping cart information
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);
}
