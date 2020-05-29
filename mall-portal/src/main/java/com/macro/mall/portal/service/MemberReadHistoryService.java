package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberReadHistory;

import java.util.List;

/**
 * Member Browsing Record Management Service
 * Created by macro on 2018/8/3.
 */
public interface MemberReadHistoryService {
    /**
     * Generate browsing history
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * Delete browsing history in bulk
     */
    int delete(List<String> ids);

    /**
     * Get user browsing history
     */
    List<MemberReadHistory> list(Long memberId);
}
