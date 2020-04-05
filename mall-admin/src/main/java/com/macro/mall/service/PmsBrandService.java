package com.macro.mall.service;

import com.macro.mall.dto.PmsBrandParam;
import com.macro.mall.model.PmsBrand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Product brand Service
 * Created by macro on 2018/4/26.
 */
public interface PmsBrandService {
    /**
     * Get all brands
     */
    List<PmsBrand> listAllBrand();

    /**
     * Create a brand
     */
    int createBrand(PmsBrandParam pmsBrandParam);

    /**
     * Edit brand
     */
    @Transactional
    int updateBrand(Long id, PmsBrandParam pmsBrandParam);

    /**
     * Remove brand
     */
    int deleteBrand(Long id);

    /**
     * Delete brands in bulk
     */
    int deleteBrand(List<Long> ids);

    /**
     * Query brand by page
     */
    List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize);

    /**
     * Get a brand
     */
    PmsBrand getBrand(Long id);

    /**
     * Modify display status
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * Modify the manufacturer's status
     */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
