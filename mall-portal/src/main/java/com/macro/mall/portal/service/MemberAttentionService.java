package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;

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
    int delete(Long brandId);

    /**
     * Get user watchlist
     */
    Page<MemberBrandAttention> list(Integer pageNum, Integer pageSize);

    /**
     * 获取用户关注详情
     */
    MemberBrandAttention detail(Long brandId);

    /**
     * 清空关注列表
     */
    void clear();
}
