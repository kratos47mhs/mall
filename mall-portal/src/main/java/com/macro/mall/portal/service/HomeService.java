package com.macro.mall.portal.service;

import com.macro.mall.model.CmsSubject;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.PmsProductCategory;
import com.macro.mall.portal.domain.HomeContentResult;

import java.util.List;

/**
 * Home Content Management Service
 * Created by macro on 2019/1/28.
 */
public interface HomeService {

    /**
     * Get homepage content
     */
    HomeContentResult content();

    /**
     * Home Product Recommendation
     */
    List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum);

    /**
     * Get product categories
     * @param parentId 0: Obtain primary Category; Other: Obtain designated secondary Category
     */
    List<PmsProductCategory> getProductCateList(Long parentId);

    /**
     * Get the topic according to the topic Category page
     * @param cateId Thematic Category id
     */
    List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum);
}
