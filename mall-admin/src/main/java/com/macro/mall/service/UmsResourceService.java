package com.macro.mall.service;

import com.macro.mall.model.UmsResource;

import java.util.List;

/**
 * Background Resource Management Service
 * Created by macro on 2020/2/2.
 */
public interface UmsResourceService {
    /**
     * 添加资源Add resources
     */
    int create(UmsResource umsResource);

    /**
     * Modify resources
     */
    int update(Long id, UmsResource umsResource);

    /**
     * Get resource details
     */
    UmsResource getItem(Long id);

    /**
     * Delete resource
     */
    int delete(Long id);

    /**
     * 分页查询资源
     */
    List<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);

    /**
     * 查询全部资源
     */
    List<UmsResource> listAll();
}
