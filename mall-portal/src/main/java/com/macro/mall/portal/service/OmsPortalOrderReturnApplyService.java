package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * Portal order return management Service
 * Created by macro on 2018/10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * submit application
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
