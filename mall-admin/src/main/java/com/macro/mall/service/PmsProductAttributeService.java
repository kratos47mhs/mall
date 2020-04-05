package com.macro.mall.service;

import com.macro.mall.dto.PmsProductAttributeParam;
import com.macro.mall.dto.ProductAttrInfo;
import com.macro.mall.model.PmsProductAttribute;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Product attribute Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductAttributeService {
    /**
     * Obtain product attributes based on category paging
     * @param cid Category id
     * @param type 0-> Attribute; 2-> Parameter
     */
    List<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum);

    /**
     * Add product attributes
     */
    @Transactional
    int create(PmsProductAttributeParam pmsProductAttributeParam);

    /**
     * Edit product attributes
     */
    int update(Long id, PmsProductAttributeParam productAttributeParam);

    /**
     * Get attribute information of a single product
     */
    PmsProductAttribute getItem(Long id);

    @Transactional
    int delete(List<Long> ids);

    List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId);
}
