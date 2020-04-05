package com.macro.mall.service;

import com.macro.mall.model.UmsMemberLevel;

import java.util.List;

/**
 * Member Level Management Service
 * Created by macro on 2018/4/26.
 */
public interface UmsMemberLevelService {
    /**
     * Get all member logins
     * @param defaultStatus Whether it is the default member
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
