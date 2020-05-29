package com.macro.mall.portal.dao;

import com.macro.mall.model.OmsOrderItem;
import com.macro.mall.portal.domain.OmsOrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Front Order Custom Dao
 * Created by macro on 2018/9/4.
 */
public interface PortalOrderDao {
    /**
     * Get order and order product details
     */
    OmsOrderDetail getDetail(@Param("orderId") Long orderId);

    /**
     * Modify the locked inventory and real inventory of pms_sku_stock table
     */
    int updateSkuStock(@Param("itemList") List<OmsOrderItem> orderItemList);

    /**
     * Get overtime orders
     * @param minute Time-out time (minutes)
     */
    List<OmsOrderDetail> getTimeOutOrders(@Param("minute") Integer minute);

    /**
     * Bulk edit order status
     */
    int updateOrderStatus(@Param("ids") List<Long> ids,@Param("status") Integer status);

    /**
     * Unlock inventory for cancelled orders
     */
    int releaseSkuStockLock(@Param("itemList") List<OmsOrderItem> orderItemList);

}
