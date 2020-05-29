package com.macro.mall.portal.component;

import com.macro.mall.portal.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by macro on 2018/8/24.
 * Order timeout cancels and unlocks the stock timer
 */
@Component
public class OrderTimeOutCancelTask {
    private Logger LOGGER =LoggerFactory.getLogger(OrderTimeOutCancelTask.class);
    @Autowired
    private OmsPortalOrderService portalOrderService;

    /**
     * cron expression：Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * Scan every 10 minutes, scan the order placed before the set timeout, and cancel the order if no payment is made
     */
    @Scheduled(cron = "0 0/10 * ? * ?")
    private void cancelTimeOutOrder(){
        Integer count = portalOrderService.cancelTimeOutOrder();
        LOGGER.info("Cancel the order, and release the locked inventory based on the sku number, cancel the order quantity: {}",count);
    }
}
