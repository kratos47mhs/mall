package com.macro.mall.dao;

import com.macro.mall.model.SmsCouponProductCategoryRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Customize the relationship between coupon and product classification
 * Created by macro on 2018/8/28.
 */
public interface SmsCouponProductCategoryRelationDao {
    /**
     * Bulk creation
     */
    int insertList(@Param("list")List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
