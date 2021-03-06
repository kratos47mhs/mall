package com.macro.mall.service;

import com.macro.mall.dto.*;
import com.macro.mall.model.OmsOrder;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Order Management Service
 * Created by macro on 2018/10/11.
 */
public interface OmsOrderService {
    /**
     * Order Tracking
     */
    List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * Bulk shipment
     */
    @Transactional
    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * Close orders in bulk
     */
    @Transactional
    int close(List<Long> ids, String note);

    /**
     * Bulk delete orders
     */
    int delete(List<Long> ids);

    /**
     * Get specific order details
     */
    OmsOrderDetail detail(Long id);

    /**
     * Modify order Receiver information
     */
    @Transactional
    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    /**
     * Modify order fee information
     */
    @Transactional
    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    /**
     * Modify order notes
     */
    @Transactional
    int updateNote(Long id, String note, Integer status);
}
