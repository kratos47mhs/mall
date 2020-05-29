package com.macro.mall.portal.service;

import com.macro.mall.model.OmsCartItem;
import com.macro.mall.portal.domain.CartProduct;
import com.macro.mall.portal.domain.CartPromotionItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Shopping Cart Management Service
 * Created by macro on 2018/8/2.
 */
public interface OmsCartItemService {
    /**
     * Check if the product is included in the shopping cart, there is an increase in quantity, nothing is added to the shopping cart
     */
    @Transactional
    int add(OmsCartItem cartItem);

    /**
     * Get shopping cart list according to member number
     */
    List<OmsCartItem> list(Long memberId);

    /**
     * Get a list of shopping carts with information about promotions
     */
    List<CartPromotionItem> listPromotion(Long memberId);

    /**
     * Modify the number of items in a shopping cart
     */
    int updateQuantity(Long id, Long memberId, Integer quantity);

    /**
     * Bulk delete items in shopping cart
     */
    int delete(Long memberId,List<Long> ids);

    /**
     * Get product information for selecting product specifications in the shopping cart
     */
    CartProduct getCartProduct(Long productId);

    /**
     * Modify the specifications of the products in the shopping cart
     */
    @Transactional
    int updateAttr(OmsCartItem cartItem);

    /**
     * Empty shopping cart
     */
    int clear(Long memberId);
}
