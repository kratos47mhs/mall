package com.macro.mall.dao;

import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Admin user role custom Dao
 * Created by macro on 2020/2/2.
 */
public interface UmsRoleDao {
    /**
     * Get the menu based on the Admin user ID
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);
    /**
     * Get menu based on character ID
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);
    /**
     * Get resources based on role ID
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
