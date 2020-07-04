package com.macro.mall.dao;

import com.macro.mall.model.UmsAdminRoleRelation;
import com.macro.mall.model.UmsPermission;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Admin Role Relation management Dao
 * Created by macro on 2018/10/8.
 */
public interface UmsAdminRoleRelationDao {
    /**
     * Insert user role relationships in bulk
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * Get used for all roles
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * Get all user role permissions
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * Get all user permissions (including +- permissions)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

    /**
     * Get all user-accessible resources
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * Get a list of resource related user IDs
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);
}
