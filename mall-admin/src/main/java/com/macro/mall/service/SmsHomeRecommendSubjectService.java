package com.macro.mall.service;

import com.macro.mall.model.SmsHomeRecommendSubject;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Homepage Special Recommendation Management Service
 * Created by macro on 2018/11/7.
 */
public interface SmsHomeRecommendSubjectService {
    /**
     * Add homepage recommendation
     */
    @Transactional
    int create(List<SmsHomeRecommendSubject> recommendSubjectList);

    /**
     * Modify recommendation ranking
     */
    int updateSort(Long id, Integer sort);

    /**
     * Delete recommendations in bulk
     */
    int delete(List<Long> ids);

    /**
     * Update recommendation status
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * Paging query recommendation
     */
    List<SmsHomeRecommendSubject> list(String subjectName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
