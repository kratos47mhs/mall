package com.macro.mall.dao;

import com.macro.mall.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User Admin Permission Relation Dao
 * Created by macro on 2018/10/8.
 */
public interface UmsAdminPermissionRelationDao {
    /**
     * Bulk creation
     */
    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
