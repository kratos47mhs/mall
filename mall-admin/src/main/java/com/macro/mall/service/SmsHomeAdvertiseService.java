package com.macro.mall.service;

import com.macro.mall.model.SmsHomeAdvertise;

import java.util.List;

/**
 * Homepage Advertising Management Service
 * Created by macro on 2018/11/7.
 */
public interface SmsHomeAdvertiseService {
    /**
     * Add ad
     */
    int create(SmsHomeAdvertise advertise);

    /**
     * Delete ads in bulk
     */
    int delete(List<Long> ids);

    /**
     * Modify the online and offline status
     */
    int updateStatus(Long id, Integer status);

    /**
     * Get ad details
     */
    SmsHomeAdvertise getItem(Long id);

    /**
     * Update ads
     */
    int update(Long id, SmsHomeAdvertise advertise);

    /**
     * Pagination query ads
     */
    List<SmsHomeAdvertise> list(String name, Integer type, String endTime, Integer pageSize, Integer pageNum);
}
