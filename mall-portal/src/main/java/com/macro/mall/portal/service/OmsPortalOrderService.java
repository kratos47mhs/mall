package com.macro.mall.portal.service;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.portal.domain.ConfirmOrderResult;
import com.macro.mall.portal.domain.OmsOrderDetail;
import com.macro.mall.portal.domain.OrderParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Front Order Management Service
 * Created by macro on 2018/8/30.
 */
public interface OmsPortalOrderService {
    /**
     * Generate confirmation slip information based on user shopping cart information
     * @param cartIds
     */
    ConfirmOrderResult generateConfirmOrder(List<Long> cartIds);

    /**
     * Generate order based on submission information
     */
    @Transactional
    Map<String, Object> generateOrder(OrderParam orderParam);

    /**
     * Callback after successful payment
     */
    @Transactional
    Integer paySuccess(Long orderId, Integer payType);

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

    /**
     * Confirm order
     */
    void confirmReceiveOrder(Long orderId);

    /**
     * Get user orders by page
     */
    CommonPage<OmsOrderDetail> list(Integer status, Integer pageNum, Integer pageSize);

    /**
     * Get order details based on order ID
     */
    OmsOrderDetail detail(Long orderId);

    /**
     * The user deletes the order based on the order ID
     */
    void deleteOrder(Long orderId);
}
