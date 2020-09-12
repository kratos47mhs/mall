package com.macro.mall.portal.service;

import com.macro.mall.model.OmsCartItem;
import com.macro.mall.portal.domain.CartPromotionItem;

import java.util.List;

/**
 * Promotion Management Service
 * Created by macro on 2018/8/27.
 */
public interface OmsPromotionService {
    /**
     * Calculate the promotion information in the shopping cart
     * @param cartItemList shopping cart
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
