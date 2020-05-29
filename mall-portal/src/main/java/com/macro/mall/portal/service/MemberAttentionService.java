package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberBrandAttention;

import java.util.List;

/**
 * Members follow Service
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
    int delete(Long memberId, Long brandId);

    /**
     * Get user watchlist
     */
    List<MemberBrandAttention> list(Long memberId);
}
