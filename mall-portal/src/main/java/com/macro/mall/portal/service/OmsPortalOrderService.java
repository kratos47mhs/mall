package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.ConfirmOrderResult;
import com.macro.mall.portal.domain.OrderParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * Front Order Management Service
 * Created by macro on 2018/8/30.
 */
public interface OmsPortalOrderService {
    /**
     * Generate confirmation slip information based on user shopping cart information
     */
    ConfirmOrderResult generateConfirmOrder();

    /**
     * Generate order based on submission information
     */
    @Transactional
    Map<String, Object> generateOrder(OrderParam orderParam);

    /**
     * Callback after successful payment
     */
    @Transactional
    Integer paySuccess(Long orderId);

    /**
     * Automatically cancel overtime orders
     */
    @Transactional
    Integer cancelTimeOutOrder();

    /**
     * Cancel a single overtime order
     */
    @Transactional
    void cancelOrder(Long orderId);

    /**
     * Send a delay message to cancel the order
     */
    void sendDelayMessageCancelOrder(Long orderId);
}
