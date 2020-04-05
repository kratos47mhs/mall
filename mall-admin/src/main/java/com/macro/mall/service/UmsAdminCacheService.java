package com.macro.mall.service;

import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsResource;

import java.util.List;

/**
 * Admin cache operation class
 * Created by macro on 2020/3/13.
 */
public interface UmsAdminCacheService {
    /**
     * Delete Admin cache
     */
    void delAdmin(Long adminId);

    /**
     * Delete Admin resource list cache
     */
    void delResourceList(Long adminId);

    /**
     * Delete the relevant Admin cache when the role-related resource information changes
     */
    void delResourceListByRole(Long roleId);

    /**
     * Delete the relevant admin cache when the role-related resource information changes
     */
    void delResourceListByRoleIds(List<Long> roleIds);

    /**
     * When the resource information changes, delete the resource user admin cache
     */
    void delResourceListByResource(Long resourceId);

    /**
     * Get cached user information
     */
    UmsAdmin getAdmin(String username);

    /**
     * Set to cache admin information
     */
    void setAdmin(UmsAdmin admin);

    /**
     * Get a list of cached admin resources
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * Set the background and admin resource list
     */
    void setResourceList(Long adminId, List<UmsResource> resourceList);
}
