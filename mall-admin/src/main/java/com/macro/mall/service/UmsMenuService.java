package com.macro.mall.service;

import com.macro.mall.dto.UmsMenuNode;
import com.macro.mall.model.UmsMenu;

import java.util.List;

/**
 * Background Menu Management Service
 * Created by macro on 2020/2/2.
 */
public interface UmsMenuService {
    /**
     * Create background menu
     */
    int create(UmsMenu umsMenu);

    /**
     * Modify background menu
     */
    int update(Long id, UmsMenu umsMenu);

    /**
     * Get menu details by ID
     */
    UmsMenu getItem(Long id);

    /**
     * Delete menu by ID
     */
    int delete(Long id);

    /**
     * Pagination query background menu
     */
    List<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * Return all Menus in a hierarchical structure
     */
    List<UmsMenuNode> treeList();

    /**
     * Modify the menu display state
     */
    int updateHidden(Long id, Integer hidden);
}
