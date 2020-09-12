package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Member product collection management Service
 * Created by macro on 2018/8/2.
 */
public interface MemberCollectionService {
    /**
     * Add to Favorites
     */
    int add(MemberProductCollection productCollection);

    /**
     * Delete favorites
     */
    int delete(Long productId);

    /**
     * Pagination query collection
     */
    Page<MemberProductCollection> list(Integer pageNum, Integer pageSize);

    /**
     * View collection details
     */
    MemberProductCollection detail(Long productId);

    /**
     * Empty collection
     */
    void clear();
}
