package com.macro.mall.service;

import com.macro.mall.model.SmsHomeBrand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Home Brand Management Service
 * Created by macro on 2018/11/6.
 */
public interface SmsHomeBrandService {
    /**
     * Add Home Brand Recommendation
     */
    @Transactional
    int create(List<SmsHomeBrand> homeBrandList);

    /**
     * Modify brand recommendation ranking
     */
    int updateSort(Long id, Integer sort);

    /**
     * Delete brand recommendations in bulk
     */
    int delete(List<Long> ids);

    /**
     * Update recommendation status
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * Query brand recommendations by page
     */
    List<SmsHomeBrand> list(String brandName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
