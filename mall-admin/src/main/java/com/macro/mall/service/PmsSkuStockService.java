package com.macro.mall.service;

import com.macro.mall.model.PmsSkuStock;

import java.util.List;

/**
 * sku stock inventory management service
 * Created by macro on 2018/4/27.
 */
public interface PmsSkuStockService {
    /**
     * Fuzzy search based on product id and sku code
     */
    List<PmsSkuStock> getList(Long pid, String keyword);

    /**
     * Update product inventory information in bulk
     */
    int update(Long pid, List<PmsSkuStock> skuStockList);
}
