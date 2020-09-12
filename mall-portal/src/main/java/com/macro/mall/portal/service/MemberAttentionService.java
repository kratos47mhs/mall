package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Member Brand Concern Management Service
 * Created by macro on 2018/8/2.
 */
public interface MemberAttentionService {
    /**
     * Add follow
     */
    int add(MemberBrandAttention memberBrandAttention);

    /**
     * Unsubscribe
     */
    int delete(Long brandId);

    /**
     * Get user watchlist
     */
    Page<MemberBrandAttention> list(Integer pageNum, Integer pageSize);

    /**
     * Get user attention details
     */
    MemberBrandAttention detail(Long brandId);

    /**
     * Clear watchlist
     */
    void clear();
}
