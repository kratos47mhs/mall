package com.macro.mall.service;

import com.macro.mall.dto.UmsAdminParam;
import com.macro.mall.dto.UpdateAdminPasswordParam;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Background Administrator Service
 * Created by macro on 2018/4/26.
 */
public interface UmsAdminService {
    /**
     * Get background administrator based on user name
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * Registration function
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * Login function
     * @param username Username
     * @param password Password
     * @return The generated token of JWT
     */
    String login(String username,String password);

    /**
     * Refresh token function
     * @param oldToken Old token
     */
    String refreshToken(String oldToken);

    /**
     * Get user based on user id
     */
    UmsAdmin getItem(Long id);

    /**
     * Query users based on user name or nickname
     */
    List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * Modify specified user information
     */
    int update(Long id, UmsAdmin admin);

    /**
     * Delete the specified user
     */
    int delete(Long id);

    /**
     * Modify user role relationship
     */
    @Transactional
    int updateRole(Long adminId, List<Long> roleIds);

    /**
     * Get users for roles
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * Get the accessible resources of the specified user
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * change Password
     */
    int updatePassword(UpdateAdminPasswordParam updatePasswordParam);

    /**
     * Get user information
     */
    UserDetails loadUserByUsername(String username);
}
